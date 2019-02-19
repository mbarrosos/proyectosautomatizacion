package co.com.proyectoretos.screenplay.tasks;

import org.openqa.selenium.WebDriver;

import co.com.proyectoretos.screenplay.ui.TheInternerHomePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearme implements Task {
	
	/*private String usuario;
	private String clave;*/
	
	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	
	/*public Loguearme(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}*/

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//actor.attemptsTo(Click.on(TheInternerHomePage.linkAutenticacion));
		
		//actor.attemptsTo(Enter.theValue(usuario).into(TheInternerHomePage.linkAutenticacion));
		//actor.attemptsTo(Enter.theValue(clave).into(TheInternerHomePage.linkAutenticacion));
		
		String urlAutentica=TheInternerHomePage.linkAutenticacion.getAttribute("href");
		String urlAutenticacion=urlAutentica.substring(0,7)+"admin:admin@the-internet.herokuapp.com/basic_auth";
		
		driver.get(urlAutenticacion);
		
		
	}

	/*public static Loguearme ConUsuario(String user) {
		return Tasks.instrumented(Loguearme.class, user);
	}

	public static Loguearme ConContrasena(String clave) {
		return Tasks.instrumented(Loguearme.class, clave);
	}*/

}
