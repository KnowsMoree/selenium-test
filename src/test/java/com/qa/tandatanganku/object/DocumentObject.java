package com.qa.tandatanganku.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentObject {

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[2]")
    public WebElement button;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/table/tbody/tr[2]/td[3]/div")
    public WebElement day;

    @FindBy(xpath = "//label[contains(@for, 'seq1')]")
    public WebElement isSorting;

    @FindBy(xpath = "//*[@id='exp']")
    public WebElement inputDatetimepicker;

    @FindBy(xpath = "//button[@id='add_me']")
    public WebElement buttonAddMe;

    @FindBy(xpath = "//*[@id='detail_doc']")
    public WebElement buttonNext;

    @FindBy(xpath = "//canvas[@id='pdf-canvas']")
    public WebElement canvas;

    @FindBy(xpath = "//select[contains(@id, 'ck1')]")
    public WebElement selectAction;

    @FindBy(xpath = "//*[@id='e_name-1']")
    public WebElement notifName;

    @FindBy(xpath = "//div[contains(@id, 'e_email-1')]")
    public WebElement notifEmail;

    @FindBy(xpath = "//*[@id='name-1']")
    public WebElement inputName;

    @FindBy(xpath = "//div[@id = 'e_name-1' and (text() = 'Simbol tidak dapat didukung sebagai isian' or . = 'Simbol tidak dapat didukung sebagai isian')]")
    public WebElement notifSymbol;

    @FindBy(xpath = "//div[@id = 'e_email-1' and (text() = 'Format Email salah !' or . = 'Format Email salah !')]")
    public WebElement notifFormat;

    @FindBy(xpath = "//*[@id='email-1']")
    public WebElement inputEmail;

    @FindBy(xpath = "//div[contains(@class, 'input_fields_wrap')]")
    public WebElement newFormField;

    @FindBy(xpath = "//*[@id='add_re']")
    public WebElement buttonAdd;

    @FindBy(xpath = "//*[@id='name-2']")
    public WebElement inputName2;

    @FindBy(xpath = "//*[@id='email-2']")
    public WebElement inputEmail2;

    @FindBy(xpath = "//*[@id='ck2']")
    public WebElement selectAction2;

    @FindBy(xpath = "//div[@tabindex='-1']")
    public WebElement swalModalLastCheck;

    @FindBy(xpath = "//button[contains(@style, '133,')]")
    public WebElement buttonOK;

    @FindBy(xpath = "//i[@class='gj-icon chevron-left']")
    public WebElement previousMonth;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/table/tbody/tr[2]/td[4]/div")
    public WebElement dayInvalid;

    @FindBy(xpath = "//div[@tabindex='-1']")
    public WebElement swalInvalidDate;

    @FindBy(xpath = "//button[@onclick='adds_ttd()']")
    public WebElement buttonAddSign;

    @FindBy(xpath = "//*[@id='img-1']")
    public WebElement signLocation;

    @FindBy(xpath = "//*[@id='lock1']")
    public WebElement buttonLock;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[16]/div/div/div/div/div/div[3]/button")
    public WebElement buttonSetEmail;

    @FindBy(xpath = "//*[@id='send']")
    public WebElement buttonSend;

    @FindBy(xpath = "//*[@id='pros']")
    public WebElement buttonProsesSend;

    @FindBy(xpath = "//div[@style='z-index: 90;']")
    public WebElement resizeButton;

    @FindBy(xpath = "//*[text() = 'Tandatangan tidak boleh kosong']")
    public WebElement swalEmptySign;

    @FindBy(xpath = "//*[text() = 'Dokumen gagal dikirim.']")
    public WebElement swalCantSendSign;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[11]/div[6]/div/div/div[1]/div/div/div/div[2]/div[3]/div/span/a")
    public WebElement linkTooltip;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[11]/div[6]/div/div/div[1]/div/div/div/div[4]/div[3]/div/span/a")
    public WebElement linkTooltip2;

    @FindBy(xpath = "//a[contains(@class, 'btn')]")
    public WebElement btnBatal;

    @FindBy(xpath = "//button[contains(@onclick, 'proOtp()')]")
    public WebElement buttonProcess;

    @FindBy(xpath = "//label[@for='p1']")
    public WebElement labelIya;

    @FindBy(xpath = "//label[@for='p2']")
    public WebElement labelTidak;

    @FindBy(xpath = "//*[@id='reason']")
    public WebElement textareaReason;

    @FindBy(xpath = "//*[@id='btnotp']")
    public WebElement buttonOTPSMS;

    @FindBy(xpath = "//*[@id='otemail']")
    public WebElement buttonOTPEmail;

    @FindBy(xpath = "/html/body/div[15]/div/div/div[1]/h4")
    public WebElement titleModalProses;

    @FindBy(xpath = "//*[@id='otp']")
    public WebElement inputOtp;

    @FindBy(xpath = "//*[@id='prosign']")
    public WebElement buttonProsign;

    @FindBy(xpath = "//button[contains(@class, 'swal-button--confirm')]")
    public WebElement buttonSayaYakin;

    @FindBy(xpath = "//button[contains(@class, 'swal-button--cancel')]")
    public WebElement buttonTidakYakin;

    @FindBy(xpath = "//*[text() = 'Proses dibatalkan']")
    public WebElement modalProsesDibatalkan;

    @FindBy(xpath = "//button[contains(@class, 'swal-button')]")
    public WebElement buttonSwalOkRight;

    @FindBy(xpath = "//*[text() = 'Kode verifikasi salah']")
    public WebElement modalKodeVerifikasiSalah;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[11]/div[6]/div/div/div[1]/div/div/div/div[6]/div[3]/div/span/a")
    public WebElement linkTooltip3;

    @FindBy(xpath = "//*[@id='bModal']")
    public WebElement buttonModalGagalOTP;

    @FindBy(xpath = "//*[@id='text_mdl']")
    public WebElement divTextOTPEmail3x;

    @FindBy(xpath = "//span[contains(@class, 'badge')]")
    public WebElement spanGagal;

    @FindBy(xpath = "//div[@class='modal-content'][.//*[@id='bModal']]")
    public WebElement divGagalKodeOtpSudah;

    public DocumentObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
