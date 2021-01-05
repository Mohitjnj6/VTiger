package pom;

import generic.Generic_Actionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_LogoutPage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administartor;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
	
	public Vtiger_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout(WebDriver driver) throws InterruptedException
	{
		Generic_Actionsclass ga = new Generic_Actionsclass();
		
		ga.mouseHoverAction(driver, Administartor);
		
		Thread.sleep(3000);
		
		signout.click();
	}
	
}



