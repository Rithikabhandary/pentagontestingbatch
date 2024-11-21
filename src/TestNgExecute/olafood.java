package TestNgExecute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class olafood {
	@Test(groups="Functional")
	public void Swiggy() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.olacabs.com/");
		 org.testng.Reporter.log("Swiggy is launched",true);
		driver.quit();	

}
}
