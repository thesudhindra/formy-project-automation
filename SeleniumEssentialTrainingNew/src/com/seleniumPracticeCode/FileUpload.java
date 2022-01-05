package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().window().maximize();

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("2022_holidays.png");
        System.out.println(fileUploadField.getText());
       Thread.sleep(2000);

        WebElement resetButton = driver.findElement(By.xpath("//button[normalize-space()='Reset']"));
        resetButton.click();
        Thread.sleep(1000);
        driver.quit();


    }
}
