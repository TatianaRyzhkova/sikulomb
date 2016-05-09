package com.epam.grow.sikulom.pages.webdriver;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {
    private WebDriver driver;
    protected PageObject(WebDriver driver){
        this.driver = driver;
    }

}
