package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class ExecuteJavaScript {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");
        driver.manage().window().maximize();

        WebElement modalButton,closeButton;
                modalButton = driver.findElement(By.id("modal-button"));
                modalButton.click();
        Thread.sleep(2000);
                closeButton=driver.findElement(By.id("close-button"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        System.out.println("Before close -> "+closeButton.getText());
        jse.executeScript("arguments[0].click();",closeButton);
        System.out.println("After close -> "+closeButton.getText());
        Thread.sleep(5000);

        driver.quit();

    }
}
