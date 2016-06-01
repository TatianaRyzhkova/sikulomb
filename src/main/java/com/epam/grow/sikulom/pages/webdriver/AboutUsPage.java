package com.epam.grow.sikulom.pages.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage extends PageObject {
    private static final String DEFAULT_URL = "http://demoqa.com/about-us/";
    private static final String ABOUT_US_H1 = "//h1[@class='entry-title' and text()='About us']";

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(DEFAULT_URL);
    }

    public boolean isAboutUsTitleDisplayed() {
        return driver.findElement(By.xpath(ABOUT_US_H1)).isDisplayed();
    }
}
