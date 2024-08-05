package com.practice.rpm.pagobjfactrormodel.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// note we can extend base class implement logic webelements in base class by using base class webelements we can implement logic in chaild class
public class AddPatientDetails {
	WebDriver driver;

	public AddPatientDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@mattooltip='Add Patient']")
	WebElement pluseIcon;

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@formcontrolname='address1']")
	WebElement address;

	@FindBy(xpath = "//mat-select[@formcontrolname='stateId']")
	WebElement state;

	@FindBy(xpath = "//input[@formcontrolname='mobile']")
	WebElement mobileNO;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement email;

	@FindBy(xpath = "//input[@formcontrolname='dob']")
	WebElement DOB;

	@FindBy(xpath = "//span[contains(text(),'2024')]")
	WebElement clickOnYear;

	@FindBy(xpath = "//button[@aria-label='Previous 24 years']")
	WebElement selectPreviousYear;

	@FindBy(xpath = "//div[contains(text(),'1990')]")
	WebElement selectYear;

	@FindBy(xpath = "//span[contains(text(),'May')]")
	WebElement clickOncurrentmonth;

	@FindBy(xpath = "//div[contains(text(),'JAN')]")
	WebElement selectMonth;

	@FindBy(xpath = "//*[@id=\"mat-datepicker-9\"]/div/mat-month-view/table/tbody/tr[2]/td[4]/div[1]")
	WebElement selectDate;

	@FindBy(xpath = "//mat-select[@formcontrolname='gender']")
	WebElement gender;
	@FindBy(xpath = "//span[contains(text(),'Male')]")
	WebElement male;

	@FindBy(xpath = "//span[contains(text(),'Female')]")
	WebElement female;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement addButton;

	@FindBy(xpath = "(//input[@placeholder='Search...'])[2]")
	WebElement enrollmentCloseintoIcon;

	public void patientDetails(String fstName, String lstName, String address, String mblNo, String email) {

		pluseIcon.click();
		firstName.sendKeys(fstName);
		System.out.println(firstName.getAttribute("value"));
		lastName.sendKeys(lstName);
		System.out.println(firstName.getAttribute("value"));
		this.address.sendKeys(address);
		System.out.println(this.address.getAttribute("value"));
		mobileNO.sendKeys(mblNo);
		System.out.println(mobileNO.getAttribute("value"));
		this.email.sendKeys(email);
		System.out.println(this.email.getAttribute("value"));
		DOB.click();
		clickOnYear.click();
		selectPreviousYear.click();
		selectYear.click();
		clickOncurrentmonth.click();
		selectMonth.click();
		selectDate.click();
		gender.click();
		male.click();
		
		this.gender.click();
		male.click();

	}

}
