package co.com.retotres.screenplay.questions;

import co.com.retotres.screenplay.userinterface.AutomatizacionRegistroDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeEsperadoDoctor implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(AutomatizacionRegistroDoctor.MENSAJE).viewedBy(actor).asString();
		
	}

	public static MensajeEsperadoDoctor Es() {
		
		return new MensajeEsperadoDoctor();
	}
	
}
