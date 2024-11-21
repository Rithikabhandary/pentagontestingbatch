package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.woodenstreet.com/");
		  driver.findElement(By.cssSelector("img[title='Coffee Table Sets online']")).click();

	}

}
