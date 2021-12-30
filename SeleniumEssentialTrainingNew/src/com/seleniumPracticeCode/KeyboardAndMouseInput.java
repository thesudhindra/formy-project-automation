package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;

public class KeyboardAndMouseInput {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.id("name")).sendKeys("Sudhindra Deshpande");
        Thread.sleep(3000);
        driver.findElement(By.id("button")).click();


//        WebElement textFieldName = driver.findElement(By.id("name"));
//        textFieldName.click();
//        textFieldName.sendKeys("Sudhindra Deshpande");
//        Thread.sleep(5000);
//
//        WebElement button = driver.findElement(By.id("button"));
//        System.out.println(button.getText());
//        button.click();

        driver.quit();

    }


}
