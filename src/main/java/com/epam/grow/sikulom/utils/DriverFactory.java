package com.epam.grow.sikulom.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    public static final String DRIVER_KEY = "driver";
    public static final String CHROME_DRIVER_PATH_KEY = "webdriver.chrome.driver";
    public static final String DRIVER_PROPERTIES_PATH = "src/main/resources/driver.properties";
    public static final String FIREFOX = "firefox";
    public static final String CHROME = "chrome";
    public static RemoteWebDriver driver;

    public static RemoteWebDriver getWebdriverType() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(DRIVER_PROPERTIES_PATH));
        } catch (IOException e) {
            e.printStackTrace(); //// TODO: 18.04.16 replace with lombok logger
        }
        if (properties.getProperty(DRIVER_KEY).equalsIgnoreCase(FIREFOX) && properties.getProperty(DRIVER_KEY) != null) {
            driver = new FirefoxDriver();

        } else if (properties.getProperty(DRIVER_KEY).equalsIgnoreCase(CHROME) && properties.getProperty(DRIVER_KEY) != null) {
            System.setProperty(CHROME_DRIVER_PATH_KEY, properties.getProperty(CHROME_DRIVER_PATH_KEY));
            driver = new ChromeDriver();
        }
        return driver;
    }
}
