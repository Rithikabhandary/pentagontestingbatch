package webDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Navigation navigate=driver.navigate();
		navigate.to("https://www.zomato.com/");
		Thread.sleep(2000);
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();
		driver.quit();
		

	}

}
