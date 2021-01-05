package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_ProductPage {

	@FindBy(name="user_name")
	private WebElement untbox;
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement crtProductBtn;
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productName;
	
	@FindBy(xpath="//table//tr//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public Vtiger_ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createProduct(String name)
	{
		
		crtProductBtn.click();;
		
		productName.sendKeys(name);
		
		saveBtn.click();
		
		System.out.println("The Product:"+name+" is created.");
		
	}
}

