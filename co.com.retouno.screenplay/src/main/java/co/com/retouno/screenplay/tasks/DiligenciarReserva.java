package co.com.retouno.screenplay.tasks;

import static co.com.retouno.screenplay.interactions.SeleccionarLista.Desde;
import static co.com.retouno.screenplay.userinterface.VivaAirReservarPage.*;
import static co.com.retouno.screenplay.userinterface.VivaAirServiciosAdicionalesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

import co.com.retouno.screenplay.interactions.Wait5;
import co.com.retouno.screenplay.model.DatosPersonaTiquetes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DiligenciarReserva implements Task{
	
	private List<DatosPersonaTiquetes> datospersona;
	
	public DiligenciarReserva(List<DatosPersonaTiquetes> datospersona) {
		super();
		this.datospersona = datospersona;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(datospersona.get(0).getNombreadulto()).into(CAMPO_NOMBRE_ADULTO),
						Enter.theValue(datospersona.get(0).getApellidoadulto()).into(CAMPO_APELLIDO_ADULTO),
						Enter.theValue(datospersona.get(0).getDocumentoadulto()).into(CAMPO_DOCUMENTO_ADULTO),
						Enter.theValue(datospersona.get(0).getCorreo()).into(CAMPO_EMAIL_ADULTO),
						Enter.theValue(datospersona.get(0).getCorreo()).into(CAMPO_CONFIRMA_EMAIL_ADULTO),
						Enter.theValue(datospersona.get(0).getCelularadulto()).into(CAMPO_TELEFONO_ADULTO),
						Enter.theValue(datospersona.get(0).getNombreninio()).into(CAMPO_NOMBRE_NINIO),
						Enter.theValue(datospersona.get(0).getApellidoninio()).into(CAMPO_APELLIDO_NINIO),
						Type.theValue(datospersona.get(0).getFechanacimientoninio()).into(FECHA_NACIMIENTO_NINIO),
						Click.on(SELECCIONAR_GENERO_NINIO),
						Desde(BUSCAR_GENERO_NINIO, datospersona.get(0).getGeneroninio().trim()),						
						Enter.theValue(datospersona.get(0).getDocumentoninio()).into(CAMPO_IDENTIFICACION_NINIO),
						Enter.theValue(datospersona.get(1).getNombreninio()).into(CAMPO_NOMBRE_NINIO2),
						Enter.theValue(datospersona.get(1).getApellidoninio()).into(CAMPO_APELLIDO_NINIO2),
						Type.theValue(datospersona.get(1).getFechanacimientoninio()).into(FECHA_NACIMIENTO_NINIO2),
						Click.on(SELECCIONAR_GENERO_NINIO2),
						Desde(BUSCAR_GENERO_NINIO2, datospersona.get(1).getGeneroninio().trim()),						
						Enter.theValue(datospersona.get(1).getDocumentoninio()).into(CAMPO_IDENTIFICACION_NINIO2),
						Enter.theValue(datospersona.get(0).getNombreinfante()).into(CAMPO_NOMBRE_INFANTE),
						Enter.theValue(datospersona.get(0).getApellidoinfante()).into(CAMPO_APELLIDO_INFANTE),
						Type.theValue(datospersona.get(0).getFechanacimientoinfante()).into(FECHA_NACIMIENTO_INFANTE),
						WaitUntil.the(VIAJA_CON, isVisible()).forNoMoreThan(20).seconds(),
						Click.on(VIAJA_CON),						
						Click.on(BOTON_CONTINUAR),
						Wait5.aMoment());
	
		actor.attemptsTo(Click.on(EQUIPAJE_EN_CABINA),
				Desde(SELECCIONAR_EQUIPAJE_EN_CABINA, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(EQUIPAJE_EN_CABINA2),
				Desde(SELECCIONAR_EQUIPAJE_EN_CABINA2, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(EQUIPAJE_EN_CABINA3),
				Desde(SELECCIONAR_EQUIPAJE_EN_CABINA3, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(EQUIPAJE_EN_BODEGA),
				Desde(SELECCIONAR_EQUIPAJE_EN_BODEGA, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(EQUIPAJE_EN_BODEGA2),
				Desde(SELECCIONAR_EQUIPAJE_EN_BODEGA2, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(EQUIPAJE_EN_BODEGA3),
				Desde(SELECCIONAR_EQUIPAJE_EN_BODEGA3, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(CHECKIN_EN_AEREOPUERTO),
				Desde(SELECCIONAR_CHECKIN_EN_AEREOPUERTO, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(CHECKIN_EN_AEREOPUERTO2),
				Desde(SELECCIONAR_CHECKIN_EN_AEREOPUERTO2, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(CHECKIN_EN_AEREOPUERTO3),
				Desde(SELECCIONAR_CHECKIN_EN_AEREOPUERTO3, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(FILA_RAPIDA),
				Desde(SELECCIONAR_FILA_RAPIDA, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(CANCELA_TRANQUILO),
				Desde(SELECCIONAR_CANCELA_TRANQUILO, datospersona.get(0).getServiciosadicionales().trim()),
				Click.on(CHECKBOX_VIAJE_ASEGURADO),
				Click.on(CONTINUAR),
				Wait5.aMoment(),
				Click.on(NO_GRACIAS)
				//Click.on(NO_SELECCIONAR_ASIENTOS)
				);
										
	}

	public static DiligenciarReserva ElFormularioPersona(List<DatosPersonaTiquetes> datospersona) {
		return Tasks.instrumented(DiligenciarReserva.class, datospersona);
	}

}
