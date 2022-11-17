package LoginModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.Baseclass;
import GenericUtility.PropertyFileUtility;
import GenericUtility.UtilityMethods;

public class TC_ID extends Baseclass
{
	@Test
	public void TestCaseDescription() throws IOException 
	{
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		String username = PropertyFileUtility.PropertyReader("username");
		email.sendKeys(username);
		password.sendKeys(PropertyFileUtility.PropertyReader("password"));
		login.click();
		
		UtilityMethods.ActionsUtility(driver).sendKeys(username, "admin").perform();
		UtilityMethods.ActionsUtility(driver).sendKeys(password, "manager").perform();
		UtilityMethods.ActionsUtility(driver).click().perform();

	}

}
