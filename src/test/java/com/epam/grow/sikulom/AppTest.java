package com.epam.grow.sikulom;

import com.epam.grow.sikulom.pages.sikuli.HomePageSikuli;
import com.epam.grow.sikulom.steps.AboutUsPageSteps;
import com.epam.grow.sikulom.steps.HomePageSteps;
import com.epam.grow.sikulom.utils.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;

public class AppTest {

    private HomePageSteps homePageSteps;
    private AboutUsPageSteps aboutUsPageSteps;

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testApp() {
        // 1. Open home page
        homePageSteps = new HomePageSteps();
        homePageSteps.openHomePage();
        // 2. Press about button with sikuli
        Screen screen = new Screen();
        HomePageSikuli homePageSikuli = new HomePageSikuli(screen);
        homePageSikuli.clickAbout();
        // 3. Verify presence of About Us title
        aboutUsPageSteps = new AboutUsPageSteps();
        Assert.assertTrue("About us title is not present", aboutUsPageSteps.isAboutUsTitlePresent());
    }

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }
}