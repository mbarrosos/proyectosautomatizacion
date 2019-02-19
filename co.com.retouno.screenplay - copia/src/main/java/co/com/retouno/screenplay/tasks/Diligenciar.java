package co.com.retouno.screenplay.tasks;

import org.openqa.selenium.support.ui.Select;

import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import co.com.retouno.screenplay.userinterface.AutomationRegisterPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Diligenciar implements Task {

	
	private String genero="hobre";
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AutomationHomePage.BOTON_SKIP_SIGN_IN));
		
		actor.attemptsTo(Enter.theValue("Carlos").into(AutomationRegisterPage.CAMPO_NOMBRE));
		actor.attemptsTo(Enter.theValue("Ochoa").into(AutomationRegisterPage.CAMPO_APELLIDO));
		actor.attemptsTo(Enter.theValue("CL 23 # 34 90").into(AutomationRegisterPage.CAMPO_DIRECCION));
		actor.attemptsTo(Enter.theValue("carlos@choucair.com").into(AutomationRegisterPage.CAMPO_EMAIL));
		actor.attemptsTo(Enter.theValue("1234556634").into(AutomationRegisterPage.CAMPO_TELEFONO));
		
		if(genero == "hombre") {
			actor.attemptsTo(Click.on(AutomationRegisterPage.RADIO_GENEROH));
		}else {
			actor.attemptsTo(Click.on(AutomationRegisterPage.RADIO_GENEROM));
		}
		
		//actor.attemptsTo(Click.on(By.id("checkbox2")));
		actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIE));
		
		//Select onSeleccion = new Select(By.)
	}

	public static Diligenciar ElformularioDeRegistro() {
		return Tasks.instrumented(Diligenciar.class);
	}

}
