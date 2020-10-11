package scripts;

import org.testng.annotations.Test;

import generic.Base_test;
import generic.Generic_Property_Data;
import pom.Vtiger_HomePage;
import pom.Vtiger_LoginPage;
import pom.Vtiger_LogoutPage;
import pom.Vtiger_ProductPage;

public class CreateProduct_test  extends Base_test{
	
	@Test
	public void login_logout_test() throws Exception
	{
		Vtiger_LoginPage lp=new Vtiger_LoginPage(driver);
		
		String username = Generic_Property_Data.test1("./src/main/java/generic/p.properties", "username");
		String password = Generic_Property_Data.test1("./src/main/java/generic/p.properties", "password");
		
		lp.login(username,password);
		
		Vtiger_HomePage hp = new Vtiger_HomePage(driver);     
		hp.ProductBtn();

		Vtiger_ProductPage pp = new Vtiger_ProductPage(driver);
		
		pp.createProduct("Laptop");
		
		
		Vtiger_LogoutPage lop=new Vtiger_LogoutPage(driver);
		
		lop.logout(driver);
		
		
	}

}
