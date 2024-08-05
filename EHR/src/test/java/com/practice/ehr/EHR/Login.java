package com.practice.ehr.EHR;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static WebDriver driver;
	public static String screenshotFloderName;

	@BeforeTest
	public void browserManage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// driver.get("URL");
		// driver.findElement(By.id("FormEmail")).sendKeys("ab");
		// driver.findElement(By.id("FormPassword")).sendKeys("Cips@1234");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(9000);
		driver.quit();

	}

	@Parameters("URL")
	@Test
	public void lunchApp(String url) throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url);
		Thread.sleep(2000);
	}

	@Parameters({ "userName", "passWord" })
	@Test
	public void enterUserDetails(String userName, String passWord) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("FormEmail")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.id("FormPassword")).sendKeys(passWord);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void captureScreenshots(String fileName) {
		if (screenshotFloderName == null) {
			LocalDateTime myDateObj = LocalDateTime.now();

			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHH:mm:ss");

			String StrscreenshotFloderName = myDateObj.format(myFormatObj);

		}

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/" + screenshotFloderName + "/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");

	}

}
