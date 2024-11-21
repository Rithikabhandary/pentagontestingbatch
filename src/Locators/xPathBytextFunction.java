package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xPathBytextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/login");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();


	}

}
