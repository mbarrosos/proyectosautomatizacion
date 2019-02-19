package co.com.retouno.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import co.com.retouno.screenplay.model.RegistroAutomationDemo;
import co.com.retouno.screenplay.questions.MensajeEsperado;
import co.com.retouno.screenplay.tasks.Abrir;
import co.com.retouno.screenplay.tasks.Diligenciar;
import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroUsuarioStepDefinitios {
	AutomationHomePage automationHomePage;
	
	@Before
	public void configuracionInicial() {
		setTheStage(new OnlineCast());
	}
	
	@Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosquiereAcceder_a_la_Web_Automation_Demo_Site() throws Exception {
	    theActorCalled("Carlos").wasAbleTo(Abrir.LaUrl(automationHomePage));
	}

	@Cuando("^el realiza el registro en la página$")
	public void el_realiza_el_registro_en_la_página(List<RegistroAutomationDemo> registroAutomationDemo) throws Exception { 
		theActorInTheSpotlight().attemptsTo(Diligenciar.ElformularioDeRegistro(registroAutomationDemo));
	}

	@Entonces("^el verifica que se carga la pantalla con texto (.*)$")
	public void el_verifica_que_se_carga_la_pantalla_con_texto_Double_Click_on_Edit_Icon_to_EDIT_the_Table_Row(String mensaje) throws Exception {
		theActorInTheSpotlight().should(seeThat(MensajeEsperado.Es(), equalTo(mensaje)));
	}

}
