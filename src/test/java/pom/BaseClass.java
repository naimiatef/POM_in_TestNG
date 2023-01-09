package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
  
	  static WebDriver driver1;
		
		public void ovrir_navigateur() {
			WebDriverManager.edgedriver().setup();
			driver1 = new EdgeDriver();
			driver1.get("http://automationpractice.com/index.php");
			driver1.manage().window().maximize();

		}
		
		
		public  WebDriver getWebDriver()
		{
			return driver1;
			
		}
}
