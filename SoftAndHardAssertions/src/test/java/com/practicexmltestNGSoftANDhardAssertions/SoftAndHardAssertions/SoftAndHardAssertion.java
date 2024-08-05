package com.practicexmltestNGSoftANDhardAssertions.SoftAndHardAssertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAndHardAssertion {

	WebDriver driver;

	@Test
	public void SoftAndhard() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("MAHESH", Keys.ENTER);
		Thread.sleep(5000);

		// TITLE
		String actualTitle = driver.getTitle();
		String exceptedTitle = "Log in to Facebook";
		assertEquals(actualTitle, exceptedTitle, " miss match title");

		SoftAssert softassert = new SoftAssert();// assert calss ki obj class create chasi use cheidam valla error vachina next step ki veltundhi progrom procedd terminate kadhu continur avtundhi last lo result estundhi

		// TEXT
		String actualText = driver.findElement(By.id("email")).getAttribute("value");
		String exceptedText = "MAHESH";
		softassert.assertEquals(actualText, exceptedText, " miss match text");
		System.out.println(driver.getTitle());

		// URL
		String actualUrl = driver.getCurrentUrl();
		String exceptedUrl = "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100";
		softassert.assertEquals(actualUrl, exceptedUrl, " miss match url");

		// border

		String actualBarder = driver.findElement(By.id("email")).getCssValue("border");
		String exceptedBorder = "1px solid rgb(221, 223, 226)";
		softassert.assertEquals(actualBarder, exceptedBorder, " miss match border");

		// error message

		String actualError = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		String exceptedError = "The password that you've entered is incorrect.\r\n"
				+ "Forgotten password?]\r\n";
		softassert.assertNotEquals(actualError, exceptedError, " miss match error message");
		System.out.println(driver.getTitle());
		driver.quit();
		softassert.assertAll();

	}

}
