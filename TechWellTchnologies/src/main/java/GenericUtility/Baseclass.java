package GenericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public static WebDriver driver;
	@BeforeSuite

	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}
	@BeforeClass
	public void navigateToApplication()

	{
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

	}
	@AfterMethod
	
	public void checkingFailure(ITestResult result) throws IOException {
		if(result.getStatus()==result.FAILURE) {
			ScreenShotUtility.takingScreenshot(result.getName());
			System.out.println(result.getName());
			
		}
	}
	@AfterClass

	public void logout()
	{
		System.out.println("logout");

	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}


}
