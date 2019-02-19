package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class OrangeHrmImportantePage extends PageObject {
	
	public static final Target IMPORTANTE = Target.the("").located(By.xpath("//h4[@class='wrapped-word']"));
	
	public static final Target GRUPO_SANGUINEO = Target.the("").located(By.id("1_inputfileddiv"));
	
	public static final Target CAMPO_HOBBIE = Target.the("").located(By.xpath("//input[@id='5']"));
	
	public static final Target BOTON_GUARDAR_IMPORTANTE = Target.the("").located(By.xpath("//button[contains(text(),'save')]"));

}
