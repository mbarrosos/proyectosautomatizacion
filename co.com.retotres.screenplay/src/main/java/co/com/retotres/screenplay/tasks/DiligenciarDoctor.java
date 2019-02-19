package co.com.retotres.screenplay.tasks;

import java.util.List;

import co.com.retotres.screenplay.model.DatosModelo;
import co.com.retotres.screenplay.userinterface.AutomatizacionHomePage;
import co.com.retotres.screenplay.userinterface.AutomatizacionRegistroDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DiligenciarDoctor implements Task {
	
	private List<DatosModelo> datosDoctor;
	
	public DiligenciarDoctor(List<DatosModelo> datosDoctor) {
		super();
		this.datosDoctor = datosDoctor;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AutomatizacionHomePage.BOTON_AGREGAR_DOCTOR));
		
		actor.attemptsTo(Enter.theValue(datosDoctor.get(0).getNombres()).into(AutomatizacionRegistroDoctor.CAMPO_NOMBRES));
		actor.attemptsTo(Enter.theValue(datosDoctor.get(0).getApellidos()).into(AutomatizacionRegistroDoctor.CAMPO_APELLIDOS));
		actor.attemptsTo(Enter.theValue(datosDoctor.get(0).getTelefono()).into(AutomatizacionRegistroDoctor.CAMPO_TELEFONO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosDoctor.get(0).getTipo()).from(AutomatizacionRegistroDoctor.SELECCIONAR_TIPO_IDENTIDAD));
		actor.attemptsTo(Enter.theValue(datosDoctor.get(0).getDocumento()).into(AutomatizacionRegistroDoctor.CAMPO_DOCUMENTO));
		
		actor.attemptsTo(Click.on(AutomatizacionRegistroDoctor.BOTON_AGREGAR));
	}

	public static DiligenciarDoctor ElformularioRegistroDoctor(List<DatosModelo> datosDoctor) {
		
		return Tasks.instrumented(DiligenciarDoctor.class, datosDoctor);
	}

}
