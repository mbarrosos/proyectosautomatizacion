package co.com.retodos.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.retodos.screenplay.model.DatosEmpleado;
import co.com.retodos.screenplay.questions.EmpleadoEsperado;
import co.com.retodos.screenplay.tasks.Abrir;
import co.com.retodos.screenplay.tasks.DiligenciarRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroEmpleadoStepDefinitions {
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor juan = Actor.named("Juan");
	
	@Before
	public void configuracionInicial() {
		
		juan.can(BrowseTheWeb.with(hisBrowser));
	
	}
	
	@Dado("^que Juan necesita crear un empleado en el OrageHR$")
	public void que_Juan_necesita_crear_un_empleado_en_el_OrageHR() throws Exception {
		
		juan.wasAbleTo(Abrir.LaPaginaDeOrangeHrm());
	
	}

	@Cuando("^el realiza el ingreso del registro en la aplicacion$")
	public void el_realiza_el_ingreso_del_registro_en_la_aplicacion(List<DatosEmpleado> datos) throws Exception {
		
		juan.attemptsTo(DiligenciarRegistro.ElformularioDeRegistroEmpleado(datos));
	  
	}

	@Entonces("^el visualiza el nuevo empleado en el aplicativo$")
	public void el_visualiza_el_nuevo_empleado_en_el_aplicativo() throws Exception {
	   
		juan.should(seeThat(EmpleadoEsperado.Es(),  Matchers.equalTo("Juanito manuel alimaña")));
		
	}
	
}
