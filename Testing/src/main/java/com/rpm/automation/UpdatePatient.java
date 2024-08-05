package com.rpm.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdatePatient {

	@SuppressWarnings("deprecation")
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
		//navgivate to patient demographis
		driver.findElement(By.xpath("/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav[1]/div/vex-sidenav/div/vex-scrollbar/div[1]/div[2]/div/div/div/div/vex-sidenav-item[2]/div[2]/vex-sidenav-item[5]/a")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='prefix']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-14")).click();
		Thread.sleep(2000);
		//city
		
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("delhi");
		Thread.sleep(2000);
		//zipcode
		driver.findElement(By.xpath("//input[@formcontrolname='zip']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='zip']")).sendKeys("88969");
		Thread.sleep(2000);
		//email update
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).clear();
		Thread.sleep(2000);
		//after clear email add data
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("testautomation@kavanant.com");
		Thread.sleep(2000);
		//patient update button
	    driver.findElement(By.xpath("//button[@class='mat-focus-indicator ng-tns-c245-57 mat-flat-button mat-button-base mat-primary']")).click();
		
		// cancel button
		//driver.findElement(By.xpath("/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/app-show-patients/vex-page-layout/vex-page-layout-content/div[2]/div/div/app-patient-create/div/form/div[2]/div[9]/button[1]")).click();
		//Thread.sleep(2000);
		
	}

}
