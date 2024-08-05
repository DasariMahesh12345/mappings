package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDetails {
	WebDriver driver;
	
	public LoginDetails(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName=By.xpath("//input[@formcontrolname='username']");
	By passWord=By.xpath("//input[@formcontrolname='password']");
	By signbutton =By.xpath("(//span[@class='mat-button-wrapper'])[2]");
	
	//(//span[@class='mat-button-wrapper'])[2]
			//button[@class='mat-focus-indicator ng-tns-c156-1 mat-raised-button mat-button-base mat-primary']

			public void userName1(String userInput) {
				driver.findElement(userName).sendKeys(userInput);
				
			}
			public void pssword1(String pass) {
				driver.findElement(passWord).sendKeys(pass);
				
			}
			public void signbutton() {
				driver.findElement(signbutton).click();;
				
			}
}
