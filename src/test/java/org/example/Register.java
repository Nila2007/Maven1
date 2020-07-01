package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver.exe");
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("N");
         driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("patel");
         String pageTex = driver.findElement(By.partialLinkText("Register")).getText();
         System.out.print(pageTex);
          driver.quit();


    }

}
