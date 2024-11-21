package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //alert popup
//	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
//	    driver.switchTo().frame("login_page");
//	    driver.findElement(By.linkText("CONTINUE")).click();
//	    Alert alert = driver.switchTo().alert();
//	    alert.accept();
	    
	   //Confirmation
//	    driver.get("https://licindia.in/en/web/guest/home");
//	    driver.findElement(By.partialLinkText("Login")).click();
//	    Alert alert1=driver.switchTo().alert();
//	    alert.accept();
	    
	    //prompt popup
	    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("Hi rithika");
	    alert.accept();
	    

	}

}
