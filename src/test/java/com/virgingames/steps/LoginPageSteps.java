package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
    @Given("^I am on the  homepage$")
    public void iAmOnTheHomepage() {
    }

    @And("^I accept cookie on homepage$")
    public void iAcceptCookieOnHomepage() {
        new HomePage().acceptCookies();
    }
    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginTab();
    }

    @Then("^I should navigate to verify page successfully$")
    public void iShouldNavigateToVerifyPageSuccessfully() {
        Assert.assertEquals("Pardon Our Interruption",new LoginPage().getVerifyPageText());
    }


}
