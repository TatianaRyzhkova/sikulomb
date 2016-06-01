package com.epam.grow.sikulom.pages.webdriver.panels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DefaultDroppablePanel extends AbstractPanel {

    private static final String DROPPED_ELEMENT = "//div[@class='ui-widget-header ui-droppable ui-state-highlight']";

    public DefaultDroppablePanel(WebElement element) {
        super(element);
    }

    public boolean isElementDropped(){
        return driver.findElement(By.xpath(DROPPED_ELEMENT)).isDisplayed();
    }
}
