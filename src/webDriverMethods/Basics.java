package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
	  
	    
	    String title=driver.getTitle();
	    System.out.println (title);
	    //System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());
	    String windowID=driver.getWindowHandle();
	    System.out.println(windowID);
	
	    

	}

}
