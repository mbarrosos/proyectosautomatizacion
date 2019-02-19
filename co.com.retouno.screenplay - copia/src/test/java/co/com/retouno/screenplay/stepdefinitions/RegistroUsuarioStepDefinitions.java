package co.com.retouno.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.retouno.screenplay.tasks.Abrir;
import co.com.retouno.screenplay.tasks.Diligenciar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroUsuarioStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void que_Carlos_quiere_acceder_a_la_Web_Automation_Demo_Site() throws Exception {
	    carlos.wasAbleTo(Abrir.LaPaginaAutomation());
	}

	@Cuando("^el realiza el registro en la página$")
	public void el_realiza_el_registro_en_la_página() throws Exception {
		
		carlos.attemptsTo(Diligenciar.ElformularioDeRegistro());
	    
	}

	@Entonces("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row$")
	public void el_verifica_que_se_carga_la_pantalla_con_texto_Double_Click_on_Edit_Icon_to_EDIT_the_Table_Row() throws Exception {
	  
	}

}
