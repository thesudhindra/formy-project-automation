package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement dropDownList = driver.findElement(By.id("dropdownMenuButton"));
        dropDownList.click();
        Thread.sleep(500);

        WebElement listItem = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='File Upload']"));
        Thread.sleep(500);
        System.out.println(listItem.getText());
        listItem.click();
        Thread.sleep(2000);
        driver.quit();



    }
}
