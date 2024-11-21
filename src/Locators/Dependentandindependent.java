package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dependentandindependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.dunzo.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//p[text()='Search']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("oranges");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//p[text()='Orange - Nagpur']/../../../..//button[text()='ADD']")).click();		  
	}
}


