package com.practice.rpm.pagobjfactrormodel.allmetod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practice.rpm.pagobjfactrormodel.pages.locators.AddPatientDetails;
import com.practice.rpm.pagobjfactrormodel.pages.locators.HomePage;
import com.practice.rpm.pagobjfactrormodel.pages.locators.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllTestMethods {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	AddPatientDetails patdtlspag;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup(); // or any other WebDriver setup method
		driver = new ChromeDriver(); // or whichever browser you are using
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/dashboard/cmWorkListTab");
		loginPage = new LoginPage(driver);
	}

	@Test(priority = 0, description = "Login details")
	public void testLogin() {
		loginPage.setUsername("akshay.d@kavanant.com");
		loginPage.setPassword("Sandeep@1234");
		loginPage.clickLoginButton();
	}

	@Test(priority = 1, description = "click on patient list")
	public void testHome() {
		homePage = new HomePage(driver);
		homePage.clickPatientList();

	}

	@Test(priority = 2,enabled = false, description = "click on patient search enter text")
	public void patientsearch() throws Exception {
		homePage.patientSearch("Rajesh");
	}

	@Test(priority = 3, description = "patientdetails + icon click add patient details")
	public void testpatientDetails() throws Exception {
		patdtlspag = new AddPatientDetails(driver);
		patdtlspag.patientDetails("Ranga", "Test", "hyd", "7893728641", "testranga@kavanant.com");

	}

	@AfterClass
	public void tearDown() throws Exception {
		if (driver != null) {
			Thread.sleep(8000);
			driver.quit();
		}
	
}

}
