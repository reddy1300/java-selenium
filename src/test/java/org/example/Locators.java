package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Implicit Wait applicable globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//        driver.findElement(By.className("signInBtn")).click();
//        //Thread.sleep(2000);
//        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
//        driver.findElement(By.linkText("Forgot your password?")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jhon");
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@gmail.com");
//        driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("9876543210");
//        driver.findElement(By.className("reset-pwd-btn")).click();
//        System.out.println(driver.findElement(By.tagName("p")).getText());

        String password = getPassword(driver);
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.close();


    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.tagName("p")).getText();
        String[] passwordTextSplit = passwordText.split("'");
        String password = passwordTextSplit[1].split("'")[0];
        return password;
    }
}
