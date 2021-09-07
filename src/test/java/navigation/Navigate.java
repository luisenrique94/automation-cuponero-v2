package navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public  static Performable toTheHomePage(){
        return Task.where("{0} opens the home page",
        Open.browserOn().thePageNamed("home.page")
                );
    }
}
