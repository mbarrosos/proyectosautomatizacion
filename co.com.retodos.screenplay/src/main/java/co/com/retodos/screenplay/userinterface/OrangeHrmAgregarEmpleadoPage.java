package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeHrmAgregarEmpleadoPage extends PageObject {
	
	public static final Target MODAL_ADD_EMPLEADO = Target.the("Modal donde se muestro el fomrulario para agregar empleado").located(By.id("addEmployeeModal"));
	
	public static final Target CAMPO_NOMBRE = Target.the("Campo donde va el nombre del empleado").located(By.id("firstName"));
	
	public static final Target CAMPO_SEGUNDO_NOMBRE = Target.the("Campo donde va el segundo nombre del empleado").located(By.id("middleName"));
	
	public static final Target CAMPO_APELLIDO = Target.the("Campo donde va el apellido del empleado").located(By.id("lastName"));
	
	public static final Target SELECCIONAR_LOCALIDAD = Target.the("Campo donde se selecciona la localidad del empleado").located(By.id("location_inputfileddiv"));
	
	public static final Target BOTON_SIGUIENTE_EMPLEADO = Target.the("Botón para seguir a la próxima página del formulario").located(By.id("systemUserSaveBtn"));

}
