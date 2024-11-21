package TestNgExecute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class dominos {
	@Test(groups="Smoke")
	public void Swiggy() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		 org.testng.Reporter.log("Swiggy is launched",true);
		driver.quit();	

}
}
