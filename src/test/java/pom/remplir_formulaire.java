package pom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

 

public class remplir_formulaire {
	@Test
	public void remplir(String email, String mot_de_passe) {

		BaseClass RP = new BaseClass();
	
		RP.getWebDriver().findElement(By.name("email")).sendKeys(email);
		RP.getWebDriver().findElement(By.name("passwd")).sendKeys(mot_de_passe);

	}
}
