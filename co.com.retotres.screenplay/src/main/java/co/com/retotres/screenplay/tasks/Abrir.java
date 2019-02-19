package co.com.retotres.screenplay.tasks;

import co.com.retotres.screenplay.userinterface.AutomatizacionHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	AutomatizacionHomePage automatizacionHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(automatizacionHomePage));
		
	}

	
	public static Abrir LaPaginaDeAutomatizacion() {
		
		return Tasks.instrumented(Abrir.class);		
		
	}
}
