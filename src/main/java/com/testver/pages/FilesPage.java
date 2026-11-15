package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for File Operations module.
 */
public class FilesPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By SINGLE_FILE_INPUT = By.cssSelector("[data-testid='single-file']");
    private static final By MULTI_FILE_INPUT = By.cssSelector("[data-testid='multi-file']");
    private static final By SINGLE_UPLOAD_BTN = By.cssSelector("[data-testid='single-upload']");
    private static final By MULTI_UPLOAD_BTN = By.cssSelector("[data-testid='multi-upload']");

    public FilesPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "files");
        actions.waitForPageLoad();
    }

    public void clickSingleUpload() { actions.click(SINGLE_UPLOAD_BTN); }
    public void clickMultiUpload() { actions.click(MULTI_UPLOAD_BTN); }
}
