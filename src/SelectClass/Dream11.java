package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.dream11.com/");
	    driver.switchTo().frame("send-sms-iframe");
	    driver.findElement(By.id("regEmail")).sendKeys("1234567899");

	}

}
