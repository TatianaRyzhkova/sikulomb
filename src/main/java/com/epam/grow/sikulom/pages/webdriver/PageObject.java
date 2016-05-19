package com.epam.grow.sikulom.pages.webdriver;

import org.openqa.selenium.WebDriver;

abstract class PageObject {
    protected WebDriver driver;

    PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void openPage();
}
