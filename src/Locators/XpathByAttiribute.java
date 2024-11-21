package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByAttiribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/login");
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  //or path multiple attributes
		  driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']]")).click();
		  


	}

}
