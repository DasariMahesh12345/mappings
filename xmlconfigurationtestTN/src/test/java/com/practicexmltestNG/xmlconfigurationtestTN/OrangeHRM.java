package com.practicexmltestNG.xmlconfigurationtestTN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	public WebDriver driver;

	@Test
	public void LunchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/");
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("akshay.d@kavanant.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sandeep@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
}
