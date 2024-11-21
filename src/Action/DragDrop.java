package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://trello.com");
	    Actions a=new  Actions(driver);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("username")).sendKeys("rithika5467@gmail.com");
	    driver.findElement(By.id("login-submit")).click();
	    driver.findElement(By.id("password")).sendKeys("Rithi.@1r");
	    driver.findElement(By.id("login-submit")).click();
	    driver.findElement(By.xpath("//div[text()='My Trello board']")).click();
	    WebElement src = driver.findElement(By.linkText("Project planning"));
//	    WebElement dest = driver.findElement(By.xpath("(//h2[text()=\"'Doing\"]/../../..//button[text()=\"Add a card\"])"));
	   WebElement dest = driver.findElement(By.xpath("//h2[text()='Doing']/../../..//button[text()='Add a card']"));
	    a.dragAndDrop(src, dest).perform();
	    
	    

	}

}
