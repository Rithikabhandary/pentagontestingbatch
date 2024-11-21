package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class precedingSiblings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/HP/Desktop/html/table.html");
		  Thread.sleep(2000);
		  //precedingSibling
		  String text= driver.findElement(By.xpath("//td[text()='Bhageera']/preceding-sibling::td")).getText();
		     System.out.println(text);
	}

}
