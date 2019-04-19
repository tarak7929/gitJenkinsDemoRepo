package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gitJenkinsDemoClass 
{
    @Test
    public void gitJenkinsDemoTest() throws InterruptedException
    {
        System.out.println("Before opening Browser !!!");
        System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://smvs.org/");
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Closing opening Browser !!!");        
    }
}
