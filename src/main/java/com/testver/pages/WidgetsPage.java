package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Tabs & Accordions module.
 */
public class WidgetsPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    // Horizontal tabs
    private static final By TAB_OVERVIEW = By.cssSelector("[data-testid='lt-tab-1']");
    private static final By TAB_STATISTICS = By.cssSelector("[data-testid='lt-tab-2']");
    private static final By TAB_REVIEWS = By.cssSelector("[data-testid='lt-tab-3']");
    private static final By TAB_SETTINGS = By.cssSelector("[data-testid='lt-tab-4']");

    // Accordion
    private static final By ACC_1 = By.cssSelector("[data-testid='acc-1']");
    private static final By ACC_2 = By.cssSelector("[data-testid='acc-2']");
    private static final By ACC_3 = By.cssSelector("[data-testid='acc-3']");

    // Mega menu
    private static final By MEGA_TRIGGER = By.cssSelector("[data-testid='mega-trigger']");

    // Vertical tabs
    private static final By VTAB_PROFILE = By.cssSelector("[data-testid='vtab-1']");
    private static final By VTAB_SECURITY = By.cssSelector("[data-testid='vtab-2']");
    private static final By VTAB_NOTIFICATIONS = By.cssSelector("[data-testid='vtab-3']");
    private static final By VTAB_BILLING = By.cssSelector("[data-testid='vtab-4']");

    public WidgetsPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "widgets");
        actions.waitForPageLoad();
    }

    public void clickOverview() { actions.click(TAB_OVERVIEW); }
    public void clickStatistics() { actions.click(TAB_STATISTICS); }
    public void clickReviews() { actions.click(TAB_REVIEWS); }
    public void clickSettings() { actions.click(TAB_SETTINGS); }

    public void clickAccordion1() { actions.click(ACC_1); }
    public void clickAccordion2() { actions.click(ACC_2); }
    public void clickAccordion3() { actions.click(ACC_3); }

    public void clickMegaMenu() { actions.click(MEGA_TRIGGER); }

    public void clickVtabProfile() { actions.click(VTAB_PROFILE); }
    public void clickVtabSecurity() { actions.click(VTAB_SECURITY); }
    public void clickVtabNotifications() { actions.click(VTAB_NOTIFICATIONS); }
    public void clickVtabBilling() { actions.click(VTAB_BILLING); }
}
