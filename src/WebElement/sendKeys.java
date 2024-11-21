package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class sendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/reg/");
	      WebElement firstname=driver.findElement(By.name("firstname"));
	      WebElement lastname=driver.findElement(By.name("lastname"));
	       firstname.sendKeys("Rithika",Keys.CONTROL+"A");
	      Thread.sleep(2000);
	      firstname.sendKeys("Rithika",Keys.CONTROL+"C");
	      Thread.sleep(2000);
	      lastname.sendKeys("Rithika",Keys.CONTROL+"v");
	      
	      
	      
	      
	      

	}

}
