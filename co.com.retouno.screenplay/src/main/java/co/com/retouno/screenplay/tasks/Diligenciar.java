package co.com.retouno.screenplay.tasks;

import static co.com.retouno.screenplay.userinterface.AutomationRegisterPage.CAMPO_APELLIDO;
import static co.com.retouno.screenplay.userinterface.AutomationRegisterPage.CAMPO_DIRECCION;
import static co.com.retouno.screenplay.userinterface.AutomationRegisterPage.CAMPO_NOMBRE;

import java.util.List;

import co.com.retouno.screenplay.interactions.SeleccionarLista;
import co.com.retouno.screenplay.model.RegistroAutomationDemo;
import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import co.com.retouno.screenplay.userinterface.AutomationRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

public class Diligenciar implements Task {
	
	private List<RegistroAutomationDemo> registroAutomationDemo;
	
	public Diligenciar(List<RegistroAutomationDemo> registroAutomationDemo) {
		super();
		this.registroAutomationDemo = registroAutomationDemo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AutomationHomePage.BOTON_SKIP_SIGN_IN),
				Enter.theValue(registroAutomationDemo.get(0).getNombre()).into(CAMPO_NOMBRE)
				);
		
		actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getNombre()).into(CAMPO_NOMBRE));
		actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getApellido()).into(CAMPO_APELLIDO));
		actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getDireccion()).into(CAMPO_DIRECCION));
		actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getEmail()).into(AutomationRegisterPage.CAMPO_EMAIL));
		actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getCelular()).into(AutomationRegisterPage.CAMPO_TELEFONO));
		
		actor.attemptsTo(Check.whether(registroAutomationDemo.get(0).getGenero().trim().equals("Masculino"))
                .andIfSo(Click.on(AutomationRegisterPage.RADIO_GENEROH))
                .otherwise(Click.on(AutomationRegisterPage.RADIO_GENEROM)));
		
		if (registroAutomationDemo.get(0).getActividad().trim().equals("Cricket") ) {
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIE_CRICKET));
		}else if(registroAutomationDemo.get(0).getActividad().trim().equals("Movies")) {
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIE_MOVIES));
		}else {
			actor.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIE_HOCKEY));
		}
		
		actor.attemptsTo(Click.on(AutomationRegisterPage.SELECCIONAR_LENGUAJE));
		actor.attemptsTo(SeleccionarLista.Desde(AutomationRegisterPage.BUSCAR_LENGUAJE, registroAutomationDemo.get(0).getLenguajes().trim()));
        actor.attemptsTo(Click.on(AutomationRegisterPage.LENGUAJE));
        
        actor.attemptsTo(SelectFromOptions.byVisibleText(registroAutomationDemo.get(0).getHabilidades()).from(AutomationRegisterPage.SELECCIONAR_HABILIDADES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(registroAutomationDemo.get(0).getPais()).from(AutomationRegisterPage.SELECCIONAR_PAIS));
        actor.attemptsTo(SelectFromOptions.byVisibleText(registroAutomationDemo.get(0).getSeleccionarpais()).from(AutomationRegisterPage.SELECCIONAR_CIUDAD));
        actor.attemptsTo(SelectFromOptions.byVisibleText(registroAutomationDemo.get(0).getAnio()).from(AutomationRegisterPage.SELECCIONAR_ANIO));
        actor.attemptsTo(SelectFromOptions.byVisibleText(registroAutomationDemo.get(0).getMes()).from(AutomationRegisterPage.SELECCIONAR_MES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(registroAutomationDemo.get(0).getDia()).from(AutomationRegisterPage.SELECCIONAR_DIA));
        
        actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getContrasena()).into(AutomationRegisterPage.CAMPO_CONTRASENA));
        actor.attemptsTo(Enter.theValue(registroAutomationDemo.get(0).getContrasena()).into(AutomationRegisterPage.CAMPO_CONFIRMA_CONTRASENA));
        
        actor.attemptsTo(Click.on(AutomationRegisterPage.BOTON_REGISTRAR));
	}

	public static Diligenciar ElformularioDeRegistro(List<RegistroAutomationDemo> registroAutomationDemo) {
		return Tasks.instrumented(Diligenciar.class, registroAutomationDemo);
	}

}
