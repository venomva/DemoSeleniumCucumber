package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for iFrames & Windows module.
 */
public class FramesPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By OPEN_POPUP = By.cssSelector("[data-testid='open-popup']");

    public FramesPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "frames");
        actions.waitForPageLoad();
    }

    public void clickOpenPopup() { actions.click(OPEN_POPUP); }
}
