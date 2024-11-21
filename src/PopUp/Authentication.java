package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://the-internet.herokuapp.com/basic_auth");
	    
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
