package com.epam.grow.sikulom.pages.webdriver.panels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderPanel extends AbstractPanel {

    private static final String DEMO_TAB = ".//a[@title='Demo']";
    private static final String DRAGGABLE_TAB = ".//a[@title='Draggable']";

    public HeaderPanel(WebElement element) {
        super(element);
    }

    public void openDemoTab() {
        driver.findElement(By.xpath(DEMO_TAB)).click();
    }

    public void openDraggableTab() {
        driver.findElement(By.xpath(DRAGGABLE_TAB)).click();
    }
}
