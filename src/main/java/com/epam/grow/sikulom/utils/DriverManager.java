package com.epam.grow.sikulom.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
    private static WebDriver instance;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = DriverFactory.getWebdriverType();
        } else
            throw new WebDriverException("No driver initiated");
        //// TODO: 18.04.16 add logger 
        return instance;
    }


    public static void closeDriver() {
        if (instance != null)
            instance.quit();
        instance = null;
    }
}
