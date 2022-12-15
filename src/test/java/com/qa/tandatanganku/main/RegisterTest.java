package com.qa.tandatanganku.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    @Test
    public void gEmptyUsername() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(1000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        delay(5000);

        registerObject.buttonNext.click();

        registerObject.inputPassword.sendKeys("asdf1234!");
        registerObject.inputPassword2.sendKeys("asdf1234!");

        registerObject.inputEmail.sendKeys("testing223@spambox.xyz");

        registerObject.inputHandphone.sendKeys("89237738883");

        registerObject.buttonNext2.click();
        delay(8000);

        assertTrue(registerObject.validationUsername.isDisplayed());
    }

    @Test
    public void hMinCharUsername() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputUsername.sendKeys("sda");
        delay(3000);

        assertTrue(registerObject.textUsername.isDisplayed());
        delay(3000);
    }

    @Test
    public void iUsernameRegistered() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputUsername.sendKeys("wahyuhi");
        delay(3000);

        assertTrue(registerObject.iUsernameAlreadyUsedCreate.isDisplayed());
    }

    @Test
    public void jPasswordTooShort() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputPassword.sendKeys("hi!23");
        delay(2000);

        assertTrue(registerObject.spanPasswordTerlaluPendekMin.isDisplayed());
    }

    @Test
    public void kMinSymbolPass() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputPassword.sendKeys("asda");
        delay(2000);

        assertTrue(registerObject.minSymbol.isDisplayed());
    }

    @Test
    public void lStrongPass() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputPassword.sendKeys("Mamang123!");
        delay(2000);

        assertTrue(registerObject.strongPass.isDisplayed());
    }

    @Test
    public void mPassIsNotSame() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputPassword.sendKeys("Mamang123!");
        registerObject.inputPassword2.sendKeys("Mamamng213123");
        delay(2000);

        assertTrue(registerObject.passNotSame.isDisplayed());
    }

    @Test
    public void nEmailValidation() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputUsername.sendKeys("mamang");
        registerObject.inputPassword.sendKeys("Mamang123!");
        registerObject.inputPassword2.sendKeys("Mamang123!");
        registerObject.inputHandphone.sendKeys("89773827839");

        registerObject.buttonNext2.click();
        delay(3000);

        assertTrue(registerObject.validationEmail.isDisplayed());
    }

    @Test
    public void oEmailTaken() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputEmail.sendKeys("ditest0@tandatanganku.com");
        delay(2000);

        assertTrue(registerObject.emailTaken.isDisplayed());
    }

    @Test
    public void pInvalidEmail() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputEmail.sendKeys("adasd");
        delay(2000);

        assertTrue(registerObject.invalidEmail.isDisplayed());
    }

    @Test
    public void qInvalidNumber() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();
        registerObject.buttonNext2.click();
        delay(2000);

        assertTrue(registerObject.validationNumber.isDisplayed());
    }

    @Test
    public void rNumberTaken() throws InterruptedException{
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputUsername.sendKeys("mamang");
        registerObject.inputPassword.sendKeys("Mamang123!");
        registerObject.inputPassword2.sendKeys("Mamang123!");
        registerObject.inputEmail.sendKeys("amang78@spambox.xyz");
        registerObject.inputHandphone.sendKeys("87804070516");
        delay(2900);

        assertTrue(registerObject.numberTaken.isDisplayed());
    }

    @Test
    public void sFalseFormatNumber() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();
        registerObject.inputHandphone.sendKeys("09123");
        delay(2000);

        assertTrue(registerObject.falseNumberFormat.isDisplayed());
    }

    @Test
    public void tNumberLessThan8Digit() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();
        registerObject.inputHandphone.sendKeys("892");
        delay(2000);

        assertTrue(registerObject.numberLess8Digit.isDisplayed());
    }

    @Test
    public void uTrueInformation() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputUsername.sendKeys("mamang");
        registerObject.inputPassword.sendKeys("Mamang123!");
        registerObject.inputPassword2.sendKeys("Mamang123!");
        registerObject.inputEmail.sendKeys("amang78@spambox.xyz");
        registerObject.inputHandphone.sendKeys("894381212");

        registerObject.buttonNext2.click();
        delay(3000);

        assertTrue(registerObject.fotoDanTandatangan.isDisplayed());
    }

    @Test
    public void vInputKTP() throws InterruptedException {
        registerObject.linkCreateAccount.click();

        registerObject.inputIdcard.sendKeys("3275025302090003");
        delay(5000);

        registerObject.inputName.sendKeys("mita");
        registerObject.inputTempatLahir.sendKeys("boyolali");

        Select genSel = new Select(registerObject.selectLakiPerempuan);
        genSel.selectByVisibleText("Perempuan");

        registerObject.buttonNext.click();

        registerObject.inputUsername.sendKeys("mamang");
        registerObject.inputPassword.sendKeys("Mamang123!");
        registerObject.inputPassword2.sendKeys("Mamang123!");
        registerObject.inputEmail.sendKeys("amang78@spambox.xyz");
        registerObject.inputHandphone.sendKeys("894381212");
        delay(3000);

        registerObject.buttonNext2.click();

        WebElement inputKTP = driver.findElement(By.xpath("//input[contains(@id, 'imgektp')]"));
        inputKTP.sendKeys("C:\\Users\\dignitas\\Downloads\\npwp_20221101055126 (1).jpg");

        delay(20000);
    }
}
