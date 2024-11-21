package WebElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class webElement {

	private Object outputType;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.udemy.com/");
		File temp=driver.findElement(By.xpath("(//img[@alt='Udemy'])[1]")).getScreenshotAs(OutputType.FILE);
	    File f=new File("./Screenshots/image2.jpeg");
	    FileHandler.copy(temp, f);

	}

}
