package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Edge Cases module.
 */
public class EdgePage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By STALE_BTN = By.cssSelector("[data-testid='stale-btn']");
    private static final By SCROLLED_BTN = By.cssSelector("[data-testid='scrolled-btn']");
    private static final By UNDER_STICKY_BTN = By.cssSelector("[data-testid='under-sticky-btn']");
    private static final By ANIM_BTN = By.cssSelector("[data-testid='anim-btn']");
    private static final By FAKE_ENABLED = By.cssSelector("[data-testid='fake-enabled']");
    private static final By AUTO_INPUT = By.cssSelector("[data-testid='auto-input']");
    private static final By OPEN_LOCKING_MODAL = By.cssSelector("[data-testid='open-locking-modal']");

    public EdgePage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "edge");
        actions.waitForPageLoad();
    }

    public void clickStaleButton() { actions.click(STALE_BTN); }
    public void clickScrolledButton() { actions.click(SCROLLED_BTN); }
    public void clickUnderSticky() { actions.click(UNDER_STICKY_BTN); }
    public void clickAnimateToggle() { actions.click(ANIM_BTN); }
    public void clickOpenLockingModal() { actions.click(OPEN_LOCKING_MODAL); }
}
