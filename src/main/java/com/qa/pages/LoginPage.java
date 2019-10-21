package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase
{
    @FindBy(xpath = "//input[@id='email']")
    WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;

    @FindBy(xpath = "//button[@id='loginbutton']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[@class='_42ft _4jy0 _4jy6 _4jy2 selected _51sy']")
    WebElement signUpBtn;

    @FindBy(xpath = "//i[@class='fb_logo img sp_U-ZrA51p6aB sx_8a1b62']")
    WebElement facebookLogo;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    public String validateLoginPageTitle()
    {
        return driver.getTitle();
    }
    public boolean validateFACEBOOKImage()
    {
        return facebookLogo.isDisplayed();
    }
    public HomePage login(String un, String pwd)
    {
        username.sendKeys(un);
        password.sendKeys(pwd);
       loginBtn.click();

        return new HomePage();
    }


}
