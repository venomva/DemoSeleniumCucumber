package com.testver.hooks;

import com.testver.config.ConfigReader;
import com.testver.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {

    private static final Logger log = LogManager.getLogger(Hooks.class);

    @Before
    public void setUp(Scenario scenario) {
        log.info("Starting scenario: {}", scenario.getName());
        WebDriver driver = DriverFactory.createDriver();
        driver.get(ConfigReader.getAppUrl());

        // Wait for Cloudflare browser check to pass and the actual page to load
        // The Cloudflare check shows "Checking your browser before accessing..."
        // Once passed, the page title changes to "Home · TestverQA"
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(d -> {
                String title = d.getTitle();
                return !title.contains("Checking your browser") && !title.contains("Just a moment");
            });
            log.info("Cloudflare check passed. Page title: '{}'", driver.getTitle());
        } catch (Exception e) {
            log.warn("Timed out waiting for Cloudflare check to pass: {}", e.getMessage());
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            log.warn("Scenario FAILED: {}", scenario.getName());
            WebDriver driver = DriverFactory.getDriver();
            if (driver != null) {
                try {
                    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", "failure-screenshot");
                } catch (Exception e) {
                    log.warn("Could not take screenshot: {}", e.getMessage());
                }
            }
        } else {
            log.info("Scenario PASSED: {}", scenario.getName());
        }
        DriverFactory.quitDriver();
    }
}
