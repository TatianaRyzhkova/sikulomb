package com.epam.grow.sikulom;

import com.epam.grow.sikulom.utils.DriverFactory;
import com.epam.grow.sikulom.utils.DriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = DriverManager.getDriver();
    }

    @Test
    public void testApp(){
        driver.get("http://demoqa.com/");
        WebElement about = driver.findElement(By.xpath("//a[@title='About us']"));
        about.click();
        System.out.println();
        DriverManager.closeDriver();
    }
}