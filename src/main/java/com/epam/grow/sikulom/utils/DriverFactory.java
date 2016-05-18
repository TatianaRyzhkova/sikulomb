package com.epam.grow.sikulom.utils;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Log4j
class DriverFactory {
    private static final String DRIVER_KEY = "driver";
    private static final String CHROME_DRIVER_PATH_KEY = "webdriver.chrome.driver";
    private static final String DRIVER_PROPERTIES_PATH = "src/main/resources/driver.properties";
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    public static final String WEBDRIVER_IMPLICITLY_WAIT = "webdriver.implicitly.wait"; // TODO create propertie controller class to read from file
    public static final int WEBDRIVER_IMPLICITLY_WAIT_V = 10;
    private static RemoteWebDriver driver;

    static RemoteWebDriver getWebDriverType() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(DRIVER_PROPERTIES_PATH));
        } catch (IOException e) {
            log.error("Properties file was not found in location " + DRIVER_PROPERTIES_PATH, e);
        }
        if (properties.getProperty(DRIVER_KEY).equalsIgnoreCase(FIREFOX) && properties.getProperty(DRIVER_KEY) != null) {
            driver = new FirefoxDriver();
            log.info("Firefox driver was initiated");
        } else if (properties.getProperty(DRIVER_KEY).equalsIgnoreCase(CHROME) && properties.getProperty(DRIVER_KEY) != null) {
            System.setProperty(CHROME_DRIVER_PATH_KEY, properties.getProperty(CHROME_DRIVER_PATH_KEY));
            driver = new ChromeDriver();
            log.info("Chrome driver was initiated");
        }
        return driver;
    }

    private void setImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(WEBDRIVER_IMPLICITLY_WAIT_V, TimeUnit.SECONDS);
        log.debug("Webdriver implicitly wait was set to: " + WEBDRIVER_IMPLICITLY_WAIT_V);
    }
}
