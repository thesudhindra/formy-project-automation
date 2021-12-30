package com.seleniumPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","D:\\Dependencies\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();

        WebElement datefield,chooseDate ;

            datefield = driver.findElement(By.id("datepicker"));
            System.out.println(datefield.getText());
            datefield.click();

            chooseDate = driver.findElement(By.xpath("//td[@class='new day'][normalize-space()='5']"));
            System.out.println(chooseDate.getText());

            chooseDate.click();
            Thread.sleep(3000);
        System.out.println(datefield.getText());

            driver.quit();



    }
}
