package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeHrmHomePage extends PageObject {
	
	public static final Target BOTON_PIM = Target.the("El botón que me muestra la lista de acciones").located(By.id("menu_pim_viewPimModule"));
	
	public static final Target BOTON_ADD_EMPLEADO = Target.the("El boton que me activa la accion agregar empleado").located(By.xpath("//a[@id='menu_pim_addEmployee']"));	
	
}
