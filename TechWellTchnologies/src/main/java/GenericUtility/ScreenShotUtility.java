package GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtility extends Baseclass implements IAutoContent
{
	public static void takingScreenshot(String screenshotName) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File photo=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(ERRORSHOTS+screenshotName+".png");
		FileUtils.copyFile(photo, dest);
		
	}

}
