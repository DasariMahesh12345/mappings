package com.practicexmltestNGParameters.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RpmPatient {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Parameters("browserName")
	@BeforeTest
	public void intileBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.err.println("browser invalid");
			break;
		}
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	
	  //@AfterTest
	  public void closeBrowser() { driver.quit(); }
	 

	@Parameters("url")
	@Test
	public void lunchApp(String url) throws InterruptedException {

		driver.get(url);
		Thread.sleep(2000);
	}

	@Parameters({ "userName", "passWord" })
	@Test
	public void enterUserDetails(String userName, String passWord) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(passWord);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	SoftAssert softassert = new SoftAssert();

	@Test
	public void loginedUserNameChech() {

		/*
		 * driver.findElement( By.
		 * xpath("//div[@class='body-1 font-medium leading-snug ltr:mr-3 rtl:ml-3 hidden sm:block']"
		 * )) .getAttribute("value");
		 */
		String actuvalText = "Akshey";
		String exceptedText = "Akshey";
		softassert.assertEquals(actuvalText, exceptedText, "login username and care maneger");
		// System.out.println(driver.getTitle());
		softassert.assertAll();

	}

	@Test
	private void patSearch() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@mattooltip='Search Patient']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Test Rockey");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@class='flex items-center w-100 border-b pb-2 cursor-pointer patient_resilts ng-star-inserted']"))
				.click();
		Thread.sleep(2000);

	}

	@Test
	public void addNewPatient() throws Exception {

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav[1]/div/vex-sidenav/div/vex-scrollbar/div[1]/div[2]/div/div/div/div/vex-sidenav-item[1]/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@mattooltip='Add Patient']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Sujatha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Phase 1 road no 5 banj");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='stateId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-13")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).click();
		Thread.sleep(2000);
		// input[@formcontrolname='mobile']
		driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("6163193856");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("suji.test@kavanant.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='dob']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@aria-label='Change to years view']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@aria-label='2001']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@aria-label='December 2001']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@aria-label='December 15, 2001']")).click(); // 13 to 14 changed
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='gender']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-71")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//button[@type='submit']"))
				.click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"mat-dialog-title-3\"]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/vex-enrollment-create/form/mat-dialog-actions/button[1]")).click();

	}


	@Test
	public void createPatientEnrollment() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='item-label ng-tns-c309-23']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@mattooltip='New Enrollment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='serviceId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-22")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='careManagerName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-35")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"mat-dialog-1\"]/vex-enrollment-create/form/mat-dialog-actions/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='item-label ng-tns-c309-25']")).click();

	}

	@Test
	public void addCareTeamToPatient() throws Exception {
		driver.findElement(By.xpath("//span[@class='item-label ng-tns-c309-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@mattooltip='Add Care Member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='careMember']")).sendKeys("Sai kiran");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-36\"]/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='serviceId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-19\"]/span")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-20\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='onlineStatus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-24\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/form/mat-dialog-actions/button[2]")).click();

	}

	@Test
	public void patientDemographis() throws Exception {
		driver.findElement(By.xpath(
				"/html/body/vex-root/vex-custom-layout/vex-layout/div/mat-sidenav-container/mat-sidenav[1]/div/vex-sidenav/div/vex-scrollbar/div[1]/div[2]/div/div/div/div/vex-sidenav-item[2]/div[2]/vex-sidenav-item[5]/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Srinu");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Test");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Road no 567");
		Thread.sleep(2000);

		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys(
		 * "Miypur"); Thread.sleep(2000); //
		 * driver.findElement(By.xpath("//input[@formcontrolname='city']")).clear();
		 */ // Find the city name field

		WebElement cityNameField = driver.findElement(By.xpath("//input[@formcontrolname='city']"));

		// Check if the city name already exists
		if (cityNameField.getText().isEmpty()) {
			// If the city name field is empty, enter new city
			cityNameField.sendKeys("New City");
		} else {
			// If the city name already exists, clear and enter new text
			cityNameField.clear();
			cityNameField.sendKeys("Updated City");
		}

		// Find the zipcode field
		WebElement zipodeField = driver.findElement(By.xpath("//input[@formcontrolname='zip']"));

		// Check if the city name already exists
		if (zipodeField.getText().isEmpty()) {
			// If the city name field is empty, enter new city
			zipodeField.sendKeys("112333789");
		} else {
			// If the city name already exists, clear and enter new text
			zipodeField.clear();
			zipodeField.sendKeys("111122778");
		}

		// Find the mobile number field
		Thread.sleep(2000);
		WebElement mobileNumberField = driver.findElement(By.xpath("//input[@formcontrolname='mobile']"));
		Thread.sleep(2000);
		mobileNumberField.click();
		Thread.sleep(2000);
		// Check if the mobile number field already exists
		if (mobileNumberField.getAttribute("value").isEmpty()) {
			// If the mobile number field is empty, add mobile number
			Thread.sleep(2000);
			mobileNumberField.sendKeys("1234567890");
			Thread.sleep(2000);
		} else {
			Thread.sleep(2000);
			// If the mobile number field already contains a value, do nothing (skip)
			System.out.println("Mobile number field already contains a value. Skipping...");
		}

		// Find the email field
		Thread.sleep(2000);
		WebElement emailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
		Thread.sleep(2000);
		emailField.click();
		Thread.sleep(2000);
		// Check if the mobile number field already exists
		if (emailField.getAttribute("value").isEmpty()) {
			// If the mobile number field is empty, add mobile number
			Thread.sleep(2000);
			emailField.sendKeys("Srinu@12345@kavanant.com");
			Thread.sleep(2000);
		} else {
			Thread.sleep(2000);
			// If the mobile number field already contains a value, do nothing (skip)
			System.out.println("Email  field already contains a value. Skipping...");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//button[@class='mat-focus-indicator ng-tns-c245-46 mat-flat-button mat-button-base mat-primary']"))
				.click();
		Thread.sleep(2000);

	}

	@Test
	public void patientDocument() throws InterruptedException {
		driver.findElement(
				By.xpath("//vex-sidenav-item[@class='ng-tns-c309-27 ng-tns-c309-21 item-level-1 ng-star-inserted']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@mattooltip='Add Document']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='document']")).sendKeys("Test AARR");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-option[@role='option']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//button[@class='mat-focus-indicator ng-tns-c278-46 mat-flat-button mat-button-base mat-primary']"))
				.click();

	}

	@Test
	public void patientInsurence() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='mat-ripple item ng-tns-c309-28 ng-star-inserted']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@mattooltip='Add Insurance']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='insurance']")).sendKeys("blue Medicare");
		Thread.sleep(2000);

		driver.findElement(By.id("mat-option-22")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='subscriptionNo']")).sendKeys("95733355");
		Thread.sleep(2000);

		// driver.findElement(By.id("file")).sendKeys("C:\\Users\\Kavanant\\Pictures\\Screenshots\\Screenshot
		// (15).png");

		// Enter the file path
		String filePath = "C:\\Users\\Kavanant\\Pictures\\Screenshots\\Screenshot (5).png";

		// Find the file upload input element
		Thread.sleep(2000);
		WebElement fileUploadInput = driver.findElement(By.id("file"));

		try {
			// Attempt to upload the file
			Thread.sleep(2000);
			fileUploadInput.sendKeys(filePath);
			// You may need to add additional logic to confirm successful file upload
			System.out.println("File uploaded successfully!");
		} catch (Exception e) {
			// Handle any exception that might occur during file upload
			System.out.println("Error uploading file: " + e.getMessage());
		}

		driver.findElement(
				By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")).click();
	}

}
