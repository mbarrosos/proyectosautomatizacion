package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrprueba-trials646.orangehrmlive.com")
public class OrangeHrmLoginPage extends PageObject {
	
	public static final Target CAMPO_USUARIO = Target.the("El campo donde se ingresa el nombre de usuario").located(By.id("txtUsername"));
	
	public static final Target CAMPO_CONTRASENA = Target.the("El campo donde se ingresa la contraseña").located(By.id("txtPassword"));
	
	public static final Target BOTON_LOGIN = Target.the("El botón que inicia sesión en la página Orange Hrm").located(By.id("btnLogin"));

	
}
