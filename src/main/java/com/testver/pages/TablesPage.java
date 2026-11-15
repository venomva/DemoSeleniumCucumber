package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Tables & Grids module.
 */
public class TablesPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By TAB_RICH = By.cssSelector("[data-testid='tab-rich']");
    private static final By TAB_STATIC = By.cssSelector("[data-testid='tab-static']");
    private static final By TAB_EXPAND = By.cssSelector("[data-testid='tab-expand']");
    private static final By TAB_VIRTUAL = By.cssSelector("[data-testid='tab-virtual']");
    private static final By SEARCH_INPUT = By.cssSelector("[data-testid='t-search']");
    private static final By CHECKALL = By.cssSelector("[data-testid='t-checkall']");
    private static final By CATEGORY_SELECT = By.cssSelector("#t-cat");
    private static final By LIMIT_SELECT = By.cssSelector("#t-limit");

    public TablesPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "tables");
        actions.waitForPageLoad();
    }

    public void clickRichTable() { actions.click(TAB_RICH); }
    public void clickStaticTable() { actions.click(TAB_STATIC); }
    public void clickExpandableTable() { actions.click(TAB_EXPAND); }
    public void clickVirtualTable() { actions.click(TAB_VIRTUAL); }

    public void searchFor(String query) { actions.type(SEARCH_INPUT, query); }
    public void checkAll() { actions.click(CHECKALL); }
    public void selectCategory(String category) { actions.click(CATEGORY_SELECT); /* simplified */ }
    public void selectLimit(String limit) { actions.click(LIMIT_SELECT); /* simplified */ }
}
