package com.autolearnit.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFacebook {

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

        // Elements you located by choosing unique attribute
        WebElement userName = driver.findElement(By.id("email"));

        WebElement password = driver.findElement(By.id("pass"));

        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        //Set values
        userName.sendKeys("www.autolearnit.com");
        password.sendKeys("fakePassword");

        loginButton.submit();

        //driver.close();


    }
}
