package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        String name = "rahul";
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Implicit Wait applicable globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        String loginMessage = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(loginMessage, "You are successfully logged in.");
        String loginName= driver.findElement(By.xpath("//h2")).getText();
        Assert.assertEquals(loginName, "Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
    }
}
