package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TestBase
{

    public static WebDriver driver;
    public static Properties prop;


    public TestBase()
    {
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\paras\\IdeaProjects\\facebook_login\\src\\main\\java\\com\\qa\\config\\config.properties");
    prop.load(fis);
        }
        catch(IOException e)
        {
            e.getMessage();
        }
    }

public static void initialization()
{
    String browserName = prop.getProperty("browser");
    if(browserName.equals("chrome"))
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\paras\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    driver.manage().window().maximize();
//    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT , TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    driver.get(prop.getProperty("url"));
}

}
