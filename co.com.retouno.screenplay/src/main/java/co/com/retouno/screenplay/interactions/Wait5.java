package co.com.retouno.screenplay.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.retouno.screenplay.util.UtilityTime.successfulCondition;
 
import java.util.concurrent.TimeUnit;
   
import org.awaitility.Awaitility;
   
import net.serenitybdd.screenplay.Actor;
 
import net.serenitybdd.screenplay.Interaction;
 
public class Wait5 implements Interaction{
     
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Awaitility.await().forever().pollInterval(5000, TimeUnit.MILLISECONDS).until(successfulCondition());
         	} catch (Exception e) {
         		e.getMessage();
         	}
    }
    public static Wait5 aMoment() {
    	return instrumented(Wait5.class);
    }
}
