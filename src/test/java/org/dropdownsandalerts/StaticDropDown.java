package org.dropdownsandalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StaticDropDown {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        List<WebElement> dropDownValues = dropdown.getOptions();
        System.out.println(dropDownValues);
        for(WebElement element : dropDownValues){
            System.out.println(element.getText());
        }

        dropdown.selectByVisibleText("USD");

    }
}
