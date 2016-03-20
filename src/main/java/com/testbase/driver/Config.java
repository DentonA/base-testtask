package com.testbase.driver;

import com.testbase.driver.pages.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class Config {
    /**
     * User's access token to be used for testing
     */
    public static final String ACCESS_TOKEN = "b3a70a2186b8de9c454d3b18696d02182f2bcd1bc9cc34038b746c9d47f447b6";
    public static final String EMAIL = "pancheshenko.andrey@gmail.com";
    public static final String WORD = "qwerty1234567890";
    public static final int MAX_EXPLICIT_TIMEOUT = 15;
    public static final int MAX_IMPLICIT_TIMEOUT = 10;
    public static final int MIN_TIMEOUT = 1;

    public static WebDriver driver;

    public void init() {
        driver = new FirefoxDriver();
        changeImplicitWait(MAX_IMPLICIT_TIMEOUT);
        driver.manage().window().maximize();
        Pages.createAllPages(driver);
    }

    public static void changeImplicitWait(int timeoutSec) {
        driver.manage().timeouts().implicitlyWait(timeoutSec, TimeUnit.SECONDS);
    }
}
