package com.qa.tandatanganku.main;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegisterTest extends MainMethod {
    @Test
    public void aRegisterPage() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("8928839489849203");
        delay(1000);
        registerObject.inputName.sendKeys("wahyu");
        delay(1000);
        registerObject.inputTempatLahir.sendKeys("bekasi");
        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        delay(5000);
    }

    @Test
    public void bNIKFormatMust16Digit() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("920390239239");
        delay(500);

        assertTrue(registerObject.nikFormat16Digit.isDisplayed());
        delay(2000);
    }

    @Test
    public void cFormatFalse() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("0");
        delay(1000);

        assertTrue(registerObject.nikFormatFalse.isDisplayed());
    }

    @Test
    public void dCantInputString() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("asdkjasd");
        delay(5000);

        assertTrue(registerObject.nikFormat16Digit.isDisplayed());
    }

    @Test
    public void eNIKRegistered() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputTempatLahir.sendKeys("boyolali");

        registerObject.buttonNext.click();
        delay(1000);

        assertTrue(registerObject.validationName.isDisplayed());
    }

    @Test
    public void ePlaceBirthValidation() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();
        delay(3000);

        assertTrue(registerObject.validationPlace.isDisplayed());
    }

    @Test
    public void fullIdentity() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        delay(2000);
        assertTrue(registerObject.h3InformasiAkun.isDisplayed());
    }
}
