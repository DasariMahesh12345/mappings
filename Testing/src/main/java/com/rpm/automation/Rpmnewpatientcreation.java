package com.rpm.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rpmnewpatientcreation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--disable-notifications");
		// WebDriver drv = new ChromeDriver(opt);

		WebDriver drv = new ChromeDriver();
		// drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drv.manage().window().maximize();
		// drv.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		drv.get("https://devrpm.kavanant.com/");
		drv.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("rita.patki@kavanant.com");
		Thread.sleep(3000);
		drv.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Demorpm@12345");
		Thread.sleep(3000);
		drv.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		drv.findElement(By.xpath(" //span[@class='mat-simple-snack-bar-content']")).getText();
		// Thread.sleep(2000);
		drv.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
		Thread.sleep(3000);
		drv.findElement(By.id("get-vex")).click();
		Thread.sleep(3000);
		// FirstNane
		drv.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Test");
		Thread.sleep(3000);
		// LastName
		drv.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Auto");
		Thread.sleep(3000);
		// address
		drv.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Delhi");
		Thread.sleep(3000);
		// country dropdown
		drv.findElement(By.xpath("//mat-select[@formcontrolname='countryId']")).click();
		Thread.sleep(3000);
		drv.findElement(By.xpath("//span[@class='mat-option-text']")).click();
		Thread.sleep(3000);
		// state
		drv.findElement(By.xpath("//mat-select[@formcontrolname='stateId']")).click();
		Thread.sleep(3000);
		// state dropdown selected arizona
		drv.findElement(By.id("mat-option-79")).click();
		Thread.sleep(2000);

		drv.findElement(By.xpath("//input[@formcontrolname='mobile']")).click();
		// phono
		drv.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("9372074554");
		Thread.sleep(2000);
		// email
		drv.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("testauto@kavanant.com");
		Thread.sleep(3000);
		// bob(or)select canender
		drv.findElement(By.xpath("//input[@formcontrolname='dob']")).click();
		Thread.sleep(2000);
		// select year
		drv.findElement(By.xpath("//button[@aria-label='Change to years view']")).click();
		Thread.sleep(2000);
		// select backword button
		drv.findElement(By.xpath("//button[@aria-label='Previous 24 years']")).click();
		Thread.sleep(2000);
		// select year
		drv.findElement(By.xpath("//td[@aria-label='1998']")).click();
		Thread.sleep(2000);
		// select month
		drv.findElement(By.xpath("//td[@aria-label='December 1998']")).click();
		Thread.sleep(2000);

		// select date
		drv.findElement(By.xpath("//td[@aria-label='December 13, 1998']")).click();
		Thread.sleep(2000);
		// gender
		drv.findElement(By.xpath("//mat-select[@formcontrolname='gender']")).click();
		Thread.sleep(2000);
		// gender select male
		drv.findElement(By.id("mat-option-68")).click();
		Thread.sleep(2000);
		// add patient button button
		drv.findElement(By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']"))
				.click();
		Thread.sleep(2000);
		drv.quit();
		// user
		// drv.findElement(By.xpath("//img[@class='ng-star-inserted']")).click();
		// Thread.sleep(2000);

//		Thread.sleep(2000);
//		drv.findElement(
//				By.xpath("/html/body/div[2]/div[2]/div/ng-component/div/vex-toolbar-user-dropdown/div/div[2]/a[1]"))
//				.click();
//		Thread.sleep(4000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[1]/div/table/thead/tr/th[3]"))
//				.click();
//		Thread.sleep(4000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[1]/div/table/thead/tr/th[4]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[2]/div/table/thead/tr/th[2]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[2]/div/table/thead/tr/th[3]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[2]/div/table/thead/tr/th[4]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[3]/div/div[1]/div/table/thead/tr/th[2]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[3]/div/div[1]/div/table/thead/tr/th[3]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath(
//				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav-content/main/vex-billing/vex-page-layout/vex-page-layout-content/div[1]/div[3]/div/div[1]/div/table/thead/tr/th[4]"))
//				.click();
//		Thread.sleep(3000);
//		drv.findElement(By.xpath("drv.findElement(By.xpath(.click();")).click();
//		drv.findElement(By.id("mat_month_DatePicker")).click();
//
//		// drv.quit();

	}
}
