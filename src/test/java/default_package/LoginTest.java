package default_package;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.BaseClass;
import pom.connexionPage;
import pom.etablir_connexionPage;
import pom.remplir_formulaire;

public class LoginTest {
	WebDriver driver;

	@BeforeTest
	public void ovrir_site() {
		BaseClass BC = new BaseClass();
		BC.ovrir_navigateur();
		driver = BC.getWebDriver();
	}

	@Test(priority = 1)
	public void ouvrir_page_connexion() {
		connexionPage opc = new connexionPage();
		opc.click_connexion();
	}

	@Test(priority = 2)
	public void remplir_formulaire_connexion() {
		remplir_formulaire RF = new remplir_formulaire();
		RF.remplir("naimiatef@gmail.com", "12345");

	}

	@Test(priority = 3)
	public void etablir_connexion() {
		etablir_connexionPage etab_conn = new etablir_connexionPage();
		etab_conn.etablir_connexion();
	}

}
