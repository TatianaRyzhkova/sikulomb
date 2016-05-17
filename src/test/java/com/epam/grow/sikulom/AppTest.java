package com.epam.grow.sikulom;

import com.epam.grow.sikulom.pages.sikuli.HomePageSikuli;
import com.epam.grow.sikulom.steps.HomePageSteps;
import com.epam.grow.sikulom.utils.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;

public class AppTest {
    private WebDriver driver;

    private HomePageSteps homePageSteps;

    @Before
    public void setUp(){
        driver =  DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testApp(){
        homePageSteps = new HomePageSteps();
        homePageSteps.openHomePage();
        Screen screen = new Screen();
        HomePageSikuli homePageSikuli = new HomePageSikuli(screen);
        homePageSikuli.clickAbout();

        System.out.println();

    }

    @After
    public void tearDown(){
        DriverManager.closeDriver();
    }
}