package com.qa.tandatanganku.main;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProcessDocTest extends MainMethod {
    @Test
    public void aDocumentDirect() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();

        delay(5000);
    }

    @Test
    public void bCancelProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.btnBatal.click();

        delay(5000);
    }

    @Test
    public void cContinueProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();
        delay(5000);

        assertTrue(documentObject.titleModalProses.isDisplayed());
    }

    @Test
    public void dAgreementProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.labelIya.click();
        delay(3000);
    }

    @Test
    public void eDenialProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.labelTidak.click();
        delay(4000);
        assertTrue(documentObject.textareaReason.isDisplayed());
    }

    @Test
    public void fOTPSMSProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPSMS.click();
        delay(2000);
    }

    @Test
    public void gOTPEmailProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPEmail.click();
        delay(20000);
    }

    @Test
    public void hOTPFalse() throws InterruptedException {
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
    public void iNotSureProcess() throws InterruptedException {
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
    public void jSureProcess() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        documentObject.linkTooltip.click();
        documentObject.buttonProcess.click();

        documentObject.buttonOTPEmail.click();

        if (!documentObject.divGagalKodeOtpSudah.isDisplayed()) {
//            delay(30000);
            System.out.println("false");
            documentObject.buttonProsign.click();
            documentObject.buttonSayaYakin.click();
            delay(7000);
        } else {
            documentObject.buttonModalGagalOTP.click();
            System.out.println("true");

        }
    }
}
