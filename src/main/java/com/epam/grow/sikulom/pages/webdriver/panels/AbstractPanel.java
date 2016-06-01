package com.epam.grow.sikulom.pages.webdriver.panels;

import com.epam.grow.sikulom.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractPanel {
    protected WebDriver driver;
    private WebElement baseLocation;

    public AbstractPanel(WebElement element) {
        this.driver = DriverManager.getDriver();
        this.baseLocation = element;
    }
}
