package com.autolearnit.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercises {

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

        // Create WebDriverWait instance:(Explicit Wait)
        WebDriverWait wait = new WebDriverWait(driver, 12);
        // Go to URL
        driver.get("https://www.autolearnit.com/skillcheck/");

        //Maximize window
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

        // Click on button
         driver.findElement(By.id("myBtn")).click();
        // Switch back to initial window
         driver.switchTo().defaultContent();

        // Switch to confirmation box
        driver.switchTo().alert().accept();

        //driver.close();

    }


}

