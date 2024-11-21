package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/reg/");
		  driver.findElement(By.name("websubmit")).click();
	}

}
