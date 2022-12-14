package com.qa.tandatanganku.main;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProcessDocTest extends MainMethod {
    @Test
    public void a() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();

        delay(5000);
    }

    @Test
    public void b() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.btnBatal.click();

        delay(5000);
    }

    @Test
    public void c() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();
        delay(5000);

        assertTrue(documentObject.titleModalProses.isDisplayed());
    }

    @Test
    public void d() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.labelIya.click();
        delay(3000);
    }

    @Test
    public void e() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.labelTidak.click();
        delay(4000);
        assertTrue(documentObject.textareaReason.isDisplayed());
    }

    @Test
    public void f() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPSMS.click();
        delay(2000);
    }

    @Test
    public void g() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPEmail.click();
        delay(20000);
    }

    @Test
    public void h() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPEmail.click();
        documentObject.inputOtp.sendKeys("892300");

        documentObject.buttonProsign.click();
        documentObject.buttonSayaYakin.click();

        delay(3000);

        assertTrue(documentObject.modalKodeVerifikasiSalah.isDisplayed());
        documentObject.buttonSwalOkRight.click();

        delay(3000);
    }

    @Test
    public void i() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonProsign.click();
        documentObject.buttonTidakYakin.click();
        delay(2000);

        assertTrue(documentObject.modalProsesDibatalkan.isDisplayed());

        documentObject.buttonSwalOkRight.click();

        delay(2000);

        assertTrue(documentObject.titleModalProses.isDisplayed());
    }

    @Test
    public void j() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPEmail.click();
        delay(30000);

        documentObject.buttonProsign.click();
        documentObject.buttonSayaYakin.click();

        delay(10000);
    }
}
