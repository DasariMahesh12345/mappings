package com.practice.ehr.create.patient;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.practice.ehr.EHR.Login;

public class CreatePatient extends Login {
	
	@Test
	public void createPatient() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-calendar-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='New Patient']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Rajesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Road NO 2 Phase1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("HYD");
		Thread.sleep(2000);
		Select stateid = new Select(driver.findElement(By.xpath("//select[@formcontrolname='stateId']")));
		stateid.selectByVisibleText("Arizona");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='zip']")).sendKeys("65638938");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='homePhone']")).sendKeys("6575565838");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='dateOfBirth']")).sendKeys("12/13/1998");

		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//select[@formcontrolname='gender']")).click();

		Thread.sleep(2000);
		Select gender = new Select(driver.findElement(By.xpath("//select[@formcontrolname='gender']")));
		gender.selectByVisibleText("Male");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='ssnNotProvided']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}



}
