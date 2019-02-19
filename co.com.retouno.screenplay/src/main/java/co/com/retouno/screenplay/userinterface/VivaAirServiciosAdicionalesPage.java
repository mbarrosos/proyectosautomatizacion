package co.com.retouno.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirServiciosAdicionalesPage extends PageObject {
	
	public static final Target EQUIPAJE_EN_CABINA = Target.the("El campo para ").located(By.xpath("//div[@id='divFCExtrasHandLuggage']/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div"));
	public static final Target SELECCIONAR_EQUIPAJE_EN_CABINA = Target.the("El campo para ").located(By.xpath("//div[@id='select2-drop']"));
	public static final Target EQUIPAJE_EN_CABINA2 = Target.the("El campo para ").located(By.xpath("//div[@id='divFCExtrasHandLuggage']/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div"));
	public static final Target SELECCIONAR_EQUIPAJE_EN_CABINA2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target EQUIPAJE_EN_CABINA3 = Target.the("El campo para ").located(By.xpath("//div[@id='divFCExtrasHandLuggage']/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div"));
	public static final Target SELECCIONAR_EQUIPAJE_EN_CABINA3 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	
	public static final Target EQUIPAJE_EN_BODEGA = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen105']"));
	public static final Target SELECCIONAR_EQUIPAJE_EN_BODEGA = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target EQUIPAJE_EN_BODEGA2 = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen111']"));
	public static final Target SELECCIONAR_EQUIPAJE_EN_BODEGA2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target EQUIPAJE_EN_BODEGA3 = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen117']"));
	public static final Target SELECCIONAR_EQUIPAJE_EN_BODEGA3 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	
	public static final Target CHECKIN_EN_AEREOPUERTO = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen123']"));
	public static final Target SELECCIONAR_CHECKIN_EN_AEREOPUERTO = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target CHECKIN_EN_AEREOPUERTO2 = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen129']"));
	public static final Target SELECCIONAR_CHECKIN_EN_AEREOPUERTO2 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	public static final Target CHECKIN_EN_AEREOPUERTO3 = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen135']"));
	public static final Target SELECCIONAR_CHECKIN_EN_AEREOPUERTO3 = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	
	public static final Target FILA_RAPIDA = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen141']"));
	public static final Target SELECCIONAR_FILA_RAPIDA = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	
	public static final Target CANCELA_TRANQUILO = Target.the("El campo para ").located(By.xpath("//div[@id='s2id_autogen147']"));
	public static final Target SELECCIONAR_CANCELA_TRANQUILO = Target.the("El campo para ").located(By.xpath("//*[@id=\"select2-drop\"]"));
	
	public static final Target CHECKBOX_VIAJE_ASEGURADO = Target.the("El campo para ").located(By.xpath("//*[@id=\"travel-insurance-checkbox-5961\"]"));
	public static final Target CONTINUAR = Target.the("El campo para ").located(By.xpath("//*[@id=\"extrasContinue\"]"));
	
	public static final Target NO_SELECCIONAR_ASIENTOS = Target.the("El campo para ").located(By.xpath("//a[@title='No, dejaré que el sistema me asigne un asiento sin costo.']"));

	public static final Target NO_GRACIAS = Target.the("El campo para ").located(By.xpath("//*[@id=\"fancyConfirm\"]/div[4]/a[2]"));
	
	public static final Target MENSAJE_DE_SERVICIOS_ADICIONALES = Target.the("El campo para ").located(By.xpath("//*[@id=\"extras\"]/div[3]/span[2]"));
	
	
}

