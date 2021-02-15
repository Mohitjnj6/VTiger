package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public  class Base_test implements Auto_const{
	
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
		
	@BeforeMethod
	public void OpenAppln() throws Exception
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		
		driver=new FirefoxDriver();
		
		String url = Generic_Property_Data.test1("./java/generic/p.properties", "url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		reports = new ExtentReports("./reports/extentReports.html",true);
		test = reports.startTest("regression test cases");
    }

	@AfterMethod
	public void closeAppln(ITestResult res) throws Exception
	{
		int status = res.getStatus();
		String tcname = res.getName();
		
		if (status==2)
		{
			  String path = Generic_screenshot.photo(driver, tcname);
			  test.log(LogStatus.FAIL, test.addScreenCapture(path));
		}
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}
