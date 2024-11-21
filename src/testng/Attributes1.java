package testng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Attributes1 {
	
	

	

	public class DataProviderclass {
		@Test(dataProvider ="facebook")
		public void senddata(String user,String password) {
			WebDriver driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://www.facebook.com/");
		    WebElement username = driver.findElement(By.name("username"));
		    WebElement pwd = driver.findElement(By.name("password"));
		    username.sendKeys(user);
		    pwd.sendKeys(password);
		    driver.quit();
		    
		}
		@DataProvider(name="facebook")
		public String[][] credentials(){
			String[][] data= {
					{"Rithika","rith@12"},
					{"Lavanya","lav@12"},
					{"Manasa","man@12"},
					{"Nidhi","nidh@12"}
					
			};
			return data;
		}
		

	}

}
