package com.qa.app.digisign.main;

import com.qa.app.digisign.object.DocumentObject;
import com.qa.app.digisign.object.LoginPage;
import com.qa.app.digisign.object.RegisterObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class MainDigisignMethod {
    public WebDriver driver;

    public LoginPage loginPage;

    public DocumentObject documentObject;

    public RegisterObject registerObject;

    public Actions act;

    public void delay(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.digisign.id/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        act = new Actions(driver);
        loginPage = new LoginPage(driver);
        registerObject = new RegisterObject(driver);
        documentObject = new DocumentObject(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
