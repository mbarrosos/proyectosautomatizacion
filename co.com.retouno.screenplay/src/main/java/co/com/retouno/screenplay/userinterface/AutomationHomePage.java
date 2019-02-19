package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Index.html")
public class AutomationHomePage extends PageObject{
	
	public static final Target BOTON_SKIP_SIGN_IN = Target.the("El botón que ingresa a la página de registro").located(By.id("btn2"));

}
