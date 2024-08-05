package practice.pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPatient  {

	WebDriver driver;
	

	By patientListField = By.xpath("//a[@routerlinkactive='active']");
	By addPluseIcon = By.xpath("//button[@mattooltip='Add Patient']");
	
	By firstName = By.xpath("//input[@formcontrolname='firstName']");
	/*
	 * @FindBy(xpath ="//input[@formcontrolname='firstName']") WebElement fstName;
	 */
	By lastName = By.xpath("(//input[@formcontrolname='lastName']");
	By address = By.xpath("//input[@formcontrolname='address1']");
	By stateid = By.xpath("//mat-select[@formcontrolname='stateId']");
	By mobileNO = By.xpath("//input[@formcontrolname='mobile']");
	By email = By.xpath("//input[@formcontrolname='email']");
	By dateofbtth = By.xpath("//input[@formcontrolname='dob']");
	By gender = By.xpath("//mat-select[@formcontrolname='gender']");
	By addButton = By.xpath("//button[@type='submit']");
	By enrollmentCloseintoIcon = By.xpath("//button[@type='submit']");

	
	public AddPatient(WebDriver driver) {
		this.driver = driver;

	}

	public void clickOnPatientList() {
		driver.findElement(patientListField).click();

	}

	public void addIcon() {
		driver.findElement(addPluseIcon).click();

	}
	// here we can give parameter also
	public void newPatientDetailsWindow() {
		
		driver.findElement(firstName).sendKeys("Test");
		driver.findElement(lastName).sendKeys("Zero");
	
		
	}

}
