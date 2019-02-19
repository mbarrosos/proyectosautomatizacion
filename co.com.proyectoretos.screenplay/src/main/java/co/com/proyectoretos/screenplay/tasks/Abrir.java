package co.com.proyectoretos.screenplay.tasks;

import co.com.proyectoretos.screenplay.ui.TheInternerHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private TheInternerHomePage theInternetHomePage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(theInternetHomePage));
		
	}
	
	public static Abrir LaPaginaTheInternet() {
		return Tasks.instrumented(Abrir.class);
	}

}
