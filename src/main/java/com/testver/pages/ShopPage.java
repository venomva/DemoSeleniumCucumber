package com.testver.pages;

import com.testver.utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for E-commerce Flow (Shop) module.
 */
public class ShopPage {

    private final WebDriver driver;
    private final BrowserActions actions;

    private static final By FILTER_SEARCH = By.cssSelector("[data-testid='filter-search']");
    private static final By FILTER_MIN = By.cssSelector("[data-testid='filter-min']");
    private static final By FILTER_MAX = By.cssSelector("[data-testid='filter-max']");
    private static final By FILTER_APPLY = By.cssSelector("[data-testid='filter-apply']");
    private static final By CATEGORY_SELECT = By.cssSelector("select[name='category']");
    private static final By SORT_SELECT = By.cssSelector("select[name='sort']");
    private static final By ADD_CART_1 = By.cssSelector("[data-testid='add-cart-1']");

    public ShopPage(WebDriver driver, BrowserActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void navigateTo() {
        actions.navigateTo(com.testver.config.ConfigReader.getAppUrl() + "shop");
        actions.waitForPageLoad();
    }

    public void searchProduct(String name) { actions.type(FILTER_SEARCH, name); }
    public void setMinPrice(String min) { actions.type(FILTER_MIN, min); }
    public void setMaxPrice(String max) { actions.type(FILTER_MAX, max); }
    public void clickApplyFilters() { actions.click(FILTER_APPLY); }
    public void clickAddToCart() { actions.click(ADD_CART_1); }
}
