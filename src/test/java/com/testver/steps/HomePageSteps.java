package com.testver.steps;

import com.testver.pages.HomePage;
import com.testver.utils.BrowserActions;
import com.testver.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps {

    private static final Logger log = LogManager.getLogger(HomePageSteps.class);
    private final WebDriver driver = DriverFactory.getDriver();
    private final BrowserActions actions;
    private final HomePage homePage;

    public HomePageSteps() {
        this.actions = new BrowserActions(driver, com.testver.config.ConfigReader.getExplicitWaitSeconds());
        this.homePage = new HomePage(driver, actions);
    }

    @Given("I navigate to the Testver Playground homepage")
    public void iNavigateToTheTestverPlaygroundHomepage() {
        homePage.navigateTo();
    }

    @Then("the page title should contain {string}")
    public void thePageTitleShouldContain(String expectedTitle) {
        String actualTitle = homePage.getPageTitle();
        log.info("Page title: '{}'", actualTitle);
        assertThat(actualTitle).as("Page title should contain '%s'", expectedTitle)
                .containsIgnoringCase(expectedTitle);
    }

    @And("the main heading should be {string}")
    public void theMainHeadingShouldBe(String expectedHeading) {
        String actualHeading = homePage.getHeadingText();
        log.info("Main heading: '{}'", actualHeading);
        assertThat(actualHeading).as("Main heading should match")
                .isEqualTo(expectedHeading);
    }

    @And("the search input should be displayed with placeholder {string}")
    public void theSearchInputShouldBeDisplayedWithPlaceholder(String expectedPlaceholder) {
        assertThat(homePage.isSearchInputDisplayed())
                .as("Search input should be displayed")
                .isTrue();
        String actualPlaceholder = homePage.getSearchPlaceholder();
        assertThat(actualPlaceholder).as("Search placeholder should match")
                .isEqualTo(expectedPlaceholder);
    }

    @And("the brand link {string} should be visible")
    public void theBrandLinkShouldBeVisible(String brandText) {
        assertThat(homePage.isBrandLinkDisplayed())
                .as("Brand link '%s' should be visible", brandText)
                .isTrue();
    }

    @And("the {string} link should be visible")
    public void theLinkShouldBeVisible(String linkText) {
        if ("Sign in".equals(linkText)) {
            assertThat(homePage.isSignInLinkDisplayed())
                    .as("'Sign in' link should be visible")
                    .isTrue();
        } else {
            assertThat(homePage.isModuleDisplayed(linkText))
                    .as("Link '%s' should be visible", linkText)
                    .isTrue();
        }
    }

    @And("the theme toggle button should be visible")
    public void theThemeToggleButtonShouldBeVisible() {
        assertThat(homePage.isThemeToggleDisplayed())
                .as("Theme toggle button should be visible")
                .isTrue();
    }

    @And("the reset state button should be visible")
    public void theResetStateButtonShouldBeVisible() {
        assertThat(homePage.isResetButtonDisplayed())
                .as("Reset state button should be visible")
                .isTrue();
    }

    @And("the following modules should be displayed:")
    public void theFollowingModulesShouldBeDisplayed(List<String> modules) {
        for (String module : modules) {
            boolean isDisplayed = homePage.isModuleDisplayed(module);
            log.info("Module '{}' displayed: {}", module, isDisplayed);
            assertThat(isDisplayed)
                    .as("Module '%s' should be displayed on the homepage", module)
                    .isTrue();
        }
    }
}
