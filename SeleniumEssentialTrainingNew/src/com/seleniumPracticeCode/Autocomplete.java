package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        WebElement searchFiled = driver.findElement(By.xpath("//input[@name='q']"));
        searchFiled.click();
        searchFiled.sendKeys("Java");
        Thread.sleep(2000);

       driver.findElement(By.xpath("//span[normalize-space()='java']")).click();



//        driver.findElement(By.xpath("//input[@id='tags']")).click();
//        driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Ja");
//        driver.findElement(By.className("ui-menu-item-wrapper")).click();


        driver.quit();
    }
}
