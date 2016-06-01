package com.epam.grow.sikulom.pages.webdriver;

import org.openqa.selenium.WebDriver;

public class DemoPage extends PageObject {

    private static final String DEFAULT_URL = "http://demoqa.com/droppable/";

    public DemoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(DEFAULT_URL);
    }
}
