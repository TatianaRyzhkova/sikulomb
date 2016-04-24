package com.epam.grow.sikulom.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class DriverFactory {
    private static final String DRIVER_KEY = "driver";
    private static final String CHROME_DRIVER_PATH_KEY = "webdriver.chrome.driver";
    private static final String DRIVER_PROPERTIES_PATH = "src/main/resources/driver.properties";
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    private static RemoteWebDriver driver;

    static RemoteWebDriver getWebDriverType() {
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
            Map<String, Object> mobileEmulation = new HashMap<String, Object>();

            Map<String, Object> chromeOptions = new HashMap<String, Object>();
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            Map<String, Object> deviceMetrics = new HashMap<String, Object>();
            deviceMetrics.put("width", 1080);
            deviceMetrics.put("height", 1920);
            deviceMetrics.put("pixelRatio", 3.0);
            mobileEmulation.put("deviceMetrics", deviceMetrics);

            chromeOptions.put("mobileEmulation", mobileEmulation);
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            driver = new ChromeDriver(capabilities);
        }
        return driver;
    }
}
