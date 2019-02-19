package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeHrmSubordinadoresPage extends PageObject {
	
	public static final Target SUBORDINADORES = Target.the("").located(By.xpath("//h4[@class='wrapped-word']"));
	
	public static final Target BOTON_GUARDAR_TODA_INFORMACION = Target.the("").located(By.xpath("//button[contains(text(),'Save')]"));

}
