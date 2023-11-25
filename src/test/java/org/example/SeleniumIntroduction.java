package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

    public static void main(String[] args) {
        //Invoking Browser
        // chrome - ChromeDriver - Methods
        //Setting global level property
        /*What is this method System.setProperty(); This is the method where you are setting the global level propertied
        so that way your script knows where to look for that chrome driver. It takes two values key and value*/
        //No need from selenium version 4.6.0 replaced by SeleniumManager
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        //Firefox: System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
        //MS Edge: System.setProperty("webdriver.edge.driver","C:\\Drivers\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //Get page information DOM HTML information
        //System.out.println(driver.getPageSource());
        //It will close the current window which originally opened in the first.
        driver.close();
        //It will quit the driver. so it will close all associated windows.
        //driver.quit();




    }
}
