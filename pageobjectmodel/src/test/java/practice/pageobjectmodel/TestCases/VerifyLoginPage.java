package practice.pageobjectmodel.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice.pageobjectmodel.pages.AddPatient;
import practice.pageobjectmodel.pages.Login;

public class VerifyLoginPage {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void validLogin() {

		WebDriverManager.chromedriver().setup(); // or any other WebDriver setup method
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/dashboard/cmWorkListTab");

		Login page = new Login(driver);
		page.inputUserName("akshay.d@kavanant.com");

		page.inputPassWord("Sandeep@1234");

		page.signInButton();

	}

	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(5000);
		driver.quit();

	}

	@Test(description = "patient details Add")
	public void addpatient() {

		AddPatient addpat1 = new AddPatient(driver);
		addpat1.clickOnPatientList();
		addpat1.addIcon();
		// parameter okka values ekkada evvali plz refer above code
		addpat1.newPatientDetailsWindow();

	}

}
