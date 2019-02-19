package co.com.retouno.screenplay.questions;

import co.com.retouno.screenplay.userinterface.VivaAirServiciosAdicionalesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeServiciosAdicionales implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(VivaAirServiciosAdicionalesPage.MENSAJE_DE_SERVICIOS_ADICIONALES).viewedBy(actor).asString();
	}

	public static MensajeServiciosAdicionales Es() {
		return new MensajeServiciosAdicionales();
	}

}
