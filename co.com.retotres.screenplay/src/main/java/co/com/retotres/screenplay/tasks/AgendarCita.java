package co.com.retotres.screenplay.tasks;

import java.util.List;

import co.com.retotres.screenplay.model.DatosModelo;
import co.com.retotres.screenplay.userinterface.AutomatizacionAsignarCita;
import co.com.retotres.screenplay.userinterface.AutomatizacionHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgendarCita implements Task {
	
	private List<DatosModelo> datosCita;
	
	public AgendarCita(List<DatosModelo> datosCita) {
		super();
		this.datosCita = datosCita;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AutomatizacionHomePage.BOTON_ASIGNAR_CITA));
		
		actor.attemptsTo(Enter.theValue(datosCita.get(0).getDiacita()).into(AutomatizacionAsignarCita.CAMPO_DIA_CITA));
		actor.attemptsTo(Click.on(AutomatizacionAsignarCita.TEXT_AREA_OBSERVACIONES));
		actor.attemptsTo(Enter.theValue(datosCita.get(0).getDocumentodelpaciente()).into(AutomatizacionAsignarCita.CAMPO_DOCUMENTO_PACIENTE));
		actor.attemptsTo(Enter.theValue(datosCita.get(0).getDocumentodeldoctor()).into(AutomatizacionAsignarCita.CAMPO_DOCUMENTO_DOCTOR));
		actor.attemptsTo(Enter.theValue(datosCita.get(0).getObservaciones()).into(AutomatizacionAsignarCita.TEXT_AREA_OBSERVACIONES));
		
		actor.attemptsTo(Click.on(AutomatizacionAsignarCita.BOTON_AGREGAR));
		
	}

	public static AgendarCita ElformularioCita(List<DatosModelo> datosCita) {
		
		return Tasks.instrumented(AgendarCita.class, datosCita);
	}

}
