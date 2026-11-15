package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for the Testver Playground Homepage.
 */
public class HomePage {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    private final WebDriver driver;
    private final BrowserActions actions;

    // Locators
    private static final By HEADING = By.cssSelector("h1");
    private static final By SEARCH_INPUT = By.cssSelector("[data-testid='global-search-input']");
    private static final By BRAND_LINK = By.linkText("Testver Playground");
    private static final By SIGN_IN_LINK = By.linkText("Sign in");
    private static final By THEME_TOGGLE = By.cssSelector("[data-testid='theme-toggle']");
    private static final By RESET_BUTTON = By.cssSelector("[data-testid='reset-state']");
    private static final By MODULE_AUTHENTICATION = By.linkText("Authentication");
    private static final By MODULE_FORM_ELEMENTS = By.linkText("Form Elements");
    private static final By MODULE_BUTTONS = By.linkText("Buttons & Interactions");
    private static final By MODULE_TABLES = By.linkText("Tables & Grids");
    private static final By MODULE_TABS = By.linkText("Tabs & Accordions");
    private static final By MODULE_LOADERS = By.linkText("Loaders & Waits");
    private static final By MODULE_AJAX = By.linkText("AJAX & API");
    private static final By MODULE_REALTIME = By.linkText("Real-time / WS");
    private static final By MODULE_FILE_UPLOAD = By.linkText("File Upload / Download");
    private static final By MODULE_MODALS = By.linkText("Modals, Alerts, Toasts");
    private static final By MODULE_IFRAMES = By.linkText("iFrames & Windows");
    private static final By MODULE_DRAG_DROP = By.linkText("Drag & Drop");
    private static final By MODULE_SHADOW_DOM = By.linkText("Shadow DOM");
    private static final By MODULE_CANVAS = By.linkText("Canvas & SVG");
    private static final By MODULE_SHOP = By.linkText("E-commerce Flow");
    private static final By MODULE_ADMIN = By.linkText("Admin Dashboard");
    private static final By MODULE_LOCATORS = By.linkText("Locator Challenges");
    private static final By MODULE_EDGE = By.linkText("Edge Cases");
    private static final By MODULE_I18N = By.linkText("i18n & RTL");
    private static final By MODULE_ACCESSIBILITY = By.linkText("Accessibility");
    private static final By MODULE_API_DOCS = By.linkText("API Docs");
    private static final By MODULE_STATE_INSPECTOR = By.linkText("State Inspector");

    public HomePage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl());
        actions.waitForPageLoad();
    }

    public String getHeadingText() {
        return actions.getText(HEADING);
    }

    public String getPageTitle() {
        return actions.getPageTitle();
    }

    public boolean isSearchInputDisplayed() {
        return actions.isDisplayed(SEARCH_INPUT);
    }

    public String getSearchPlaceholder() {
        return actions.getAttribute(SEARCH_INPUT, "placeholder");
    }

    public boolean isBrandLinkDisplayed() {
        return actions.isDisplayed(BRAND_LINK);
    }

    public boolean isSignInLinkDisplayed() {
        return actions.isDisplayed(SIGN_IN_LINK);
    }

    public boolean isThemeToggleDisplayed() {
        return actions.isDisplayed(THEME_TOGGLE);
    }

    public boolean isResetButtonDisplayed() {
        return actions.isDisplayed(RESET_BUTTON);
    }

    public boolean isModuleDisplayed(String moduleName) {
        By moduleLocator = By.linkText(moduleName);
        return actions.isDisplayed(moduleLocator, 5);
    }

    public int getModuleCount() {
        // Count all module links (exclude nav links: brand, sign in, home)
        return actions.findElements(By.cssSelector("a[href^='/']")).size();
    }

    public void searchFor(String query) {
        actions.type(SEARCH_INPUT, query);
    }

    public void clickSignIn() {
        actions.click(SIGN_IN_LINK);
    }

    public void clickModule(String moduleName) {
        actions.click(By.linkText(moduleName));
    }
}
