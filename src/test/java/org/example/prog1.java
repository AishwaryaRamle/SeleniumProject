package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class prog1 {
    @Test
    public void Login() throws InterruptedException {
        //instance of EdgeOptions
        EdgeOptions e = new EdgeOptions();
        //configure setAcceptInsecureCerts to true boolean value
        e.setAcceptInsecureCerts(true);
        //object of EdgeDriver
        WebDriver driver=new EdgeDriver(e);
        driver.get("https://192.168.3.3/Login");
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
        driver.findElement(By.id("Password")).sendKeys("admin");
        Thread.sleep(3000);
        driver.findElement(By.name("LoginButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='HeadLoginStatus']")).click();
        driver.findElement(By.xpath("//input[@id='btnAlertLogOut']")).click();
        driver.quit();
    }
}
