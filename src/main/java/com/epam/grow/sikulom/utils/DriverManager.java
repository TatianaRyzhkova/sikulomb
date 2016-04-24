package com.epam.grow.sikulom.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class DriverManager {
    private static WebDriver instance;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = DriverFactory.getWebDriverType();
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
