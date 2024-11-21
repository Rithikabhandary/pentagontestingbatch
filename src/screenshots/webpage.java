package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class webpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.udemy.com/");
	     TakesScreenshot ts=(TakesScreenshot) driver;
	     File temp=ts.getScreenshotAs(OutputType.FILE);
	     File f=new File("./Screenshot/image1.png");
	     FileHandler.copy(temp, f);
	     
	     

	}

}
