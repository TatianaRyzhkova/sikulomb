package com.epam.grow.sikulom.pages.webdriver;

import com.epam.grow.sikulom.pages.webdriver.panels.DefaultDroppablePanel;
import com.epam.grow.sikulom.pages.webdriver.panels.HeaderPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class PageObject {

    public static final String HEADER_PANEL = "//ul[@id='menu-primary-menu']";
    private static final String DEFAULT_DROPPABLE_PANEL = "//div[@id='tabs-1']";
    protected WebDriver driver;

    PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void openPage();

    public HeaderPanel getHeaderPanel() {
        WebElement element = driver.findElement(By.xpath(HEADER_PANEL));
        return new HeaderPanel(element);
    }

    public DefaultDroppablePanel getDefaultFunctPanel() {
        WebElement element = driver.findElement(By.xpath(DEFAULT_DROPPABLE_PANEL));
        return new DefaultDroppablePanel(element);
    }
}
