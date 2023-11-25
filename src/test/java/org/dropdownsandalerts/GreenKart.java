package org.dropdownsandalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class GreenKart {

    public static void main(String[] args) throws InterruptedException {

        String[] productsList = {"Cucumber", "Brocolli", "Tomato"};
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        addItems(driver, productsList);

        driver.findElement(By.cssSelector(".cart-icon img")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
        System.out.println(driver.findElement(By.className("promoInfo")).getText());


    }

    public static void addItems(WebDriver driver, String[] productsList){

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        List itemsNeeded = Arrays.asList(productsList);

        for (int i = 0; i < products.size(); i++){

            String name = products.get(i).getText();
            String productName = name.split("-")[0].trim();

            int j = 0;
            if (itemsNeeded.contains(productName)){
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j==itemsNeeded.size()) {break;};
            }

        }
    }
}
