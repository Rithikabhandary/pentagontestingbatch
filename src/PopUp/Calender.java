package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.abhibus.com");
	    driver.findElement(By.id("jaurney-date")).click();
	    driver.findElement(By.xpath("(//span[text()='November']/../../..//span[text()='30'])[2]")).click();
	    
	}
	

}
