package co.com.retouno.screenplay.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarMenorValor implements Interaction {
	private Target lista;	
	public SeleccionarMenorValor(Target lista) {
		super();
		this.lista = lista;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {	
		List<WebElement> diascalendario = lista.resolveFor(actor).findElements(By.xpath("//td[@class='DateBox Today' or @class='DateBox']/div/div[2]/div[2]/span[1]"));
	    int tamanio = diascalendario.size();
	    //System.out.println(tamanio);
	    Double menor = 1000.00;
	    int indice= 0;
	    	for (int i = 0; i < tamanio; i++) {
	    		String valor = diascalendario.get(i).getText();
	            valor = valor.replaceAll("USD ", "");
	            Double aux = Double.parseDouble(valor);
	            	if (aux < menor) {
	            		menor = aux;
	                    indice = i;
	                }
	    	}
	    	diascalendario.get(indice).click();    	
	}        
	public static SeleccionarMenorValor ApartirDe(Target lista) {
		return new SeleccionarMenorValor(lista);
	}
}
