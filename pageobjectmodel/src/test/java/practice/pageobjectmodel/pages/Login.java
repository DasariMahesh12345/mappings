package practice.pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// this class stored all locators methods of login page

public class Login {
	  WebDriver driver;

	By userName = By.xpath("//input[@formcontrolname='username']");
	By passWord = By.xpath("//input[@formcontrolname='password']");
	By signInButton = By.xpath("//button[@type='submit']");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUserName(String validusername) {
		driver.findElement(userName).sendKeys(validusername);
	}

	public void inputPassWord(String validpass) {
		driver.findElement(passWord).sendKeys(validpass);

	}

	public void signInButton() {

		driver.findElement(signInButton).click();

	}

}
