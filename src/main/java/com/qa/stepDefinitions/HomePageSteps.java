package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends TestBase
{
 LoginPage loginpage;
 HomePage homePage;


    @Given("user opens browser")
    public void user_opens_browser() {
        TestBase.initialization();
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        loginpage = new LoginPage();
        String title = loginpage.validateLoginPageTitle();
        Assert.assertEquals("Log in to Facebook | Facebook", title);
    }

    @Then("user logged in to app")
    public void user_logged_in_to_app() {
        homePage = loginpage.login(prop.getProperty("username"),
                prop.getProperty("password"));
    }

    @Then("validate home page title")
    public void validate_home_page_title() {
        String homeTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals("Facebook", homeTitle);
    }

    @Then("validate logged in username")
    public void validate_logged_in_username() {
        boolean flag = homePage.verifyCorrectUserName();
        Assert.assertTrue(flag);
    }



}
