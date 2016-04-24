package com.epam.grow.sikulom;

import com.epam.grow.sikulom.utils.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;

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
        WebElement about = driver.findElement(By.xpath("//a[@title='About us']"));

        about.click();

        LocalStorage storage = ((ChromeDriver) driver).getLocalStorage();
        storage.setItem("tt", "tt");
        Assert.assertTrue(storage.getItem("tt").equalsIgnoreCase("tt"));
    }

    @After
    public void tearDown(){
        DriverManager.closeDriver();
    }
}