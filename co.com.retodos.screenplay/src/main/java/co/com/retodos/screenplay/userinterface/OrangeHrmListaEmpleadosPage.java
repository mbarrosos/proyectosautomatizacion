package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class OrangeHrmListaEmpleadosPage extends PageObject {
	
	public static final Target LISTA_EMPLEADO = Target.the("Link para listar los empleados registrados").located(By.id("menu_pim_viewEmployeeList"));
	
	public static final Target TITULO_LISTA = Target.the("Link para listar los empleados registrados").located(By.xpath("//li[@class='page-title']"));

	public static final Target CAMPO_BUSCAR = Target.the("Link para listar los empleados registrados").located(By.id("employee_name_quick_filter_employee_list_value"));
	
	public static final Target ICONO_BUSCAR = Target.the("Link para listar los empleados registrados").located(By.id("quick_search_icon"));
	
	public static final Target EMPLEADO_ESPERADO = Target.the("Link para listar los empleados registrados").located(By.xpath("//td[contains(text(),'Juanito manuel alimaña')]"));

	
	
	
}
