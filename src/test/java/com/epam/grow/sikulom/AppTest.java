package com.epam.grow.sikulom;

import com.epam.grow.sikulom.utils.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class AppTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver =  DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testApp(){
        driver.get("http://demoqa.com/");
        Screen screen = new Screen();
        ImagePath.add("ImageContainer/images");
        try {
            screen.wait("src/main/resources/images/about_us.png");
            screen.click("src/main/resources/images/about_us.png");
            System.out.println();
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }

    @After
    public void tearDown(){
        DriverManager.closeDriver();
    }
}