package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Canvas & SVG module.
 */
public class CanvasPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By CANVAS_COLOR = By.cssSelector("[data-testid='canvas-color']");
    private static final By CANVAS_CLEAR = By.cssSelector("[data-testid='canvas-clear']");
    private static final By CANVAS_SAVE = By.cssSelector("[data-testid='canvas-save']");
    private static final By SIG_CLEAR = By.cssSelector("[data-testid='sig-clear']");
    private static final By SIG_CONFIRM = By.cssSelector("[data-testid='sig-confirm']");

    public CanvasPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "canvas");
        actions.waitForPageLoad();
    }

    public void clickCanvasClear() { actions.click(CANVAS_CLEAR); }
    public void clickCanvasSave() { actions.click(CANVAS_SAVE); }
    public void clickSigClear() { actions.click(SIG_CLEAR); }
    public void clickSigConfirm() { actions.click(SIG_CONFIRM); }
}
