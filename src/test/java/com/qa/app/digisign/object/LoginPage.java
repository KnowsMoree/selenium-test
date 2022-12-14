package com.qa.app.digisign.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//b[@id='tit']")
    public WebElement welcomeText;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(css = "html > body > div > div > div > div > section > form > a:nth-of-type(2) > div")
    public WebElement divGmailComPersonal;

    @FindBy(xpath = "//div[contains(@class, 'p-4')]")
    public WebElement textSaldoTandaTangan;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonUnggahDokumen;

    @FindBy(xpath = "/html/body/div/div/div/div/section/form/a[2]/div")
    public WebElement divGmailComPersonal2;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement passFalseAlert;

    @FindBy(xpath = "//*[@id='e_username']")
    public WebElement errorLoginUsername;

    @FindBy(xpath = "//*[text() = '[Password salah sebanyak 3x. Silakan coba kembali setelah 10 menit.]']")
    public WebElement alert3TimesFalse;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
