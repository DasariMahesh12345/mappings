package com.rpm.automation;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Patientdocument {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/");
		Thread.sleep(2000);
		
		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("notifications", 1);
		//conentSettings.put("geolocation", 2);
		//conentSettings.put("media_stream", 1);
		profile.put("managed_default_content_settings", conentSettings);
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("rita.patki@kavanant.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Demorpm@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //span[@class='mat-simple-snack-bar-content']")).getText();
		Thread.sleep(2000);
// //patient search
		driver.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
		Thread.sleep(2000);
//search with text
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("auto");
		Thread.sleep(2000);
//dropdown patient click
		driver.findElement(By.xpath("//div[@class='px-6 py-4 flex flex-col gap-1']")).click();
		Thread.sleep(2000);
//nagivate to patinent document
		driver.findElement(By.xpath("//span[@class='item-label ng-tns-c309-27']")).click();
		Thread.sleep(2000);
		//click on + symbol add dco
		driver.findElement(By.xpath("//button[@mattooltip='Add Document']")).click();
		Thread.sleep(2000);
		//select document type
		driver.findElement(By.xpath("//input[@formcontrolname='document']")).click();
		Thread.sleep(2000);
		// dropdown doc select
		driver.findElement(By.xpath("//mat-option[@id='mat-option-21']")).click();
		Thread.sleep(2000);
		//document reason
		driver.findElement(By.id("mat-input-7")).sendKeys("test automation");
		Thread.sleep(2000);
		//share button
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator ng-tns-c278-45 mat-flat-button mat-button-base mat-primary']")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}
}