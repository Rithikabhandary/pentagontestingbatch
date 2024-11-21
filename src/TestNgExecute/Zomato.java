package TestNgExecute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Zomato {
  @Test(groups="Smoke")
public void zomatolaunch() {
WebDriver driver = new EdgeDriver();
driver.get("http://www.zomato.com/");
 org.testng.Reporter.log("Zomato page",true);
driver.quit();	


}
}
