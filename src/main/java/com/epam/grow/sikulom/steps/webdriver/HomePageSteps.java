package com.epam.grow.sikulom.steps.webdriver;


import com.epam.grow.sikulom.pages.webdriver.HomePage;
import com.epam.grow.sikulom.utils.DriverManager;

public class HomePageSteps {
    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage(DriverManager.getDriver());
    }

    public void openHomePage() {
        homePage.openPage();
    }
}
