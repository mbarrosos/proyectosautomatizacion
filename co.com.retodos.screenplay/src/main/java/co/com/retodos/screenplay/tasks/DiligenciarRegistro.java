package co.com.retodos.screenplay.tasks;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.retodos.screenplay.model.DatosEmpleado;
import co.com.retodos.screenplay.userinterface.OrangeHrmAgregarEmpleadoPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmDetalleContactoPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmDetallesPersonalesPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmDetallesTrabajoPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmHomePage;
import co.com.retodos.screenplay.userinterface.OrangeHrmImportantePage;
import co.com.retodos.screenplay.userinterface.OrangeHrmListaEmpleadosPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmSubordinadoresPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmSupervisoresPage;
import co.com.retodos.screenplay.userinterface.OrangeHrmTrabajoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DiligenciarRegistro implements Task {
	
	private List<DatosEmpleado> datos;

	public DiligenciarRegistro(List<DatosEmpleado> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Click.on(OrangeHrmHomePage.BOTON_PIM));
		actor.attemptsTo(Click.on(OrangeHrmHomePage.BOTON_ADD_EMPLEADO));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmAgregarEmpleadoPage.MODAL_ADD_EMPLEADO, isVisible()).forNoMoreThan(10).seconds());
		actor.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(OrangeHrmAgregarEmpleadoPage.CAMPO_NOMBRE));
		actor.attemptsTo(Enter.theValue(datos.get(0).getSegundonombre()).into(OrangeHrmAgregarEmpleadoPage.CAMPO_SEGUNDO_NOMBRE));
		actor.attemptsTo(Enter.theValue(datos.get(0).getApellido()).into(OrangeHrmAgregarEmpleadoPage.CAMPO_APELLIDO));
		actor.attemptsTo(Click.on(OrangeHrmAgregarEmpleadoPage.SELECCIONAR_LOCALIDAD));
        actor.attemptsTo(Click.on("//span[contains(text(),'" +datos.get(0).getLocalidad()+ "')]"));		
		actor.attemptsTo(Click.on(OrangeHrmAgregarEmpleadoPage.BOTON_SIGUIENTE_EMPLEADO));
		
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmDetallesPersonalesPage.DETALLES_PERSONALES, isVisible()).forNoMoreThan(20).seconds());
		actor.attemptsTo(Click.on(OrangeHrmDetallesPersonalesPage.BOTON_SIGUIENTE));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmTrabajoPage.TRABAJO, isVisible()).forNoMoreThan(20).seconds());
		actor.attemptsTo(Click.on(OrangeHrmTrabajoPage.BOTON_SIGUIENTE));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmDetallesTrabajoPage.DETALLE_TRABAJO, isVisible()).forNoMoreThan(20).seconds());
		actor.attemptsTo(Click.on(OrangeHrmDetallesTrabajoPage.SELECCIONAR_REGION));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +datos.get(0).getRegion()+ "')]"));		
		actor.attemptsTo(Click.on(OrangeHrmDetallesTrabajoPage.SELECCIONAR_FTE));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +datos.get(0).getFte().trim()+ "')]"));		
		actor.attemptsTo(Click.on(OrangeHrmDetallesTrabajoPage.SELECCIONAR_DEPARTAMENTO_TEMPORAL));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +datos.get(0).getDepartamentotemporal()+ "')]"));		
		actor.attemptsTo(Click.on(OrangeHrmDetallesTrabajoPage.BOTON_SIGUIENTE));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmDetalleContactoPage.DETALLE_CONTACTO, isVisible()).forNoMoreThan(20).seconds());		
		actor.attemptsTo(Click.on(OrangeHrmDetalleContactoPage.BOTON_SIGUIENTE));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmSupervisoresPage.SUPERVISORES, isVisible()).forNoMoreThan(20).seconds());		
		actor.attemptsTo(Click.on(OrangeHrmSupervisoresPage.BOTON_SIGUIENTE));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmSubordinadoresPage.SUBORDINADORES, isVisible()).forNoMoreThan(20).seconds());		
		actor.attemptsTo(Click.on(OrangeHrmSubordinadoresPage.BOTON_GUARDAR_TODA_INFORMACION));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmImportantePage.IMPORTANTE, isVisible()).forNoMoreThan(20).seconds());		
		actor.attemptsTo(Click.on(OrangeHrmImportantePage.GRUPO_SANGUINEO));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +datos.get(0).getGruposanguineo()+ "')]"));
		actor.attemptsTo(Enter.theValue(datos.get(0).getActividad()).into(OrangeHrmImportantePage.CAMPO_HOBBIE));
		actor.attemptsTo(Click.on(OrangeHrmImportantePage.BOTON_GUARDAR_IMPORTANTE));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmListaEmpleadosPage.LISTA_EMPLEADO, isVisible()).forNoMoreThan(20).seconds());
		actor.attemptsTo(Click.on(OrangeHrmListaEmpleadosPage.LISTA_EMPLEADO));
		actor.attemptsTo(WaitUntil.the(OrangeHrmListaEmpleadosPage.TITULO_LISTA, isVisible()).forNoMoreThan(20).seconds());
		actor.attemptsTo(Enter.theValue(datos.get(0).nombreCompleto()).into(OrangeHrmListaEmpleadosPage.CAMPO_BUSCAR));
		actor.attemptsTo(Click.on(OrangeHrmListaEmpleadosPage.ICONO_BUSCAR));
		
		actor.attemptsTo(WaitUntil.the(OrangeHrmListaEmpleadosPage.EMPLEADO_ESPERADO, isVisible()).forNoMoreThan(20).seconds());
		actor.attemptsTo(Click.on(OrangeHrmListaEmpleadosPage.EMPLEADO_ESPERADO));
	}

	public static DiligenciarRegistro ElformularioDeRegistroEmpleado(List<DatosEmpleado> datos) {
		
		return Tasks.instrumented(DiligenciarRegistro.class, datos);
	
	}

}
