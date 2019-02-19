package co.com.retotres.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.retotres.screenplay.model.DatosModelo;
import co.com.retotres.screenplay.questions.MensajeEsperadoPaciente;
import co.com.retotres.screenplay.tasks.Abrir;
import co.com.retotres.screenplay.tasks.DiligenciarPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroPacienteStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos necesita registrar un nuevo paciente$")
	public void que_Carlos_necesita_registrar_un_nuevo_paciente() throws Exception {
	    
		carlos.wasAbleTo(Abrir.LaPaginaDeAutomatizacion());
		
	}

	@Cuando("^el realiza el registro en el aplicativo de Administración de Hospitales$")
	public void el_realiza_el_registro_en_el_aplicativo_de_Administración_de_Hospitales(List<DatosModelo> datosPaciente) throws Exception {
	    
		carlos.attemptsTo(DiligenciarPaciente.ElformularioRegistroPaciente(datosPaciente));
		
	}

	@Entonces("^el verifica que muestre en pantalla el mensaje (.*)$")
	public void el_verifica_que_muestre_en_pantalla_el_mensaje_Datos_guardados_correctamente(String mensaje) throws Exception {
	    
		carlos.should(seeThat(MensajeEsperadoPaciente.Es(), equalTo(mensaje)));
		
	}	
	
}
