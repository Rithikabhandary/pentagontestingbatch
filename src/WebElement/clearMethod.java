package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class clearMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://demo.vtiger.com/vtigercrm/");
	      WebElement username=driver.findElement(By.id("username"));
	      WebElement pwd=driver.findElement(By.id("password"));
		  username.clear();
	      username.sendKeys("ABCD");
	      pwd.clear();
	      pwd.sendKeys("1234");
	      driver.quit();
	    

	}

}
