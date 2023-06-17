package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllGamesPage extends Utility {
    private static final Logger log = LogManager.getLogger(AllGamesPage.class.getName());

    public AllGamesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Online Slots')]")
    WebElement onlineSlotsText;

    @CacheLookup
    @FindBy(xpath ="//img[@alt='3 Lucky Rainbows']")
     WebElement luckyRainbowGame;


    public String getOnlineSlotsText() {
        log.info("Get text : " + onlineSlotsText.toString());
        return getTextFromElement(onlineSlotsText);
    }

    public void clickOn3LuckyRainbowGame(){
        mouseHoverToElementAndClick(luckyRainbowGame);
        log.info("Clicking on game : " + luckyRainbowGame.toString());
    }


}
