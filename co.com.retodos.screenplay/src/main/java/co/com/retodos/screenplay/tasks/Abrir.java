package co.com.retodos.screenplay.tasks;

import co.com.retodos.screenplay.userinterface.OrangeHrmLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	OrangeHrmLoginPage orangeHrmLoginPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(orangeHrmLoginPage));
		
		actor.attemptsTo(Enter.theValue("admin").into(OrangeHrmLoginPage.CAMPO_USUARIO));
		actor.attemptsTo(Enter.theValue("@NF8KRpfj4").into(OrangeHrmLoginPage.CAMPO_CONTRASENA));
		actor.attemptsTo(Click.on(OrangeHrmLoginPage.BOTON_LOGIN));
		
		
	}

	public static Abrir LaPaginaDeOrangeHrm() {
		return Tasks.instrumented(Abrir.class);
	}

}
