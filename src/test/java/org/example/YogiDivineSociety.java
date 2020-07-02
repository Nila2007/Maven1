package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YogiDivineSociety {
     static WebDriver driver;
     public static void main(String[]args){
         System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get( "https://www.ydsuk.org/");
        driver.findElement(By.linkText("Make a Donation")).click();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         //driver.findElement(By.linkText("//a[contains(text(),'CENTRES')]")).click();

         String pageTax= driver.findElement(By.xpath(" //div[@class=\"panel-body\"]")).getText();
          System.out.println(pageTax);

     }
}
