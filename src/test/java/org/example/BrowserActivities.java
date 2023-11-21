package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserActivities {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Implicit Wait applicable globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");//Wait until page is fully ready in built mechanism
        driver.navigate().back();//not wait until page is fully loaded
        //driver.navigate().to("https://google.com");
        Thread.sleep(5000);
        driver.navigate().forward();
    }
}
