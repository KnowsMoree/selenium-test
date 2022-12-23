package com.qa.app.digisign.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends MainDigisignMethod {

    @Test
    public void login() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest10@tandatanganku.com" + Keys.ENTER);
        assertTrue(loginPage.welcomeText.isDisplayed());
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        loginPage.divGmailComPersonal.click();

        WebElement verifyTextSaldoTandatangan = driver.findElement(By.xpath("//div[contains(@class, 'p-4')]"));
        delay(20);
        assertTrue(verifyTextSaldoTandatangan.isDisplayed());
    }

    @Test
    public void loginPassFalse() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest10@tandatanganku.com" + Keys.ENTER);
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
        loginPage.inputUsername.sendKeys("ditest10@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(2000);

        loginPage.inputUsername.sendKeys("ditest10@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(2000);

        loginPage.inputUsername.sendKeys("ditest10@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(2000);

        loginPage.inputUsername.sendKeys("ditest10@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("shibal!" + Keys.ENTER);
        delay(5000);
        assertTrue(loginPage.alert3TimesFalse.isDisplayed());
    }
}
