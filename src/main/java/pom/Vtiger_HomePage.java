package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_HomePage 
{
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement product;
	
//	@FindBy(xpath="//img[@title='Create Product...']")
//	private WebElement crtProductBtn;
//	
//	@FindBy(xpath="//input[@name='productname']")
//	private WebElement productName;
//	
//	@FindBy(xpath="//table//tr//input[@title='Save [Alt+S]']")
//	private WebElement saveBtn;
	
	public Vtiger_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ProductBtn()
	{
		product.click();
		
		//return new Vtiger_ProductPage(driver);
	}
}

