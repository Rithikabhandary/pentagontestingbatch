package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class followingsibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/HP/Desktop/html/table.html");
		  Thread.sleep(2000);
		 // following Sibling
		 String text= driver.findElement(By.xpath("	//td[text()='Bhageera']/following-sibling::td[1]")).getText();
	     System.out.println(text);
	}

}
