package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.instagram.com/");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='Log in']")).submit();

	}

}
