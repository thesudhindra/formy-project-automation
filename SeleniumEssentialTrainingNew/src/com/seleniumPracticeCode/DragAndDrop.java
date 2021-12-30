package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;

public class DragAndDrop {

    public static void main(String[] args) throws  Exception {
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        driver.manage().window().maximize();

        WebElement image,box,successString;

            image = driver.findElement(By.id("image"));
            box = driver.findElement(By.id("box"));


        Actions action = new Actions(driver);
        action.dragAndDrop(image,box).build().perform();
        Thread.sleep(3000);


        String successMsg = driver.findElement(By.xpath("//div[@id='box'][normalize-space()='Dropped!']")).getText();
        System.out.println(successMsg);

        if (successMsg.equals("Dropped!"))
        {
            System.out.println("Image dragged and dropped successfully");
        }

        driver.quit();


    }


}
