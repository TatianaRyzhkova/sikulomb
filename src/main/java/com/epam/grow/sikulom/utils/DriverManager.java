package com.epam.grow.sikulom.utils;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

@Log4j
public class DriverManager {
    private static WebDriver instance;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = DriverFactory.getWebDriverType();
        }
        return instance;
    }


    public static void closeDriver() {
        if (instance != null)
            instance.quit();
        instance = null;
        log.debug("Driver was destroyed");
    }
}
