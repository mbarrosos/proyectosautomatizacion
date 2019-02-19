package co.com.proyectoretos.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.proyectoretos.screenplay.tasks.Abrir;
import co.com.proyectoretos.screenplay.tasks.Loguearme;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LoginVentanaEmergenteStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor miguel = Actor.named("Miguel");
	
	@Before
	public void configuracionInicial() {
		miguel.can(BrowseTheWeb.with(hisBrowser));
	}
	
	/*@Dado("^que Miguel quiere ingresar a the internet$")
	public void que_Miguel_quiere_ingresar_a_the_internet() throws Exception {
		
		miguel.wasAbleTo(Abrir.LaPaginaTheInternet());
	    
	}

	@Cuando("^el ingresa usuario (.*)$")
	public void el_ingresa_usuario_admin(String user) throws Exception {
		
		miguel.notify();
	   
	}

	@Cuando("^contrasena (.*)$")
	public void contrasena_admin(String clave) throws Exception {
		
		miguel.notify();
	  
	}

	@Entonces("^deberia ver la pantalla de bienvenida$")
	public void deberia_ver_la_pantalla_de_bienvenida() throws Exception {
	    
	}*/
}
