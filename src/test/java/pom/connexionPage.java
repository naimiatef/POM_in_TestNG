package pom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class connexionPage {
  @Test
  public void click_connexion() {
	  
	  BaseClass BC = new BaseClass();
	  
	   BC.getWebDriver().findElement(By.xpath(
				"//a[normalize-space()='Sign in']"))
				.click();
  
  }
  
}
