package com.relevel.relevelmodule;//import java.util.*;

import BaseFunction.StartBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartLogin extends StartBrowser {
    WebDriver driver;

    void openBrowserWithLink(String url)
    {
        driver = StartBrowser.start(url);
    }
    void loginFlipkart() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("123");
    }

    public static void main(String[] args) throws InterruptedException {
        FlipkartLogin flipkartLogin = new FlipkartLogin();
        flipkartLogin.openBrowserWithLink("https://www.flipkart.com/");
        flipkartLogin.loginFlipkart();
    }
}
