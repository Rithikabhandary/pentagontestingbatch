package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //path of the file
		FileInputStream fis=new FileInputStream(".\\textdata().properties");
				
	   Properties prop=new Properties();
		
	   prop.load(fis);
	   
	   String url=prop.getProperty("URL");
	   
	   WebDriver driver = new EdgeDriver();
	   driver.get(url);
	}

}
