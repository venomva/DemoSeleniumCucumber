package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Loaders & Waits module.
 */
public class DynamicPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By DELAY_INPUT = By.cssSelector("[data-testid='delay-input']");
    private static final By START_SPINNER = By.cssSelector("[data-testid='start-spinner']");
    private static final By SKEL_LOAD = By.cssSelector("[data-testid='skel-load']");
    private static final By LATE_TRIGGER = By.cssSelector("[data-testid='late-trigger']");
    private static final By DISAPPEAR_TRIGGER = By.cssSelector("[data-testid='disappear-trigger']");
    private static final By PROG_START = By.cssSelector("[data-testid='prog-start']");

    public DynamicPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "dynamic");
        actions.waitForPageLoad();
    }

    public void setDelayMs(String ms) { actions.type(DELAY_INPUT, ms); }
    public void clickStartSpinner() { actions.click(START_SPINNER); }
    public void clickLoadSkeleton() { actions.click(SKEL_LOAD); }
    public void clickLateTrigger() { actions.click(LATE_TRIGGER); }
    public void clickDisappearTrigger() { actions.click(DISAPPEAR_TRIGGER); }
    public void clickProgressStart() { actions.click(PROG_START); }
}
