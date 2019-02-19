package co.com.retouno.screenplay.tasks;

import java.util.List;

import static co.com.retouno.screenplay.interactions.SeleccionarLista.*;
import static co.com.retouno.screenplay.interactions.SeleccionarMenorValor.*;
import co.com.retouno.screenplay.model.DatosTiquetes;

import static co.com.retouno.screenplay.userinterface.VivaAirHomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Realizar implements Task {
	
	private List<DatosTiquetes> datos;
	
	public Realizar(List<DatosTiquetes> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Scroll.to(BOTON_RESERVA),
				 Click.on(SELECCIONAR_ORIGEN),
				 Desde(BUSCAR_ORIGEN, datos.get(0).getOrigen().trim()),
				 Click.on(SELECCIONAR_DESTINO),
				 Desde(BUSCAR_DESTINO, datos.get(0).getDestino().trim()),
				 Enter.theValue(datos.get(0).getFecharegreso()).into(FECHA_REGRESO),
				 Enter.theValue(datos.get(0).getFechaida()).into(FECHA_IDA),
				 Click.on(SELECIONAR_ADULTO),
				 Desde(BUSCAR_NUMERO_ADULTO, datos.get(0).getNumeropasajero().trim()),
				 Click.on(SELECIONAR_NINIO),
				 Desde(BUSCAR_NUMERO_NINIO, datos.get(0).getNumeroninio().trim()),
				 Click.on(SELECIONAR_INFANTE),
				 Desde(BUSCAR_NUMERO_INFANTE, datos.get(0).getNumeroinfante().trim()),
				 Click.on(PRECIOS_MES),
				 Click.on(SELECCIONAR_MONEDA),
				 Desde(BUSCAR_MONEDA, datos.get(0).getMoneda().trim()),
				 Click.on(BOTON_RESERVA),
				 WaitUntil.the(TU_COMPRA, isVisible()).forNoMoreThan(20).seconds(),
				 ApartirDe(TARIFA_MAS_BAJA_IDA),
				 ApartirDe(TARIFA_MAS_BAJA_REGRESO),
				 Click.on(BOTON_CONTINUAR),
				 WaitUntil.the(PRODUCTO_VIVA, isVisible()).forNoMoreThan(20).seconds(),
				 Click.on(PRECIO_BASICO_IDA),
				 Click.on(PRECIO_BASICO_REGRESO),
				 WaitUntil.the(ACEPTO_TERMINOS, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(ACEPTO_TERMINOS)
				);
		
	}

	public static Realizar LaBusquedaDeTiquetes(List<DatosTiquetes> datos) {
		return Tasks.instrumented(Realizar.class, datos);
	}

}
