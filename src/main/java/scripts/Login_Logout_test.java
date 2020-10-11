package scripts;

import generic.Base_test;
import generic.Generic_Property_Data;

import org.testng.annotations.Test;

import pom.Vtiger_LoginPage;
import pom.Vtiger_LogoutPage;

public class Login_Logout_test extends Base_test{
	
	@Test
	public void login_logout_test() throws Exception
	{
		Vtiger_LoginPage lp=new Vtiger_LoginPage(driver);
		
		String username = Generic_Property_Data.test1("./src/main/java/generic/p.properties", "username");
		String password = Generic_Property_Data.test1("./src/main/java/generic/p.properties", "password");
		
		lp.login(username,password);
		
		Vtiger_LogoutPage hp=new Vtiger_LogoutPage(driver);
		
		hp.logout(driver);
		
		
	}

}
