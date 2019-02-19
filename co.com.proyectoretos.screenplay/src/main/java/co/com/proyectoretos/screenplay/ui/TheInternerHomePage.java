package co.com.proyectoretos.screenplay.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://the-internet.herokuapp.com")
public class TheInternerHomePage extends PageObject {
	
	@FindBy(css="a[href='/basic_auth']")
	public static WebElementFacade linkAutenticacion;
		
	/*public void ingresarAAutenticacion(String usuario, String clave) {
        //Tomamos la url y metemos a una variable tipo String
        String urlAutentica=linkAutenticacion.getAttribute("href");
       
        //Introducuimos en la url, usuario y clave con el siguiente formato http://usuario:clave@elRestoDeUrl
        String urlAutenticacion=urlAutentica.substring(0,7)+usuario+":"+clave+"@"+urlAutentica.substring(7);
       
        //con esta instrucción accedemos a la nueva url
        getDriver().get(urlAutenticacion);
    }*/

}
