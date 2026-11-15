package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for AJAX & API module.
 */
public class AjaxPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By BTN_GET = By.cssSelector("[data-testid='ajax-get']");
    private static final By BTN_POST = By.cssSelector("[data-testid='ajax-post']");
    private static final By BTN_PUT = By.cssSelector("[data-testid='ajax-put']");
    private static final By BTN_DELETE = By.cssSelector("[data-testid='ajax-delete']");
    private static final By BTN_SLOW = By.cssSelector("[data-testid='slow-btn']");
    private static final By ERR_400 = By.cssSelector("[data-testid='err-400']");
    private static final By ERR_401 = By.cssSelector("[data-testid='err-401']");
    private static final By ERR_404 = By.cssSelector("[data-testid='err-404']");
    private static final By ERR_500 = By.cssSelector("[data-testid='err-500']");
    private static final By ERR_503 = By.cssSelector("[data-testid='err-503']");
    private static final By RACE_BTN = By.cssSelector("[data-testid='race-btn']");
    private static final By SSE_START = By.cssSelector("[data-testid='sse-start']");
    private static final By SSE_STOP = By.cssSelector("[data-testid='sse-stop']");

    public AjaxPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "ajax");
        actions.waitForPageLoad();
    }

    public void clickGet() { actions.click(BTN_GET); }
    public void clickPost() { actions.click(BTN_POST); }
    public void clickPut() { actions.click(BTN_PUT); }
    public void clickDelete() { actions.click(BTN_DELETE); }
    public void clickSlow() { actions.click(BTN_SLOW); }
    public void clickError400() { actions.click(ERR_400); }
    public void clickError401() { actions.click(ERR_401); }
    public void clickError404() { actions.click(ERR_404); }
    public void clickError500() { actions.click(ERR_500); }
    public void clickError503() { actions.click(ERR_503); }
    public void clickRace() { actions.click(RACE_BTN); }
    public void clickSseStart() { actions.click(SSE_START); }
    public void clickSseStop() { actions.click(SSE_STOP); }
}
