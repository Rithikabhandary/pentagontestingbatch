package JavaScriptExicutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.oracle.com/java/technologies/download/");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    driver.findElement(By.linkText("jdk-17.0.13_linux-aarch64_bin.tar.gz"));
	    WebElement disable = driver.findElement(By.linkText("Download jdk-17.0.13_linux-aarch64_bin.tar.gz"));
	    js.executeScript("arguments[0]. click();",disable);
	    

	}

}
