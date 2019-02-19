package co.com.retotres.screenplay.questions;

import co.com.retotres.screenplay.userinterface.AutomatizacionRegistroPaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeEsperadoPaciente implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(AutomatizacionRegistroPaciente.MENSAJE).viewedBy(actor).asString();
	}

	public static MensajeEsperadoPaciente Es() {
	
		return new MensajeEsperadoPaciente();
	}

}
