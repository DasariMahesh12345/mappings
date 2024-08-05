package com.practice.rpm.pagobjfactrormodel.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//homepage,patient list click
public class HomePage {
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[@routerlinkactive='active']")
	WebElement patientListButton;

	@FindBy(xpath = "//button[@mattooltip='Add Patient']")
	WebElement pluseIcon;

	@FindBy(xpath = "(//input[@placeholder='Search...'])[2]")
	WebElement searchBox;

	@FindBy(xpath = "(//span[contains(text(),'Test, Rajesh')])[1]")
	WebElement afterSearchPatientSelectFromList;


	public void clickPatientList() {
		patientListButton.click();
	}

	public void patientSearch(String searhName) throws InterruptedException {
		searchBox.click();
		searchBox.sendKeys(searhName);
		System.out.println(searchBox.getAttribute("value"));
		Thread.sleep(3000);
		afterSearchPatientSelectFromList.click();
		System.out.println(afterSearchPatientSelectFromList.getAttribute("value"));

	}

}
