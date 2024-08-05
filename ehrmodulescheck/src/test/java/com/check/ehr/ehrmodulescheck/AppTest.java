package com.check.ehr.ehrmodulescheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	@SuppressWarnings("deprecation")
	@Test
	public void browserManage() throws Exception {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://dv.cinch-project.com/#/login");

		// driver.get("URL");
		driver.findElement(By.id("FormEmail")).sendKeys("ab");
		driver.findElement(By.id("FormPassword")).sendKeys("Cips@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search patients by name (>3 chars) ...']"))
				.sendKeys("Rajesh, Test", Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"patientsListDD\"]/ul/label/span[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"emr-card\"]/div[2]/app-chart-container/div[2]/div[1]/div/app-archives/div/div[2]/div/div/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		// click on continue button
		driver.findElement(By.id("continueBtn")).click();
		Thread.sleep(2000);
		// select visittype
		Select visitType = new Select(driver.findElement(By.xpath("//select[@formcontrolname='visitTypeId']")));
		Thread.sleep(2000);
		visitType.selectByVisibleText(" New Patient (NEW) ");
		Thread.sleep(2000);
		// sign&close
		driver.findElement(By.xpath("//*[@id=\"emrchart\"]/div[1]/div/div/div/div[2]/button[3]")).click();
		// cog sig con sign and close
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/footer/div/button[2]")).click();
		// after close window close * button
		driver.findElement(By.xpath("//i[@class='fa fa-close float-right']")).click();
		

	}

}
