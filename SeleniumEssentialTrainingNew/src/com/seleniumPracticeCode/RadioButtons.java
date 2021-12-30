package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.manage().window().maximize();

        WebElement radioButton1,radioButton2,radioButton3;

            radioButton1 = driver.findElement(By.id("radio-button-1"));
            radioButton1.click();
            Thread.sleep(1000);

            radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
            radioButton2.click();
            Thread.sleep(1000);

            radioButton3 = driver.findElement(By.xpath("//input[@value='option3']"));
            radioButton3.click();
            Thread.sleep(1000);

            driver.quit();



    }
}


