package com.practice.ehr.create.PN;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.practice.ehr.EHR.Login;

public class CreateProgressNote extends Login {

	@Test
	// defailt login provider loging with bekrestin
	public void createPN() throws Exception {
		/*
		 * Thread.sleep(3000); Actions mouseover = new Actions(driver);
		 * mouseover.moveToElement(driver.findElement(By.linkText("Create"))).build().
		 * perform();
		 * driver.findElement(By.xpath("//i[@class='fa fa-caret-down']")).click();
		 * Thread.sleep(2000); driver.findElement(By.linkText("Progress Note")).click();
		 * Thread.sleep(4000);
		 * driver.findElement(By.xpath("//input[@placeholder='Facility Name ']"))
		 * .sendKeys("midd");
		 * 
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html/body/ngb-modal-window/div/div/main/form/div[4]/div[2]/app-seachselectdd/div/div[2]/ul[1]"
		 * )) .click();
		 * 
		 * driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).
		 * click();
		 * 
		 * }
		 */

		// defailt login provider no need i need to change provider dropdown select

		Thread.sleep(3000);
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(driver.findElement(By.linkText("Create"))).build().perform();
		driver.findElement(By.xpath("//i[@class='fa fa-caret-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Progress Note")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@placeholder='Provider Name ']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Provider Name ']")).sendKeys("swe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/main/form/div[1]/div[2]/app-seachselectdd/div/div[2]/ul/li")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Facility Name ']")).sendKeys("midd");

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/ngb-modal-window/div/div/main/form/div[4]/div[2]/app-seachselectdd/div/div[2]/ul[1]"))
				.click();

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();

	}
	
	@Test
	public void afterPNcontinue() {
		driver.findElement(By.id("//div[@class='pending_items_list']")).click();
		
	}

}
