package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Notification {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	     ChromeOptions setting =new ChromeOptions();
		setting.addArguments("--disable-notification");
		setting.addArguments("--incognito");
		
		 WebDriver driver=new ChromeDriver(setting);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://jobsindia.deloitte.com");
         driver.get("http://wordpressdemo.webkul.com/wordpress-latest-tweets/");

	}

}
