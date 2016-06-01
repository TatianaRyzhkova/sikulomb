package com.epam.grow.sikulom.steps.webdriver;

import com.epam.grow.sikulom.pages.webdriver.AboutUsPage;
import com.epam.grow.sikulom.utils.DriverManager;

public class AboutUsPageSteps {
    private AboutUsPage aboutUsPage;

    public AboutUsPageSteps() {
        this.aboutUsPage = new AboutUsPage(DriverManager.getDriver());
    }

    public boolean isAboutUsTitlePresent() {
        return aboutUsPage.isAboutUsTitleDisplayed();
    }

    public void openDemoDraggable() {
        aboutUsPage.getHeaderPanel().openDemoTab();
        aboutUsPage.getHeaderPanel().openDraggableTab();
    }
}
