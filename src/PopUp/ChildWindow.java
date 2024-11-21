package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles",Keys.ENTER);
        driver.findElement(By.xpath("//span[text()='Samsung Galaxy s23 Ultra 5G AI smartphone(Green,12GB,256GB Storage)']")).click();
      
       String parent=driver.getWindowHandle();
       Set<String>child=driver.getWindowHandles();
       child.remove(parent);
        
         for(String windowControl:child)
         {
       	driver.switchTo().window(windowControl);
        driver.findElement(By.linkText("Visit the Samsung Store")).click();
       	driver.quit();
        }
	}

}
