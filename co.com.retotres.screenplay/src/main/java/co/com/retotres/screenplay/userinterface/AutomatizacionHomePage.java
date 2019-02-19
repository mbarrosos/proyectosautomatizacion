package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/home")
public class AutomatizacionHomePage extends PageObject {
	
	public static final Target BOTON_AGREGAR_DOCTOR = Target.the("El botón que ingresa a la página de registro de doctor").located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
	
	public static final Target BOTON_AGREGAR_PACIENTE = Target.the("El botón que ingresa a la página de registro de pacientes").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
	
	public static final Target BOTON_ASIGNAR_CITA = Target.the("El botón que ingresa a la página de asignación de citas").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[6]"));

}
