package com.practice.ehr.create.newappointment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.practice.ehr.EHR.Login;

public class FromHomePageCreateNewAppointment extends Login {

	
	@Test
	public void createAppFromHomePg() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Full Schedule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='New Appointment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("searchString")).sendKeys("Rajesh Test");
		
		
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-appointment/div[1]/form/div[1]/div/div[2]/app-seachselectpatientdd/div/div[2]/ul/label/span")).click();
		/*
		 * // defaulu facility default changed to silver side code WebElement facility =
		 * driver.findElement(By.xpath("//input[@formcontrolname='facility']"));
		 * facility.clear(); facility.sendKeys("silver"); driver.findElement(By.xpath(
		 * "/html/body/ngb-modal-window[1]/div/div/app-appointment/div[1]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/ul/li"
		 * )).click();
		 */
		
		Select visitType = new Select(driver.findElement(By.xpath("//select[@formcontrolname='visitType']")));
		visitType.selectByVisibleText("NEW (New Patient)");
		
		Select providerSelect = new Select(driver.findElement(By.xpath("//select[@formcontrolname='provider']")));
		providerSelect.selectByVisibleText("Woo Chee");
		
	}
	@Test
	public void assortionschk() {

		SoftAssert ass = new SoftAssert();
		String Actvalue = driver.findElement(By.name("searchString")).getAttribute("value");  
		String expvalue ="Rajesh Test" ;
		
		ass.assertEquals(Actvalue, expvalue, "actual and excepted both sace passed assortion check ");
		
		ass.assertAll();
	}
	

}
