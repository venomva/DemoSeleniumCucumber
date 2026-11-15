package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Buttons & Interactions module.
 */
public class ButtonsPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By BTN_SINGLE = By.cssSelector("[data-testid='btn-single']");
    private static final By BTN_DOUBLE = By.cssSelector("[data-testid='btn-double']");
    private static final By BTN_RIGHT = By.cssSelector("[data-testid='btn-right']");
    private static final By BTN_LONG = By.cssSelector("[data-testid='btn-long']");
    private static final By BTN_HOVER = By.cssSelector("[data-testid='btn-hover']");
    private static final By BTN_LOADING = By.cssSelector("[data-testid='btn-loading']");
    private static final By BTN_DELAYED = By.cssSelector("[data-testid='btn-delayed']");
    private static final By BTN_TOGGLE = By.cssSelector("[data-testid='btn-toggle']");
    private static final By BG_LEFT = By.cssSelector("[data-testid='bg-left']");
    private static final By BG_MID = By.cssSelector("[data-testid='bg-mid']");
    private static final By BG_RIGHT = By.cssSelector("[data-testid='bg-right']");
    private static final By ICON_FAVORITE = By.cssSelector("[data-testid='icon-favorite']");

    // Result display areas
    private static final By CLICK_RESULT = By.cssSelector("[data-testid='click-result']");
    private static final By HOVER_TOOLTIP = By.cssSelector("[data-testid='hover-tooltip']");
    private static final By TOGGLE_STATE = By.cssSelector("[data-testid='toggle-state']");

    public ButtonsPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "elements");
        actions.waitForPageLoad();
    }

    public void clickSingle() { actions.click(BTN_SINGLE); }
    public void clickDouble() { actions.click(BTN_DOUBLE); }
    public void clickRight() { actions.click(BTN_RIGHT); }
    public void clickLong() { actions.click(BTN_LONG); }
    public void hoverOver() { actions.scrollToElement(BTN_HOVER); actions.click(BTN_HOVER); }
    public void clickLoading() { actions.click(BTN_LOADING); }
    public void clickToggle() { actions.click(BTN_TOGGLE); }
    public void clickBgLeft() { actions.click(BG_LEFT); }
    public void clickBgMid() { actions.click(BG_MID); }
    public void clickBgRight() { actions.click(BG_RIGHT); }
    public void clickIconFavorite() { actions.click(ICON_FAVORITE); }

    public boolean isDelayedButtonDisabled() { return !actions.isEnabled(BTN_DELAYED); }
    public String getClickResult() { return actions.getText(CLICK_RESULT); }
    public String getToggleState() { return actions.getText(TOGGLE_STATE); }
}
