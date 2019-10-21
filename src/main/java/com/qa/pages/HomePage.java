package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase
{
    @FindBy(xpath = "//div[contains(text(),'Adi Manav')]")
    WebElement userNameLabel;

    @FindBy(xpath = "//div[contains(text(),'Friend lists')]")
    WebElement friendList;

    @FindBy(xpath = "//a[@id='findFriendsNav']")
    WebElement findFriends;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
    public String verifyHomePageTitle()
    {
        return driver.getTitle();
    }
    public boolean verifyCorrectUserName()
    {
        return userNameLabel.isDisplayed();
    }
    public void clickOnFindFriends()
    {
        Actions action = new Actions(driver);
        action.moveToElement(friendList).build().perform();
        findFriends.click();
    }

}