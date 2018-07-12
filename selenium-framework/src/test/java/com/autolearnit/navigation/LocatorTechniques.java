package com.autolearnit.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTechniques {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                String.join("/",
                        System.getProperty("user.dir"),
                        "src",
                        "test",
                        "resources",
                        "drivers",
                        "geckodriver.exe"));

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Navigate to a website
        driver.get("https://www.facebook.com");

        WebElement userName = driver.findElement(By.cssSelector("#email"));
        userName.sendKeys("TestCSSSelector");


        //driver.close();


    }
}
