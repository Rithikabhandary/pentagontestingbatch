package WebElement;

import java.awt.Rectangle;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     WebElement email=driver.findElement(By.id("email"));
	     WebElement pwd=driver.findElement(By.id("pass"));
	     
         org.openqa.selenium.Rectangle emailtextfield = email.getRect();
	     org.openqa.selenium.Rectangle  pwdtextfield = pwd.getRect();
	     
	     System.out.println(emailtextfield.getX());
	     System.out.println(pwdtextfield.getX());
	     
	     if(emailtextfield.getX()==pwdtextfield.getX()) {
	    	 System.out.println("x-cordinate of both textfield are same");
	    	 
	     }else
	    	 System.out.println("x-cordinate of both textfield are not same");
	    	 
	     
	     

	}   

}
