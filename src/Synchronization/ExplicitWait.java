package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("httsp://www.shoppersstack.com/products_page/119");
	    driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	    
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
	    driver.findElement(By.id("Check")).click();

	}

}
