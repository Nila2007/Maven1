package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Electronics {
     static WebDriver driver;
     public static void main(String[]args){
         System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demo.nopcommerce.com/ ");
        driver.findElement(By.linkText("Electronics")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath(" //div[@class='page-body']//div[2]//div[1]//div[1]//a[1]//img[1]")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")).click();
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.linkText("HTC One Mini Blue")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-19']")).click();
        driver.findElement(By.xpath("//span[@class='cart-label']")).click();
        String pageText=driver.findElement(By.xpath("//a[@class='product-name'][contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")).getText();
        System.out.println(pageText);
        pageText=driver.findElement(By.xpath("//a[@class='product-name'][contains(text(),'HTC One Mini Blue')]")).getText();
        System.out.println(pageText);
driver.close();


     }
}
