package testScenories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.LoginDetails;

public class TestMethods {
	
	  WebDriver driver ;
		
	 
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	
	public void basicSetup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://devrpm.kavanant.com/dashboard/cmWorkListTab");
	}
	@Test
	public void testclassHere() {
		LoginDetails page = new LoginDetails(driver);
		page.userName1("akshay.d@kavanant.com");
		page.pssword1("Sandeep@1234");
		
		
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}

}
