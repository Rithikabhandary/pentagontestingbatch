package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Attributes {
	@Test(priority=1)
	public void Zomato() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.zomato.com/");
		 org.testng.Reporter.log("Zomato is launched",true);
		driver.quit();	

	}
	
	
		@Test(priority=5,enabled=true)
		public void Swiggy() {
			WebDriver driver = new EdgeDriver();
			driver.get("http://www.swiggy.com/");
			 org.testng.Reporter.log("Swiggy is launched",true);
			driver.quit();	
	
	

}
	
			@Test(priority=2,threadPoolSize=2)
			public void Olafoods() {
				WebDriver driver = new EdgeDriver();
				driver.get("http://www.olacabs.com/");
		        org.testng.Reporter.log("http://www.ola.com/",true);
				driver.quit();	
				
			}
			
				@Test(priority=-2,dependsOnMethods="Olafoods")
				public void dominos() {
					WebDriver driver = new EdgeDriver();
					driver.get("https://pizzaonline.dominos.co.in/");
					 org.testng.Reporter.log("Dominos is launched",true);
					driver.quit();	
				}
}
			



