package com.epam.grow.sikulom.utils;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

import static com.epam.grow.sikulom.utils.PropertyController.CHROME_DRIVER_PATH_KEY;
import static com.epam.grow.sikulom.utils.PropertyController.DRIVER_KEY;
import static com.epam.grow.sikulom.utils.PropertyController.WEBDRIVER_IMPLICITLY_WAIT;

@Log4j
class DriverFactory {
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    private static RemoteWebDriver driver;

    static RemoteWebDriver getWebDriverType() {
        if (PropertyController.getProperty(DRIVER_KEY).equalsIgnoreCase(FIREFOX) && PropertyController.getProperty(DRIVER_KEY) != null) {
            driver = new FirefoxDriver();
            log.info("Firefox driver was initiated");
        } else if (PropertyController.getProperty(DRIVER_KEY).equalsIgnoreCase(CHROME) && PropertyController.getProperty(DRIVER_KEY) != null) {
            System.setProperty(CHROME_DRIVER_PATH_KEY, PropertyController.getProperty(CHROME_DRIVER_PATH_KEY));
            driver = new ChromeDriver();
            log.info("Chrome driver was initiated");
        }
        setImplicitlyWait();
        return driver;
    }

    private static void setImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Long.parseLong(PropertyController.getProperty(WEBDRIVER_IMPLICITLY_WAIT)), TimeUnit.SECONDS);
        log.debug("Webdriver implicitly wait was set to: " + PropertyController.getProperty(WEBDRIVER_IMPLICITLY_WAIT));
    }
}
