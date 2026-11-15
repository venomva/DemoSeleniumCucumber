package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Real-time / WebSocket module.
 */
public class RealtimePage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By CNT_INC = By.cssSelector("[data-testid='cnt-inc']");
    private static final By CNT_DEC = By.cssSelector("[data-testid='cnt-dec']");
    private static final By CNT_RESET = By.cssSelector("[data-testid='cnt-reset']");
    private static final By CHAT_USER = By.cssSelector("[data-testid='chat-user']");
    private static final By CHAT_TEXT = By.cssSelector("[data-testid='chat-text']");
    private static final By CHAT_SEND = By.cssSelector("[data-testid='chat-send']");

    public RealtimePage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "realtime");
        actions.waitForPageLoad();
    }

    public void clickIncrement() { actions.click(CNT_INC); }
    public void clickDecrement() { actions.click(CNT_DEC); }
    public void clickReset() { actions.click(CNT_RESET); }

    public void setChatUser(String name) { actions.type(CHAT_USER, name); }
    public void typeChatMessage(String message) { actions.type(CHAT_TEXT, message); }
    public void clickSend() { actions.click(CHAT_SEND); }
}
