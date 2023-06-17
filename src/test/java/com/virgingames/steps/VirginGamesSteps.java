package com.virgingames.steps;

import com.virgingames.pages.AllGamesPage;
import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class VirginGamesSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I accepted cookie$")
    public void iAcceptedCookie() {
       new HomePage().acceptCookies();
    }

    @When("^I click on All games Tab$")
    public void iClickOnAllGamesTab() {
        new HomePage().clickOnAllGames();
    }

    @And("^I get online slots text$")
    public void iGetOnlineSlotsText() {
        new AllGamesPage().getOnlineSlotsText();
    }

    @Then("^I verify 'online slots' text$")
    public void iVerifyOnlineSlotsText() {
        Assert.assertEquals("Online Slots",new AllGamesPage().getOnlineSlotsText());

    }

    @And("^I click on '(\\d+) Lucky Rainbow' game$")
    public void iClickOnLuckyRainbowGame(int arg0) {
        new AllGamesPage().clickOn3LuckyRainbowGame();
    }

    @Then("^I navigate to game page$")
    public void iNavigateToGamePage() {
    }
}
