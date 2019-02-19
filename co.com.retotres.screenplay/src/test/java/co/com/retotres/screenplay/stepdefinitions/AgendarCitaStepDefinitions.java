package co.com.retotres.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.retotres.screenplay.model.DatosModelo;
import co.com.retotres.screenplay.questions.MensajeEsperadoCita;
import co.com.retotres.screenplay.questions.MensajeEsperadoDoctor;
import co.com.retotres.screenplay.tasks.Abrir;
import co.com.retotres.screenplay.tasks.AgendarCita;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AgendarCitaStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos necesita asistir al medico$")
	public void que_Carlos_necesita_asistir_al_medico() throws Exception {
	    
		carlos.wasAbleTo(Abrir.LaPaginaDeAutomatizacion());
		
	}

	@Cuando("^el realiza el agendmiento de una Cita$")
	public void el_realiza_el_agendamiento_de_una_Cita(List<DatosModelo> datosCita) throws Exception {
	    
		carlos.attemptsTo(AgendarCita.ElformularioCita(datosCita));
	}

	@Entonces("^el confirma que se presente en pantalla el mensaje (.*)$")
	public void el_confirma_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente(String mensaje) throws Exception {
	    
		carlos.should(seeThat(MensajeEsperadoCita.Es(), equalTo(mensaje)));
		
	}
	
}
