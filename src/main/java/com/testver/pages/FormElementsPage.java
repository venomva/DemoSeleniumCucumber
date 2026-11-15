package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Form Elements module.
 */
public class FormElementsPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    // Tabs
    private static final By TAB_INPUTS = By.cssSelector("[data-testid='tab-inputs']");
    private static final By TAB_CHOICES = By.cssSelector("[data-testid='tab-choices']");
    private static final By TAB_PICKERS = By.cssSelector("[data-testid='tab-pickers']");
    private static final By TAB_DYNAMIC = By.cssSelector("[data-testid='tab-dynamic']");
    private static final By TAB_VALIDATION = By.cssSelector("[data-testid='tab-validation']");

    // Standard inputs
    private static final By TEXT_INPUT = By.cssSelector("[data-testid='input-text']");
    private static final By EMAIL_INPUT = By.cssSelector("[data-testid='input-email']");
    private static final By PASSWORD_INPUT = By.cssSelector("[data-testid='input-password']");
    private static final By NUMBER_INPUT = By.cssSelector("[data-testid='input-number']");
    private static final By TEL_INPUT = By.cssSelector("[data-testid='input-tel']");
    private static final By URL_INPUT = By.cssSelector("[data-testid='input-url']");
    private static final By SEARCH_INPUT = By.cssSelector("[data-testid='input-search']");
    private static final By TEXTAREA = By.cssSelector("[data-testid='input-textarea']");
    private static final By READONLY_INPUT = By.cssSelector("[data-testid='input-readonly']");
    private static final By DISABLED_INPUT = By.cssSelector("[data-testid='input-disabled']");

    // Submit & Reset
    private static final By SUBMIT_BUTTON = By.cssSelector("[data-testid='submit-inputs']");
    private static final By RESET_BUTTON = By.cssSelector("[data-testid='reset-inputs']");

    public FormElementsPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "forms");
        actions.waitForPageLoad();
    }

    public void clickTabInputs() { actions.click(TAB_INPUTS); }
    public void clickTabChoices() { actions.click(TAB_CHOICES); }
    public void clickTabPickers() { actions.click(TAB_PICKERS); }
    public void clickTabDynamic() { actions.click(TAB_DYNAMIC); }
    public void clickTabValidation() { actions.click(TAB_VALIDATION); }

    public void enterText(String text) { actions.type(TEXT_INPUT, text); }
    public void enterEmail(String email) { actions.type(EMAIL_INPUT, email); }
    public void enterPassword(String password) { actions.type(PASSWORD_INPUT, password); }
    public void enterNumber(String number) { actions.type(NUMBER_INPUT, number); }
    public void enterTel(String tel) { actions.type(TEL_INPUT, tel); }
    public void enterUrl(String url) { actions.type(URL_INPUT, url); }
    public void enterSearch(String query) { actions.type(SEARCH_INPUT, query); }
    public void enterTextarea(String text) { actions.type(TEXTAREA, text); }

    public boolean isReadonlyDisplayed() { return actions.isDisplayed(READONLY_INPUT); }
    public boolean isDisabledDisplayed() { return actions.isDisplayed(DISABLED_INPUT); }
    public String getReadonlyValue() { return actions.getAttribute(READONLY_INPUT, "value"); }

    public void clickSubmit() { actions.click(SUBMIT_BUTTON); }
    public void clickReset() { actions.click(RESET_BUTTON); }
}
