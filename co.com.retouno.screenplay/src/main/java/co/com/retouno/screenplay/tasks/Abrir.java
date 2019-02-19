package co.com.retouno.screenplay.tasks;

import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import co.com.retouno.screenplay.userinterface.VivaAirHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	AutomationHomePage automationHomePage;
	VivaAirHomePage vivaAirHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(vivaAirHomePage));
	}

//	public static Abrir LaPaginaDeAutomation() {
//		return Tasks.instrumented(Abrir.class);
//	}

	public static Abrir LaUrl(AutomationHomePage automationHomePage) {
		return Tasks.instrumented(Abrir.class);
	}

	public static Abrir LaUrl(VivaAirHomePage vivaAirHomePage) {
		return Tasks.instrumented(Abrir.class);
	}



}
