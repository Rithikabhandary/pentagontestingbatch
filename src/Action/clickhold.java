package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickhold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	    Actions a=new  Actions(driver);
	    
	    driver.findElement(By.id("password")).sendKeys("Wednessday");
	    
	    //1st approch of identifying eyecon
	    WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
        a.clickAndHold(eye).perform();
        
        
        a.moveByOffset(1350, 1345).clickAndHold().perform();
        
        driver.quit();
	}

}
