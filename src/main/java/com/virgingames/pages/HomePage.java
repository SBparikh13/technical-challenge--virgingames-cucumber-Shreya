package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement cookiesTab;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'All Games')]")
    WebElement allGames;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginTab;



    public void acceptCookies() {
       mouseHoverToElementAndClick(cookiesTab);
        log.info("Clicking on cookies : " + cookiesTab.toString());
    }

    public void clickOnAllGames() {
       mouseHoverToElementAndClick(allGames);
        log.info("Clicking on All games tab : " + allGames.toString());
    }

    public void clickOnLoginTab() {
        mouseHoverToElementAndClick(loginTab);
        log.info("Clicking on login link : " + loginTab.toString());
    }



}
