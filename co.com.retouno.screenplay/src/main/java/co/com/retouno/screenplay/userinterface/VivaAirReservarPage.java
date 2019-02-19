package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirReservarPage extends PageObject {
	
	public static final Target CAMPO_NOMBRE_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Adults[0].FirstName\"]"));
	public static final Target CAMPO_APELLIDO_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Adults[0].LastName\"]"));
	public static final Target SELECCIONAR_GENERO_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"s2id_Adults[0].gender\"]"));
	public static final Target BUSCAR_GENERO_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target CAMPO_DOCUMENTO_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Adults[0].IdentificationNumber\"]"));
	public static final Target CAMPO_EMAIL_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Passengers[0].email\"]"));
	public static final Target CAMPO_CONFIRMA_EMAIL_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Passengers[0].repeatemail\"]"));
	public static final Target CAMPO_TELEFONO_ADULTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Passengers0_mobile\"]"));
	
	public static final Target CAMPO_NOMBRE_NINIO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Children[1].FirstName\"]"));
	public static final Target CAMPO_APELLIDO_NINIO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Children[1].LastName\"]"));
	public static final Target FECHA_NACIMIENTO_NINIO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Passengers_1__NativeDateOfBirth\"]"));
	public static final Target SELECCIONAR_GENERO_NINIO = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_Children[1].gender']"));
	public static final Target BUSCAR_GENERO_NINIO = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target CAMPO_IDENTIFICACION_NINIO = Target.the("El campo para ").located(By.xpath("//*[@id=\"Children[1].IdentificationNumber\"]"));
	
	public static final Target CAMPO_NOMBRE_NINIO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"Children[2].FirstName\"]"));
	public static final Target CAMPO_APELLIDO_NINIO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"Children[2].LastName\"]"));
	public static final Target FECHA_NACIMIENTO_NINIO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"Passengers_2__NativeDateOfBirth\"]"));
	public static final Target SELECCIONAR_GENERO_NINIO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"s2id_Children[2].gender\"]"));
	public static final Target BUSCAR_GENERO_NINIO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target CAMPO_IDENTIFICACION_NINIO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"Children[2].IdentificationNumber\"]"));
	
	public static final Target CAMPO_NOMBRE_INFANTE = Target.the("El campo para ").located(By.xpath("//*[@id=\"Infants[3].FirstName\"]"));
	public static final Target CAMPO_APELLIDO_INFANTE = Target.the("El campo para ").located(By.xpath("//*[@id=\"Infants[3].LastName\"]"));
	public static final Target FECHA_NACIMIENTO_INFANTE = Target.the("El campo para ").located(By.xpath("//*[@id=\"Passengers_3__NativeDateOfBirth\"]"));
	public static final Target VIAJA_CON = Target.the("").located(By.xpath("//*[@id=\"passengerDetailsForm-0-infant-3\"]/div[6]/label"));
	
	public static final Target BOTON_CONTINUAR = Target.the("El campo para ").located(By.xpath("//*[@id=\"btnContinuePassengerDetails\"]"));
}
