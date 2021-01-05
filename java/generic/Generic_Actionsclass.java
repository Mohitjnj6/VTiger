package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Actionsclass {
	
	public void mouseHoverAction(WebDriver driver , WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void rightclick(WebDriver driver , WebElement ele)
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
	}
}
