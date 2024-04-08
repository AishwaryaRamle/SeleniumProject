package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sel02 {
    @Test
    public void invalidLogin() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        WebElement emailInputBox=driver.findElement(By.xpath("//*[@id='login-username']"));
        emailInputBox.sendKeys("admin");

        System.out.println("Attribute Name is "+ emailInputBox.getAttribute("type"));
        System.out.println("Field name is "+ driver.findElement(By.xpath("//label[@data-qa='lezoxoqape']")).getText());

        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("js-login-btn")).click();
       try
       {
           Thread.sleep(5000);
       }
       catch (InterruptedException e)
       {
           throw new RuntimeException(e);
       }

        WebElement error_msg= driver.findElement(By.className("notification-box-description"));
        String error_msg_text= error_msg.getText();
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
