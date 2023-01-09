package pom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class etablir_connexionPage {
  @Test
  public void etablir_connexion() {
	  
	  BaseClass BC = new BaseClass ();
	  BC.getWebDriver().findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
	  
  }
}
