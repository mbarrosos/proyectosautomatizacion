package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationRegisterPage extends PageObject {
	
	public static final Target CAMPO_NOMBRE = Target.the("El campo donde se ingresa el nombre").located(By.xpath("//input[@placeholder='First Name']"));
	
	public static final Target CAMPO_APELLIDO = Target.the("El campo donde se ingresa el apellido").located(By.xpath("//input[@placeholder='Last Name']"));
	
	public static final Target CAMPO_DIRECCION = Target.the("El campo donde se ingresa la direccion").located(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
	
	public static final Target CAMPO_EMAIL = Target.the("El campo donde se ingresa el Email").located(By.xpath("//input[@type='email']"));
	
	public static final Target CAMPO_TELEFONO = Target.the("El campo donde se ingresa el Telefono").located(By.xpath("//input[@type='tel']"));
	
	public static final Target RADIO_GENEROH = Target.the("El radio buutón donde se selecciona el genero").located(By.xpath("//input[@value='Male']"));
	
	public static final Target RADIO_GENEROM = Target.the("El radio buutón donde se selecciona el genero").located(By.xpath("//input[@value='FeMale']"));
	
	public static final Target CHECKBOX_HOBBIE = Target.the("El Checkbox donde se selecciona el Hobbie").located(By.xpath("//input[@id='checkbox2']"));
	
	public static final Target SELECCIONAR_LENGUAJE = Target.the("El campo donde se seleccion el lenguaje").located(By.xpath("//div[@id='msdd']"));
	
	public static final Target SELECCIONAR_LENGUAJEEN = Target.the("El campo donde se seleccion el lenguaje").located(By.xpath("//div[@class='ui-autocomplete-multiselect-item']"));
	
	public static final Target SELECCIONAR_HABILIDADES = Target.the("El campo donde se selecciona habilidades").located(By.xpath("//select[@id='Skills']"));
	
	public static final Target SELECCIONAR_PAIS = Target.the("El campo donde se selecciona el pais").located(By.xpath("//select[@id='countries']"));
	
	public static final Target SELECCIONAR_CIUDAD = Target.the("El campo donde se selecciona la ciudad").located(By.xpath("//select[@id='country']"));
	
	public static final Target SELECCIONAR_ANIO = Target.the("El campo donde se selecciona el año").located(By.xpath("//select[@id='yearbox']"));
	
	public static final Target SELECCIONAR_MES = Target.the("El campo donde se selecciona el mes").located(By.xpath("//select[@placeholder='Month']"));
	
	public static final Target SELECCIONAR_DIA = Target.the("El campo donde se selecciona el dia").located(By.xpath("//select[@id='daybox']"));
	
	public static final Target CAMPO_CONTRASENA = Target.the("El campo donde se ingresa la contraseña").located(By.xpath("//input[@id='firstpassword']"));
	
	public static final Target CAMPO_CONFIRMA_CONTRASENA = Target.the("El campo donde se confirma la contraseña").located(By.xpath("//input[@id='secondpassword']"));
	
	public static final Target BOTON_REGISTRAR = Target.the("El campo donde se confirma la contraseña").located(By.id("submitbtn"));

}
