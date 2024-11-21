package webDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Manage2 {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoapp.skillrary.com/");
		
	
		Dimension before=driver.manage().window().getSize();
		System.out.println("Before");
		driver.manage().window().maximize();
		Dimension Before=driver.manage().window().getSize();
		System.out.println("After");
		driver.manage().window().setSize(new Dimension(500,100));
		
		Point pos=driver.manage().window().getPosition();
		System.out.println(pos);
		driver.manage().window().setPosition(new Point(300,298));
	}
	
	
}
		
		
	   