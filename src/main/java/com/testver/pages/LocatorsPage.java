package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Locator Challenges module.
 */
public class LocatorsPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By STABLE_INPUT = By.cssSelector("[data-testid='stable-input']");
    private static final By STABLE_BTN = By.cssSelector("[data-testid='stable-btn']");
    private static final By DEEP_BTN = By.cssSelector("[data-testid='deep-btn']");
    private static final By VISIBLE_SUBMIT = By.cssSelector("[data-testid='visible-submit']");
    private static final By COVERED_BTN = By.cssSelector("[data-testid='covered-btn']");

    public LocatorsPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "locators");
        actions.waitForPageLoad();
    }

    public void clickStableButton() { actions.click(STABLE_BTN); }
    public void clickDeepButton() { actions.click(DEEP_BTN); }
    public void clickVisibleSubmit() { actions.click(VISIBLE_SUBMIT); }
}
