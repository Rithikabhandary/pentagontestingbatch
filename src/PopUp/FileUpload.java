package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagF7rwPaXSUpH2Wj2-bTeOwAr7Tsic0_3JDSOWZazhfKwrnHPQev0uBoCqrsQAvD_BwE&gclsrc=aw.ds");
	    driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();


        driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\HP\\Desktop\\Rithika.cv.pdf");

	}

}
