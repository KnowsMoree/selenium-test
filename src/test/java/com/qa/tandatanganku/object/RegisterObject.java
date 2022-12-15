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

    public RegisterObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
