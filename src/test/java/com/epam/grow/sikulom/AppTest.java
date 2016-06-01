package com.epam.grow.sikulom;

import com.epam.grow.sikulom.steps.sikuli.AboutUsPageSikuliSteps;
import com.epam.grow.sikulom.steps.sikuli.DemoDraggableSikuliSteps;
import com.epam.grow.sikulom.steps.sikuli.HomePageSikuliSteps;
import com.epam.grow.sikulom.steps.webdriver.AboutUsPageSteps;
import com.epam.grow.sikulom.steps.webdriver.DemoDraggableSteps;
import com.epam.grow.sikulom.steps.webdriver.HomePageSteps;
import com.epam.grow.sikulom.utils.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

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
        HomePageSikuliSteps homePageSikuliSteps = new HomePageSikuliSteps();
        homePageSikuliSteps.openAbout();
        // 3. Verify presence of About Us title
        aboutUsPageSteps = new AboutUsPageSteps();
        Assert.assertTrue("About us title is not present", aboutUsPageSteps.isAboutUsTitlePresent());
        AboutUsPageSikuliSteps aboutUsPageSikuliSteps = new AboutUsPageSikuliSteps();
        Assert.assertTrue("Title is not present", aboutUsPageSikuliSteps.isAboutUsTitlePresent());
        // 4. open draggable
        aboutUsPageSteps.openDemoDraggable();
        DemoDraggableSikuliSteps draggableSikuliSteps = new DemoDraggableSikuliSteps();
        draggableSikuliSteps.openDroppable();
        // 5. drag and drop element
        draggableSikuliSteps.dragToDropZone();
        DemoDraggableSteps demoDraggableSteps = new DemoDraggableSteps();
        // 6. verify element was dragged, indicator highlighted
        Assert.assertTrue("Element is not dropped", demoDraggableSteps.isItemDropped());
    }

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }
}