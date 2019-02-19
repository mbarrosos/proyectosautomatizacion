package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomatizacionRegistroDoctor extends PageObject{
	
	public static final Target CAMPO_NOMBRES = Target.the("El campo donde se ingresa el nombre completo").located(By.id("name"));
	
	public static final Target CAMPO_APELLIDOS = Target.the("El campo donde se ingresa los apellidos").located(By.id("last_name"));
	
	public static final Target CAMPO_TELEFONO = Target.the("El campo donde se ingresa el telefono").located(By.id("telephone"));
	
	public static final Target SELECCIONAR_TIPO_IDENTIDAD = Target.the("Seleccionar tipo de identidad").located(By.id("identification_type"));
	
	public static final Target CAMPO_DOCUMENTO= Target.the("El campo donde se ingresa el documento").located(By.id("identification"));
	
	public static final Target BOTON_AGREGAR= Target.the("El Botón agregar doctor").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
	
	public static final Target MENSAJE= Target.the("Muestra el mensaje de confirmacion").located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));
	
}
