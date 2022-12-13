package com.qa.tandatanganku.main;

import com.qa.tandatanganku.object.LoginPage;
import com.qa.tandatanganku.object.MainPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPageTest extends MainMethod {

    @Test
    public void login() {
        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        assertTrue(loginPage.welcomeText.isDisplayed());
        loginPage.inputPassword.sendKeys("Kijang321!" + Keys.ENTER);

        loginPage.divGmailComPersonal.click();

        WebElement verifyTextSaldoTandatangan = driver.findElement(By.xpath("//div[contains(@class, 'p-4')]"));
        assertTrue(verifyTextSaldoTandatangan.isDisplayed());
    }
}
