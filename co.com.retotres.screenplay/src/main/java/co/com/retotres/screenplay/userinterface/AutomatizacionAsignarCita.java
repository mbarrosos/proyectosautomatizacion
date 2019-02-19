package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomatizacionAsignarCita extends PageObject{
	
	public static final Target CAMPO_DIA_CITA = Target.the("El campo donde se ingresa el día de la cita").located(By.xpath("//input[@id='datepicker']"));
	
	public static final Target DIA_CITA = Target.the("").located(By.xpath("//label[@for='datepicker']"));
	
	public static final Target CAMPO_DOCUMENTO_PACIENTE = Target.the("El campo donde se ingresa el documento del paciente").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
	
	public static final Target CAMPO_DOCUMENTO_DOCTOR= Target.the("El campo donde se ingresa el docuemnto del doctor").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
	
	public static final Target TEXT_AREA_OBSERVACIONES = Target.the("campo donde se ingresa la obsewrvaciones").located(By.xpath("//textarea[@class='form-control']"));
	
	public static final Target BOTON_AGREGAR= Target.the("El Botón agregar doctor").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
	
	public static final Target MENSAJE= Target.the("Muestra el mensaje de confirmacion").located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));
	
}
