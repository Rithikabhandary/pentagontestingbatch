package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubevideo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.youtube.com/");
	      Thread.sleep(1000);
		  WebElement searchbox=driver.findElement(By.name("search_query"));
		  searchbox.sendKeys("tom and jerry");
		  searchbox.sendKeys(Keys.RETURN);
		  
		 
		  
		 

	}

}
