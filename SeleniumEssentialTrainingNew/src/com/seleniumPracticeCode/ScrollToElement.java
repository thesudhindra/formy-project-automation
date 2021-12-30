package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[@class='btn btn-lg'][normalize-space()='Page Scroll']")).click();
        Thread.sleep(500);

        WebElement name, date;
        name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        Thread.sleep(500);
        name.sendKeys("Sudhindra");


        date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2022");
        Thread.sleep(500);

        driver.quit();



    }
}
