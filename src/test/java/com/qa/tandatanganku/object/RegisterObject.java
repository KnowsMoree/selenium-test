package com.qa.tandatanganku.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterObject {
    @FindBy(xpath = "//a[contains(text(),'Create account')]")
    public WebElement linkCreateAccount;

    @FindBy(xpath = "//*[@id='idcard']")
    public WebElement inputIdcard;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement inputName;

    @FindBy(xpath = "//*[@id='lbrith']")
    public WebElement inputTempatLahir;

    @FindBy(xpath = "//*[@id='jk']")
    public WebElement selectLakiPerempuan;

    @FindBy(xpath = "//button[@onclick='step1()']")
    public WebElement buttonNext;

    @FindBy(xpath = "/html/body/div[11]/form/div/div[2]/h3")
    public WebElement identitasPribadi;

    @FindBy(xpath = "//*[@id='Day']")
    public WebElement selectDay;

    @FindBy(xpath = "//*[@id='Month']")
    public WebElement selectMonth;

    @FindBy(xpath = "//*[@id='Year']")
    public WebElement selectYear;

    @FindBy(xpath = "//*[@id='e_idcard']")
    public WebElement idCardValidation;

    @FindBy(xpath = "//*[text() = 'Format NIK Salah']")
    public WebElement nikFormatFalse;

    @FindBy(xpath = "//*[text() = 'Harus 16 Digit.']")
    public WebElement nikFormat16Digit;

    @FindBy(xpath = "//input[@id='name'][contains(@class,'form-control input-md is-invalid')]")
    public WebElement validationName;

    @FindBy(xpath = "//input[@id='idcard'][contains(@class,'form-control input-md is-invalid')]")
    public WebElement validationNIK;

    @FindBy(xpath = "//input[@id='handphone'][@class='NumOnly form-control input-md is-invalid']")
    public WebElement validationNumber;

    @FindBy(xpath = "//input[@id='lbrith'][@class='form-control input-md is-invalid']")
    public WebElement validationPlace;

    @FindBy(xpath = "//input[@id='email'][@class='form-control input-md is-invalid']")
    public WebElement validationEmail;

    @FindBy(xpath = "//input[@id='username'][@class='form-control input-md is-invalid']")
    public WebElement validationUsername;

    @FindBy(xpath = "//*[text() = 'Informasi Akun']")
    public WebElement h3InformasiAkun;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='password2']")
    public WebElement inputPassword2;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@id='handphone']")
    public WebElement inputHandphone;

    @FindBy(xpath = "//button[@onclick='step3()']")
    public WebElement buttonNext2;


    @FindBy(xpath = "//*[@id='e_username']")
    public WebElement textUsername;

    @FindBy(xpath = "/html/body/div[11]/form/div/div[4]/div[1]/div/div[2]/i")
    public WebElement iUsernameAlreadyUsedCreate;

    @FindBy(xpath = "//*[text() = 'Password terlalu pendek, min 8 character']")
    public WebElement spanPasswordTerlaluPendekMin;

    @FindBy(xpath = "//*[text() = 'Password harus mengandung minimal 1 Simbol/Karakter Spesial']")
    public WebElement minSymbol;

    @FindBy(xpath = "//*[text() = 'Strong password']")
    public WebElement strongPass;

    @FindBy(xpath = "//span[@class='pass-text']")
    public WebElement spanPassword2;

    @FindBy(xpath = "//*[@id='e_password2']")
    public WebElement passNotSame;

    @FindBy(xpath = "//*[text() = 'Email sudah terdaftar gunakan email lain']")
    public WebElement emailTaken;

    @FindBy(xpath = "//*[@id='e_email']")
    public WebElement divEmail2;

    @FindBy(xpath = "//*[text() = 'Invalid Email Address']")
    public WebElement invalidEmail;

    @FindBy(xpath = "//*[text() = 'No HP sudah terdaftar gunakan nomor lain']")
    public WebElement numberTaken;

    @FindBy(xpath = "//*[text() = 'Format nomor salah']")
    public WebElement falseNumberFormat;

    @FindBy(xpath = "//*[text() = 'Nomor HP Minimal 8 digit']")
    public WebElement numberLess8Digit;

    @FindBy(xpath = "//*[text() = 'Foto dan Tandatangan']")
    public WebElement fotoDanTandatangan;

    @FindBy(xpath = "//input[@id='imgektp'][@type='file']")
    public WebElement inputImgektp;

    @FindBy(xpath = "//*[@id='cam']")
    public WebElement inputCam;

    @FindBy(xpath = "//input[contains(@id, 'imgektp')]")
    public WebElement inputImgektp2;

    @FindBy(xpath = "//span[.//*[@id='imgektp']]")
    public WebElement spanPlihFileFoto;

    public RegisterObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
