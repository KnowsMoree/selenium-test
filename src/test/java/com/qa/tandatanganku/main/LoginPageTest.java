package com.qa.tandatanganku.main;

import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    @Test
    public void loginPassFalse() throws InterruptedException {
        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        assertTrue(loginPage.welcomeText.isDisplayed());
        loginPage.inputPassword.sendKeys("aduhsibal" + Keys.ENTER);

        delay(2000);
        assertTrue(loginPage.passFalseAlert.isDisplayed());
    }

    @Test
    public void usernameFalse() throws InterruptedException{
        loginPage.inputUsername.sendKeys("yayaysh" + Keys.ENTER);
        delay(5000);

        assertTrue(loginPage.errorLoginUsername.isDisplayed());
    }

    @Test
    public void blockAfter3False() throws InterruptedException {
        loginPage.inputUsername.sendKeys("yayaysh" + Keys.ENTER);
        delay(2000);
        loginPage.inputUsername.clear();
        loginPage.inputUsername.sendKeys("badhbasd" + Keys.ENTER);
        delay(2000);
        loginPage.inputUsername.clear();
        loginPage.inputUsername.sendKeys("asdasd" + Keys.ENTER);
        delay(2000);
        loginPage.inputUsername.clear();
        loginPage.inputUsername.sendKeys("badhbadaasd" + Keys.ENTER);
        delay(5000);
        assertTrue(loginPage.errorLoginUsername.isDisplayed());
    }

    @Test
    public void passFalse3Times() throws InterruptedException {
        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(2000);

        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(2000);

        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(2000);

        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(5000);
        assertTrue(loginPage.alert3TimesFalse.isDisplayed());
    }
}
