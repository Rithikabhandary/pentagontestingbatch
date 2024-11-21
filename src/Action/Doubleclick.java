package Action;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoapp.skillrary.com/product.php");
	    Actions a=new  Actions(driver);
	    //1st approch
	    WebElement doblClick = driver.findElement(By.id("add"));
	    //a.doubleClick(doublclick).perform();
	    
	    //2nd approach
	    a.moveByOffset(344, 514).doubleClick().perform();
	    
	   // scroll actions
	    a.keyDown(Keys.ARROW_DOWN);
	    a.keyDown(Keys.ARROW_DOWN);
	    
	    //right click or context click
	    a.contextClick().perform();
	    

	}

}
