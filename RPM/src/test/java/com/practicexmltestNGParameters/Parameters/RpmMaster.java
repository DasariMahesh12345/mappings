package com.practicexmltestNGParameters.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RpmMaster extends RpmPatient {
	
	

	@Test
	public void masterIcon() throws Exception {
		// WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@class='mat-ripple flex items-center rounded cursor-pointer relative trans-ease-out select-none py-1 pr-1 pl-3 hover:bg-hover']"))
				.click();
		Thread.sleep(2000);
	}

	@Test
	public void masterDOC() throws Exception {
		driver.findElement(By.linkText("Document")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@mattooltip='Add Document']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("Test Auto Doc");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-select[@formcontrolname='serviceType']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-4")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-select[@formcontrolname='type']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("mat-option-7")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//mat-checkbox[@formcontrolname='signatureRequired']")).click();
		// Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-checkbox[@formcontrolname='triggerWorkflow']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("file")).sendKeys("C:\\Users\\Kavanant\\Pictures\\Screenshots\\Screenshot (29).png");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("mat-checkbox-26")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@mattooltip='Delete selected']")).click();
		Thread.sleep(2000);
	}

	/*
	 * @Test public void masterEnrollment() throws Exception {
	 * 
	 * driver.findElement(By.xpath(
	 * "//div[@class='mat-ripple flex items-center rounded cursor-pointer relative trans-ease-out select-none py-1 pr-1 pl-3 hover:bg-hover']"
	 * )) .click(); Thread.sleep(2000);
	 * 
	 * driver.findElement(By.linkText("Enrollment")).click(); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//button[@mattooltip='New Enrollment']")).click(
	 * ); Thread.sleep(2000);
	 * 
	 * driver.findElement(By.xpath("//input[@name='search']")).
	 * sendKeys("Rockey Test"); Thread.sleep(2000);
	 * 
	 * driver.findElement(By.xpath(
	 * "//div[@class='flex items-center w-100 border-b pb-2 cursor-pointer patient_resilts ng-star-inserted']"
	 * )) .click(); Thread.sleep(2000); WebElement optionToSelect =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//mat-option[contains(text(),'Option Text')]")));
	 * optionToSelect.click();
	 * 
	 * 
	 * Thread.sleep(2000); // sevice select
	 * //driver.findElement(By.id("mat-option-27")).click(); Thread.sleep(2000); //
	 * provider field
	 * driver.findElement(By.xpath("//input[@formcontrolname='provider']")).click();
	 * Thread.sleep(2000);
	 * 
	 * // provider field select driver.findElement(By.id("mat-option-30")).click();
	 * Thread.sleep(2000);
	 * 
	 * // careManager field
	 * driver.findElement(By.xpath("//input[@formcontrolname='careManagerName']")).
	 * click(); Thread.sleep(2000);
	 * 
	 * // careManager field select
	 * driver.findElement(By.xpath("mat-option-157")).click(); Thread.sleep(2000);
	 * 
	 * }
	 */

}
