package com.practice.rpm.pagobjfactrormodel.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

    @FindBy(xpath  = "//input[@formcontrolname='username']")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        usernameInput.sendKeys(username);
       
        System.out.println(usernameInput.getAttribute("value"));
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
        System.out.println(passwordInput.getAttribute("value"));
        driver.getTitle();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
