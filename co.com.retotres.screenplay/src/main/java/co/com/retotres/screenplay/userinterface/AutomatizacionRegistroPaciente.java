package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomatizacionRegistroPaciente extends PageObject{
	
	public static final Target CAMPO_NOMBRES = Target.the("El campo donde se ingresa el nombre completo").located(By.xpath("//input[@placeholder='Ingrese el nombre']"));
	
	public static final Target CAMPO_APELLIDOS = Target.the("El campo donde se ingresa los apellidos").located(By.xpath("//input[@placeholder='Ingrese los apellidos']"));
	
	public static final Target CAMPO_TELEFONO = Target.the("El campo donde se ingresa el telefono").located(By.xpath("//input[@placeholder='Ingrese el teléfono']"));
	
	public static final Target SELECCIONAR_TIPO_IDENTIDAD = Target.the("Seleccionar tipo de identidad").located(By.xpath("//select[@name='identification_type']"));
	
	public static final Target CAMPO_DOCUMENTO= Target.the("El campo donde se ingresa el documento").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad']"));
	
	public static final Target BOTON_AGREGAR= Target.the("El Botón agregar doctor").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
	
	public static final Target MENSAJE= Target.the("Muestra el mensaje de confirmacion").located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));
	
	public static final Target SALUD_PREPAGADA= Target.the("Checkar salud prepagada").located(By.xpath("//input[@name='prepaid']"));
	
}
