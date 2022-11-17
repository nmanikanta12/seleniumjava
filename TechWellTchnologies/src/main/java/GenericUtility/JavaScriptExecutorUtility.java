package GenericUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility{
	public static class JavaScriptExcutor extends Baseclass{

	public static JavascriptExecutor js=JavascriptExcutor(driver);

	public static void clickingOnELementUsingJavaScript(WebElement Element) {
		js.executeScript("arguments[0].click();", Element);
	}
	public static void EnteringDataToELementsUsingJavaScript(WebElement element,String data) {
		js.executeScript("arguments[0].value='"+data+"';", element);
	}
}

	public static JavascriptExecutor JavascriptExcutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}