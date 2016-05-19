package com.epam.grow.sikulom.pages.webdriver;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    private static final String DEFAULT_URL = "http://demoqa.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(DEFAULT_URL);
    }
}
