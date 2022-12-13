package com.qa.tandatanganku.main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class SendDocTest extends MainMethod {
    @Test
    public void sendDoc() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        loginPage.divGmailComPersonal.click();

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        WebElement titleDetailDokumen = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/h5"));
        assertTrue(titleDetailDokumen.isDisplayed());
    }

    @Test
    public void tryToUploadExcPDF() {
        loginPage.inputUsername.sendKeys("wahyuhi" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Kijang321!" + Keys.ENTER);

        loginPage.divGmailComPersonal.click();

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Documents\\shortcut.txt");

        loginPage.buttonUnggahDokumen.click();
    }

    @Test
    public void setTimeDocument() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.inputDatetimepicker.click();
        documentObject.day.click();
        documentObject.button.click();

        documentObject.isSorting.click();

        documentObject.buttonAddMe.click();
        documentObject.buttonNext.click();

        assertTrue(documentObject.canvas.isDisplayed());
    }

    @Test
    public void fillFormReceiver() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAddMe.click();

        Select sel = new Select(documentObject.selectAction);
        sel.selectByVisibleText("Dibutuhkan Paraf");
        documentObject.buttonNext.click();

        assertTrue(documentObject.canvas.isDisplayed());
    }

    @Test
    public void notFillFormReceiver() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        Select sel = new Select(documentObject.selectAction);
        sel.selectByVisibleText("Dibutuhkan Paraf");

        documentObject.buttonNext.click();

        assertTrue(documentObject.notifEmail.isDisplayed());
        assertTrue(documentObject.notifName.isDisplayed());
    }

    @Test
    public void notFilAnotherClass() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        Select selectActionDoc = new Select(documentObject.selectAction);
        selectActionDoc.selectByVisibleText("Dibutuhkan Paraf");

        documentObject.buttonNext.click();

        assertTrue(documentObject.notifName.isDisplayed());
    }

    @Test
    public void notFillOneForm() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        Select sel = new Select(documentObject.selectAction);
        sel.selectByVisibleText("Dibutuhkan Paraf");

        documentObject.inputName.sendKeys("aziz");

        documentObject.buttonNext.click();

        assertTrue(documentObject.notifEmail.isDisplayed());
    }

    @Test
    public void symbolInput() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.inputName.sendKeys("^^&&$$&*");

        assertTrue(documentObject.notifSymbol.isDisplayed());
    }

    @Test
    public void formatEmail() {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.inputEmail.sendKeys("aziz.com");

        documentObject.buttonNext.click();

        assertTrue(documentObject.notifFormat.isDisplayed());
    }

    @Test
    public void newFormReceipt() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAdd.click();

        delay(1000);

        assertTrue(documentObject.newFormField.isDisplayed());
    }

    @Test
    public void pengecekan() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.isSorting.click();
        documentObject.buttonAddMe.click();
        Select selectActionDoc = new Select(documentObject.selectAction);
        selectActionDoc.selectByVisibleText("Dibutuhkan Pengecekan");
        documentObject.buttonAdd.click();

        documentObject.inputName2.sendKeys("aziz");
        documentObject.inputEmail2.sendKeys("aziz@digi-id.id");

        documentObject.buttonNext.click();

        assertTrue(documentObject.canvas.isDisplayed());
    }

    @Test
    public void lastChecking () throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.isSorting.click();
        documentObject.buttonAddMe.click();
        documentObject.buttonAdd.click();
        Select selectActionDoc2 = new Select(documentObject.selectAction2);
        selectActionDoc2.selectByVisibleText("Dibutuhkan Pengecekan");

        documentObject.inputName2.sendKeys("aziz");
        documentObject.inputEmail2.sendKeys("aziz@digi-id.id");

        documentObject.buttonNext.click();

        assertTrue(documentObject.swalModalLastCheck.isDisplayed());
        delay(5000);
        documentObject.buttonOK.click();
    }

    @Test
    public void setExpiredDate() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.inputDatetimepicker.click();

        for (int i = 0;i<= 4; i++) {
            documentObject.previousMonth.click();
        }

        delay(2000);

        documentObject.dayInvalid.click();

        documentObject.button.click();

        delay(5000);

        assertTrue(documentObject.swalInvalidDate.isDisplayed());
        documentObject.buttonOK.click();
    }

    @Test
    public void signaturePlacement() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAddMe.click();

        documentObject.buttonNext.click();

        documentObject.buttonAddSign.click();

        act.dragAndDropBy(documentObject.signLocation, 20, 100).build().perform();

        delay(2000);

        documentObject.buttonLock.click();

        documentObject.buttonSetEmail.click();

        documentObject.buttonSend.click();

        documentObject.buttonProsesSend.click();

        delay(2000);
    }

    @Test
    public void minResize() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAddMe.click();

        documentObject.buttonNext.click();

        documentObject.buttonAddSign.click();

        act.dragAndDropBy(documentObject.signLocation, 20, 100).build().perform();
        act.dragAndDropBy(documentObject.resizeButton, -15, -100).build().perform();

        delay(5000);

        documentObject.buttonLock.click();

        documentObject.buttonSetEmail.click();

        documentObject.buttonSend.click();

        documentObject.buttonProsesSend.click();

        delay(3000);
    }

    @Test
    public void maxResize() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAddMe.click();

        documentObject.buttonNext.click();

        documentObject.buttonAddSign.click();

        act.dragAndDropBy(documentObject.signLocation, 20, 100).build().perform();
        act.dragAndDropBy(documentObject.resizeButton, 25, 150).build().perform();

        delay(5000);

        documentObject.buttonLock.click();

        documentObject.buttonSetEmail.click();

        documentObject.buttonSend.click();

        documentObject.buttonProsesSend.click();

        documentObject.buttonOK.click();

        delay(3000);
    }

    @Test
    public void emptySign() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAddMe.click();

        documentObject.buttonNext.click();

        documentObject.buttonSend.click();

        documentObject.buttonProsesSend.click();

        delay(5000);

        assertTrue(documentObject.swalEmptySign.isDisplayed());

        documentObject.buttonOK.click();
    }

    @Test
    public void outsideSign() throws InterruptedException {
        loginPage.inputUsername.sendKeys("ditest6@tandatanganku.com" + Keys.ENTER);
        loginPage.inputPassword.sendKeys("Coba1234" + Keys.ENTER);

        WebElement inputFile = driver.findElement(By.xpath("//input[@type='file']"));
        inputFile.sendKeys("C:\\Users\\dignitas\\Downloads\\company_image_20221101070631 (2).pdf");

        loginPage.buttonUnggahDokumen.click();

        documentObject.buttonAddMe.click();

        documentObject.buttonNext.click();

        documentObject.buttonAddSign.click();

        act.dragAndDropBy(documentObject.resizeButton, 25, 50).build().perform();
        act.dragAndDropBy(documentObject.signLocation, 320, 50).build().perform();

        delay(5000);

        documentObject.buttonLock.click();

        documentObject.buttonSetEmail.click();

        documentObject.buttonSend.click();

        documentObject.buttonProsesSend.click();

        delay(3000);

        assertTrue(documentObject.swalCantSendSign.isDisplayed());

        documentObject.buttonOK.click();
    }
}
