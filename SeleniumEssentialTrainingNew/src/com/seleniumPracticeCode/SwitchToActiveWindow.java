package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();

        WebElement button;
        button = driver.findElement(By.id("new-tab-button"));
        button.click();

        String originalWindow = driver.getWindowHandle();
        Thread.sleep(5000);

        for (String newWindow: driver.getWindowHandles())
        {
            driver.switchTo().window(newWindow);
            Thread.sleep(5000);

        }

        driver.switchTo().window(originalWindow);
        Thread.sleep(5000);
        driver.quit();


    }
}
