package co.com.retotres.screenplay.questions;

import co.com.retotres.screenplay.userinterface.AutomatizacionAsignarCita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeEsperadoCita implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(AutomatizacionAsignarCita.MENSAJE).viewedBy(actor).asString();
	}

	public static MensajeEsperadoCita Es() {
		
		return new MensajeEsperadoCita();
	}

}
