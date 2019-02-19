package co.com.retodos.screenplay.questions;

import co.com.retodos.screenplay.userinterface.OrangeHrmListaEmpleadosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class EmpleadoEsperado implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(OrangeHrmListaEmpleadosPage.EMPLEADO_ESPERADO).viewedBy(actor).asString();
	}

	public static EmpleadoEsperado Es() {
		return new EmpleadoEsperado();
	}

}
