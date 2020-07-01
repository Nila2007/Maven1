package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DigitalDownloads {
  static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.linkText("Desktops")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Desktops")).click();
         driver.findElement(By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//h2[1] ")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
       // driver.findElement(By.xpath("//input[@name=\'send-email\'] ")).click();
        String pageTaxt=driver.findElement(By.xpath(" //span[@id=\'FriendEmail-error\']")).getText();
        System.out.println((pageTaxt));
         pageTaxt=driver.findElement(By.xpath(" //span[@id='YourEmailAddress-error']")).getText();
        System.out.println(pageTaxt);
        driver.close();




    }
}
