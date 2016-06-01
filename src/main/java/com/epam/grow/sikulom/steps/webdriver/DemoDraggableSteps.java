package com.epam.grow.sikulom.steps.webdriver;

import com.epam.grow.sikulom.pages.webdriver.DemoPage;
import com.epam.grow.sikulom.utils.DriverManager;

public class DemoDraggableSteps {
    DemoPage demoPage;

    public DemoDraggableSteps() {
        this.demoPage = new DemoPage(DriverManager.getDriver());
    }

    public boolean isItemDropped() {
        return demoPage.getDefaultFunctPanel().isElementDropped();
    }
}
