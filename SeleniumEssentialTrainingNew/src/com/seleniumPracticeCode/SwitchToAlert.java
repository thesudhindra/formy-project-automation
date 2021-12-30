package com.seleniumPracticeCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToAlert {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();


        WebElement alertButton;

        alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(3000);

        driver.quit();


    }
}
