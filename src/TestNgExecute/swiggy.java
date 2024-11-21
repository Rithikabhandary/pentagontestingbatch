package TestNgExecute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class swiggy {
	@Test(groups="System")
	public void Swiggy() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.swiggy.com/");
		 org.testng.Reporter.log("Swiggy is launched",true);
		driver.quit();	

}
}