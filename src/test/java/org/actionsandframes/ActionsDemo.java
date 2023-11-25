package org.actionsandframes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        action.moveToElement(searchInput).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().contextClick().perform();
    }
}
