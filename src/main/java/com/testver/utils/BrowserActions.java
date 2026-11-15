package com.testver.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Safe browser action wrappers with explicit waits and error handling.
 */
public class BrowserActions {

    private static final Logger log = LogManager.getLogger(BrowserActions.class);
    private final WebDriver driver;
    private final WebDriverWait wait;

    public BrowserActions(WebDriver driver, int timeoutSeconds) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
    }

    public void navigateTo(String url) {
        log.info("Navigating to: {}", url);
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void click(By locator) {
        log.debug("Clicking element: {}", locator);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void type(By locator, String text) {
        log.debug("Typing '{}' into element: {}", text, locator);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    public void typeAndEnter(By locator, String text) {
        log.debug("Typing '{}' and pressing Enter into element: {}", text, locator);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text + Keys.ENTER);
    }

    public String getText(By locator) {
        log.debug("Getting text from element: {}", locator);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }

    public String getAttribute(By locator, String attribute) {
        log.debug("Getting attribute '{}' from element: {}", attribute, locator);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element.getAttribute(attribute);
    }

    public boolean isDisplayed(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (TimeoutException e) {
            log.debug("Element not visible: {}", locator);
            return false;
        }
    }

    public boolean isDisplayed(By locator, int timeoutSeconds) {
        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
            WebElement element = shortWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isEnabled(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return element.isEnabled();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void waitForPageLoad() {
        log.debug("Waiting for page to load...");
        wait.until(driver -> ((JavascriptExecutor) driver)
                .executeScript("return document.readyState").equals("complete"));
    }

    public void scrollToElement(By locator) {
        log.debug("Scrolling to element: {}", locator);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", element);
    }

    public void takeScreenshot(String filePath) {
        // Screenshot capability — can be extended with FileHandler
        log.info("Screenshot requested at: {}", filePath);
    }

    public void pressEscape() {
        log.debug("Pressing Escape key");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
    }
}
