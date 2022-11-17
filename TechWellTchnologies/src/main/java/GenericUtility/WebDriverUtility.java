  package GenericUtility;

import java.util.Set;

public class WebDriverUtility extends Baseclass
{
	public static void switchingwindow(Set<String> allId)
	{
		for(String id:allId)
		{
			driver.switchTo().window(id);
			
		}
	}

	public static void switchingBackWindow(String Id)
	{
		driver.switchTo().window(Id);
	}
	public static void switchingToFrame(String FrameRef) {
		try {
			driver.switchTo().frame(FrameRef);
		}catch(Exception demo) {
			int index=Integer.parseInt(FrameRef);
			driver.switchTo().frame(index);
		}
	}
}
