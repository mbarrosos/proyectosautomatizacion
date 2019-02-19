package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://vivaair.com/co")
public class VivaAirHomePage extends PageObject {
	
	public static final Target SELECCIONAR_ORIGEN = Target.the("El campo para seleccionar el origen").located(By.xpath("//span[@id='select2-chosen-20']"));
	public static final Target BUSCAR_ORIGEN = Target.the("El campo para seleccionar el origen").located(By.xpath("//div[@id='select2-drop']"));
	public static final Target SELECCIONAR_DESTINO = Target.the("El campo para seleccionar el destino").located(By.xpath("//span[@id='select2-chosen-21']"));
	public static final Target BUSCAR_DESTINO = Target.the("El campo para seleccionar el destino").located(By.xpath("//ul[@id='select2-results-21']"));
	public static final Target FECHA_IDA = Target.the("El campo para fecha ida").located(By.id("DepartureDateForDisplay"));
	public static final Target FECHA_REGRESO = Target.the("El campo para fecha regreso").located(By.id("ReturnDateForDisplay"));
	public static final Target PRECIOS_MES = Target.the("").located(By.id("CalenderSearchWrapper"));
	public static final Target SELECCIONAR_MONEDA = Target.the("").located(By.id("select2-chosen-15"));
	public static final Target BUSCAR_MONEDA = Target.the("").located(By.id("select2-results-15"));
	public static final Target SELECIONAR_ADULTO = Target.the("").located(By.id("s2id_Adults"));
	public static final Target BUSCAR_NUMERO_ADULTO = Target.the("").located(By.xpath("//ul[@id='select2-results-22']"));
	public static final Target SELECIONAR_NINIO = Target.the("").located(By.id("s2id_Children"));
	public static final Target BUSCAR_NUMERO_NINIO = Target.the("").located(By.xpath("//ul[@id='select2-results-23']"));
	public static final Target SELECIONAR_INFANTE = Target.the("").located(By.id("select2-chosen-25"));
	public static final Target BUSCAR_NUMERO_INFANTE = Target.the("").located(By.id("select2-results-25"));
		
	public static final Target BOTON_RESERVA = Target.the("").located(By.id("continueLink"));
	
	public static final Target TU_COMPRA = Target.the("").located(By.id("toggleBasket"));
	
	public static final Target TARIFA_MAS_BAJA_IDA = Target.the("").located(By.xpath("//div[@id='jMonthCalendarOut']"));
	//public static final Target TARIFA_MAS_BAJA_REGRESO = Target.the("").located(By.xpath("//tbody[@id='CalendarBody']/tr/td[@class='DateBox Today']"));
	public static final Target TARIFA_MAS_BAJA_REGRESO = Target.the("").located(By.xpath("//div[@id='jMonthCalendarIn']"));
	
	public static final Target BOTON_CONTINUAR = Target.the("").located(By.xpath("//a[@id='monthContinue']"));
	public static final Target PRODUCTO_VIVA = Target.the("").located(By.xpath("//div[@data-bind=\"template: { name: 'availability-product-header-out-template' }\"]//div[@class='product-class-header basic']"));
	public static final Target PRECIO_BASICO_IDA = Target.the("").located(By.xpath("//*[@id=\"divAvailabilityOut\"]/div[1]/div[1]/div[2]/label[1]/div/div[1]/div[3]/div"));
	public static final Target PRECIO_BASICO_REGRESO = Target.the("").located(By.xpath("//*[@id=\"divAvailabilityIn\"]/div[1]/div[1]/div[2]/label[1]/div/div[1]/div[3]/div"));
	public static final Target ACEPTO_TERMINOS = Target.the("").located(By.xpath("//a[@title='Acepto']"));
	
}
