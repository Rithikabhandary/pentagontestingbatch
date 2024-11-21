package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologyOrders {
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("BeforeSuite is getting Launched",true);
	}
	@AfterSuite
	public void aftersuite() 
	{
		Reporter.log("AfterSuite is getting Launched",true);
	}
	@BeforeTest
	public void beforeTest() 
	{
		Reporter.log("BeforeTest is getting Launched",true);
	}
	@AfterTest
	public void afterTest() 
	{
		Reporter.log("AfterTest is getting Launched",true);
		
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("BeforeClass is getting Launched",true);
	}
	@AfterClass
	public void afterClass() 
	{
		Reporter.log("AfterClass is getting Launched",true);
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		Reporter.log("BeforeMethod is getting Launched",true);
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("AfterMethod is getting Launched",true);
	}
	@Test
	public void mainMethod() 
	{
		Reporter.log("Main Method is getting Launched",true);
	}	
}
