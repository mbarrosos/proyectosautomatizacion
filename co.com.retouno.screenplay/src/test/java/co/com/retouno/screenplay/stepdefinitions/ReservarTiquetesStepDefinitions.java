package co.com.retouno.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import co.com.retouno.screenplay.model.DatosPersonaTiquetes;
import co.com.retouno.screenplay.model.DatosTiquetes;
import co.com.retouno.screenplay.questions.MensajeEsperado;
import co.com.retouno.screenplay.questions.MensajeServiciosAdicionales;
import co.com.retouno.screenplay.tasks.Abrir;
import co.com.retouno.screenplay.tasks.DiligenciarReserva;
import co.com.retouno.screenplay.tasks.Realizar;
import co.com.retouno.screenplay.userinterface.VivaAirHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ReservarTiquetesStepDefinitions {
	
	VivaAirHomePage vivaAirHomePage;
	
	@Before
	public void configuracionInicial() {
		setTheStage(new OnlineCast());
	}
	
	@Dado("^que Miguel quiere acceder a la Web Viva Air$")
	public void queMiguelQuiereAccederALaWebVivaAir() throws Exception {
		theActorCalled("Miguel").wasAbleTo(Abrir.LaUrl(vivaAirHomePage));
	}


	@Cuando("^el realiza la busqueda de tiquetes$")
	public void elRealizaLaBusquedaDeTiquetes(List<DatosTiquetes> datos) throws Exception {
		theActorInTheSpotlight().attemptsTo(Realizar.LaBusquedaDeTiquetes(datos));
	}
	
	@Cuando("^da clic en reservar vuelo ingresa los datos de los pasajeros$")
	public void daClicEnReservarVueloIngresaLosDatosDeLosPasajeros(List<DatosPersonaTiquetes> datospersona ) throws Exception {
		theActorInTheSpotlight().attemptsTo(DiligenciarReserva.ElFormularioPersona(datospersona));
	}

	@Entonces("^el verifique que la suma de los servicios adicionales es (.*)$")
	public void elVerifiqueQueLaSumaDeLosServiciosAdicionalesEsUSD(String mensaje) throws Exception {
		theActorInTheSpotlight().should(seeThat(MensajeServiciosAdicionales.Es(), equalTo(mensaje)));
	}
}
