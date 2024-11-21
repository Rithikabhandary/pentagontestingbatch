package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Getattributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.actitime.com/demo-request");
	     String attribute=driver.findElement(By.linkText("Try Free")).getAttribute("class");
	     System.out.println("This is the attribute value"+attribute);
	     WebElement element=driver.findElement(By.linkText("Try Free"));
	     System.out.println("Location"+element.getLocation());
	     System.out.println("TagName"+element.getTagName());
	     System.out.println("Text"+element.getText());
	     System.out.println("CssValues"+element.getCssValue("background-color"));
	     System.out.println("size"+element.getSize());
	     
		
	      

	}

}
