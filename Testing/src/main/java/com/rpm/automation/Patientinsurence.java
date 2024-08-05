package com.rpm.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Patientinsurence {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/");
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
//patient insurence
				driver.findElement(By.xpath("/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav[1]/div/vex-sidenav/div/vex-scrollbar/div[1]/div[2]/div/div/div/div/vex-sidenav-item[2]/div[2]/vex-sidenav-item[7]/a/span")).click();
				Thread.sleep(2000);
//insurence add button
				driver.findElement(By.xpath("//button[@mattooltip='Add Insurance']")).click();
				Thread.sleep(2000);
//select insurence
				driver.findElement(By.xpath("//input[@formcontrolname='insurance']")).click();
				Thread.sleep(2000);
//dropdown select insurence				
				driver.findElement(By.id("mat-option-21")).click();
				Thread.sleep(2000);
				
//sun no
				driver.findElement(By.xpath("//input[@formcontrolname='subscriptionNo']")).sendKeys("86483656");
				Thread.sleep(2000);
// coverage from
				driver.findElement(By.id("mat-input-7")).click();
// year select
				driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-custom-date-year mat-custom-control ng-tns-c120-73 mat-button mat-button-base ng-trigger ng-trigger-controlActive']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")).click();
				Thread.sleep(2000);
//month select	
				driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
				Thread.sleep(2000);				
//date select	
				driver.findElement(By.xpath("//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']")).click();
				Thread.sleep(2000);
//coverage to
//select year 2024	
				driver.findElement(By.xpath("//input[@formcontrolname='coverageTo']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-custom-date-year mat-custom-control ng-tns-c120-77 mat-button mat-button-base ng-trigger ng-trigger-controlActive mat-custom-control-active']']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")).click();
				Thread.sleep(2000);
//select month
				driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
				Thread.sleep(2000);
//select date
				driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected']")).click();
				Thread.sleep(2000);
				
//copay
				driver.findElement(By.xpath("//input[@formcontrolname='copay']")).click();
				Thread.sleep(2000);
				
				
				
	}

}
