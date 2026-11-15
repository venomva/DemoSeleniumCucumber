package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Modals, Alerts & Toasts module.
 */
public class DialogsPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By ALERT_BTN = By.cssSelector("[data-testid='alert-btn']");
    private static final By CONFIRM_BTN = By.cssSelector("[data-testid='confirm-btn']");
    private static final By PROMPT_BTN = By.cssSelector("[data-testid='prompt-btn']");
    private static final By OPEN_MODAL = By.cssSelector("[data-testid='open-modal-1']");
    private static final By OPEN_FORM_MODAL = By.cssSelector("[data-testid='open-modal-form']");
    private static final By OPEN_CONFIRM_MODAL = By.cssSelector("[data-testid='open-modal-confirm']");
    private static final By TOAST_INFO = By.cssSelector("[data-testid='toast-info']");
    private static final By TOAST_SUCCESS = By.cssSelector("[data-testid='toast-success']");
    private static final By TOAST_WARNING = By.cssSelector("[data-testid='toast-warning']");
    private static final By TOAST_ERROR = By.cssSelector("[data-testid='toast-error']");
    private static final By SHOW_BANNER = By.cssSelector("[data-testid='show-banner']");
    private static final By SHOW_COOKIE = By.cssSelector("[data-testid='show-cookie']");
    private static final By OPEN_CONFIRM_DEL = By.cssSelector("[data-testid='open-confirm-del']");

    public DialogsPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "dialogs");
        actions.waitForPageLoad();
    }

    public void clickAlert() { actions.click(ALERT_BTN); }
    public void clickConfirm() { actions.click(CONFIRM_BTN); }
    public void clickPrompt() { actions.click(PROMPT_BTN); }
    public void clickOpenModal() { actions.click(OPEN_MODAL); }
    public void clickOpenFormModal() { actions.click(OPEN_FORM_MODAL); }
    public void clickOpenConfirmModal() { actions.click(OPEN_CONFIRM_MODAL); }
    public void clickToastInfo() { actions.click(TOAST_INFO); }
    public void clickToastSuccess() { actions.click(TOAST_SUCCESS); }
    public void clickToastWarning() { actions.click(TOAST_WARNING); }
    public void clickToastError() { actions.click(TOAST_ERROR); }
    public void clickShowBanner() { actions.click(SHOW_BANNER); }
    public void clickShowCookie() { actions.click(SHOW_COOKIE); }
    public void clickOpenConfirmDel() { actions.click(OPEN_CONFIRM_DEL); }
}
