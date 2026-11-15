package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Shadow DOM module.
 */
public class ShadowDomPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    public ShadowDomPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "shadow");
        actions.waitForPageLoad();
    }
}
