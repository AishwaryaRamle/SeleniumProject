package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class sel01 {
    @Test
    public void testMethod() throws InterruptedException {
        EdgeOptions opt=new EdgeOptions();
        //opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
       // opt.addArguments("--start-maximized");
      //  opt.addArguments("--windowsize=1024,768");
        //opt.addArguments("--headless");
        WebDriver driver=new EdgeDriver(opt);
        driver.get("https://www.amazon.com");
       // driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1250, 720));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

    }
}
