package co.com.retotres.screenplay.tasks;

import java.util.List;

import co.com.retotres.screenplay.model.DatosModelo;
import co.com.retotres.screenplay.userinterface.AutomatizacionHomePage;
import co.com.retotres.screenplay.userinterface.AutomatizacionRegistroPaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DiligenciarPaciente implements Task {
	
	private List<DatosModelo> datosPaciente;
	
	public DiligenciarPaciente(List<DatosModelo> datosPaciente) {
		super();
		this.datosPaciente = datosPaciente;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AutomatizacionHomePage.BOTON_AGREGAR_PACIENTE));
		
		actor.attemptsTo(Enter.theValue(datosPaciente.get(0).getNombres()).into(AutomatizacionRegistroPaciente.CAMPO_NOMBRES));
		actor.attemptsTo(Enter.theValue(datosPaciente.get(0).getApellidos()).into(AutomatizacionRegistroPaciente.CAMPO_APELLIDOS));
		actor.attemptsTo(Enter.theValue(datosPaciente.get(0).getTelefono()).into(AutomatizacionRegistroPaciente.CAMPO_TELEFONO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosPaciente.get(0).getTipo()).from(AutomatizacionRegistroPaciente.SELECCIONAR_TIPO_IDENTIDAD));
		actor.attemptsTo(Enter.theValue(datosPaciente.get(0).getDocumento()).into(AutomatizacionRegistroPaciente.CAMPO_DOCUMENTO));
		actor.attemptsTo(Click.on(AutomatizacionRegistroPaciente.SALUD_PREPAGADA));
		
		actor.attemptsTo(Click.on(AutomatizacionRegistroPaciente.BOTON_AGREGAR));
		
	}

	public static DiligenciarPaciente ElformularioRegistroPaciente(List<DatosModelo> datosPaciente) {
		
		return Tasks.instrumented(DiligenciarPaciente.class, datosPaciente);
	}

}
