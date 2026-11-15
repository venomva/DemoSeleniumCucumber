package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Authentication module (Login, Signup, Forgot Password).
 */
public class LoginPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    // Login page locators
    private static final By USERNAME_INPUT = By.cssSelector("[data-testid='username-input']");
    private static final By PASSWORD_INPUT = By.cssSelector("[data-testid='password-input']");
    private static final By REMEMBER_CHECKBOX = By.cssSelector("[data-testid='remember-checkbox']");
    private static final By LOGIN_SUBMIT = By.cssSelector("[data-testid='login-submit']");
    private static final By FORGOT_PASSWORD_LINK = By.linkText("Forgot password?");
    private static final By CREATE_ACCOUNT_LINK = By.linkText("Create an account");
    private static final By LOGIN_HEADING = By.cssSelector("h1");

    // Signup page locators
    private static final By FULLNAME_INPUT = By.cssSelector("[data-testid='fullname-input']");
    private static final By SIGNUP_USERNAME_INPUT = By.cssSelector("[data-testid='username-input']");
    private static final By EMAIL_INPUT = By.cssSelector("[data-testid='email-input']");
    private static final By SIGNUP_PASSWORD_INPUT = By.cssSelector("[data-testid='password-input']");
    private static final By CONFIRM_PASSWORD_INPUT = By.cssSelector("[data-testid='confirm-input']");
    private static final By AGREE_CHECKBOX = By.cssSelector("[data-testid='agree-checkbox']");
    private static final By SIGNUP_SUBMIT = By.cssSelector("[data-testid='signup-submit']");
    private static final By SIGNUP_HEADING = By.cssSelector("h1");

    // Forgot password page locators
    private static final By FORGOT_EMAIL_INPUT = By.cssSelector("[data-testid='email-input']");
    private static final By FORGOT_SUBMIT = By.cssSelector("[data-testid='forgot-submit']");
    private static final By BACK_TO_LOGIN_LINK = By.linkText("← Back to login");
    private static final By FORGOT_HEADING = By.cssSelector("h1");

    public LoginPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    // === Login ===
    public void navigateToLogin() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "auth/login");
        actions.waitForPageLoad();
    }

    public String getLoginHeading() {
        return actions.getText(LOGIN_HEADING);
    }

    public void enterUsername(String username) {
        actions.type(USERNAME_INPUT, username);
    }

    public void enterPassword(String password) {
        actions.type(PASSWORD_INPUT, password);
    }

    public void checkRememberMe() {
        actions.click(REMEMBER_CHECKBOX);
    }

    public void clickSignIn() {
        actions.click(LOGIN_SUBMIT);
    }

    public void loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickSignIn();
    }

    public void clickForgotPassword() {
        actions.click(FORGOT_PASSWORD_LINK);
    }

    public void clickCreateAccount() {
        actions.click(CREATE_ACCOUNT_LINK);
    }

    // === Signup ===
    public void navigateToSignup() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "auth/signup");
        actions.waitForPageLoad();
    }

    public String getSignupHeading() {
        return actions.getText(SIGNUP_HEADING);
    }

    public void enterFullName(String fullName) {
        actions.type(FULLNAME_INPUT, fullName);
    }

    public void enterSignupUsername(String username) {
        actions.type(SIGNUP_USERNAME_INPUT, username);
    }

    public void enterEmail(String email) {
        actions.type(EMAIL_INPUT, email);
    }

    public void enterSignupPassword(String password) {
        actions.type(SIGNUP_PASSWORD_INPUT, password);
    }

    public void enterConfirmPassword(String password) {
        actions.type(CONFIRM_PASSWORD_INPUT, password);
    }

    public void checkAgreeTerms() {
        actions.click(AGREE_CHECKBOX);
    }

    public void clickCreateAccountButton() {
        actions.click(SIGNUP_SUBMIT);
    }

    // === Forgot Password ===
    public void navigateToForgotPassword() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "auth/forgot");
        actions.waitForPageLoad();
    }

    public String getForgotHeading() {
        return actions.getText(FORGOT_HEADING);
    }

    public void enterForgotEmail(String email) {
        actions.type(FORGOT_EMAIL_INPUT, email);
    }

    public void clickSendResetLink() {
        actions.click(FORGOT_SUBMIT);
    }

    public void clickBackToLogin() {
        actions.click(BACK_TO_LOGIN_LINK);
    }
}
