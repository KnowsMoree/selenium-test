package com.qa.tandatanganku.main;

import com.qa.tandatanganku.object.LoginPage;
import com.qa.tandatanganku.object.DocumentObject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import javax.swing.*;
import java.time.Duration;

public class MainMethod {
    public WebDriver driver;
    public LoginPage loginPage;

    public DocumentObject documentObject;

    public Actions act;

    public void delay(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.tandatanganku.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

        act = new Actions(driver);
        loginPage = new LoginPage(driver);
        documentObject = new DocumentObject(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
