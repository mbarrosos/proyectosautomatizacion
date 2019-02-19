package co.com.retouno.screenplay.tasks;

import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private AutomationHomePage automationHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(automationHomePage));
	}

	public static Abrir LaPaginaAutomation() {
		return Tasks.instrumented(Abrir.class);
	}

}
