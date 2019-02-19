package co.com.retouno.screenplay.questions;

import co.com.retouno.screenplay.userinterface.AutomationRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeEsperado implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AutomationRegisterPage.MENSAJE_ESPERADO).viewedBy(actor).asString();
	}

	public static MensajeEsperado Es() {
		return new MensajeEsperado();
	}

}
