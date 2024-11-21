package TestNgExecute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class kfc {
	@Test(groups="Functional")
	public void zomatolaunch() {
	WebDriver driver = new EdgeDriver();
	driver.get("https://online.kfc.co.in/");
	 org.testng.Reporter.log("Zomato page",true);
	driver.quit();	

}
}
