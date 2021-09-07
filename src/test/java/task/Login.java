package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import page.Home;
import page.LoginForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login {
    public static Performable login(String dni){
        return Task.where("login",
                WaitUntil.the(LoginForm.INPUT_DOCUMENT_NUMBER,isVisible()).forNoMoreThan(40).seconds(),
                Enter.theValue(dni).into(LoginForm.INPUT_DOCUMENT_NUMBER),
                WaitUntil.the(LoginForm.BTN_LOGIN,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LoginForm.BTN_LOGIN),
                WaitUntil.the(Home.welcomeMessage,isVisible()).forNoMoreThan(30).seconds()
                //Click.on(Home.closeSession)
        );

    }
    public static Performable loginInvalid(String dni) {
        return Task.where("login invalid",
                WaitUntil.the(LoginForm.INPUT_DOCUMENT_NUMBER, isVisible()),
                Enter.theValue(dni).into(LoginForm.INPUT_DOCUMENT_NUMBER)
                //WaitUntil.the(LoginForm.LOGIN_BUTTON,isVisible()),
                //Click.on(LoginForm.LOGIN_BUTTON)
        );
    }
    public static Performable userNoRegistred(String dni){
        return Task.where("user no registred",
                WaitUntil.the(LoginForm.INPUT_DOCUMENT_NUMBER,isVisible()),
                Enter.theValue(dni).into(LoginForm.INPUT_DOCUMENT_NUMBER),
                WaitUntil.the(LoginForm.BTN_LOGIN,isVisible()),
                Click.on(LoginForm.BTN_LOGIN),
                WaitUntil.the(LoginForm.MODAL_REGISTER_CUPONERO,isVisible()),
                Click.on(LoginForm.Link_Registro)
        );

    }
    public static Performable logout() {
        return Task.where("cerrar sesion",
                WaitUntil.the(Home.closeSession, isVisible()),
                Click.on(Home.closeSession)

        );
    }

    public static Performable searchCoupon(String product){
        return Task.where("search coupon",
                WaitUntil.the(Home.INPUT_BUSCAR_CUPON, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(product).into(Home.INPUT_BUSCAR_CUPON),
                WaitUntil.the(Home.VER_TODOS_LOS_RESULTADOS,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Home.VER_TODOS_LOS_RESULTADOS)
                // WaitUntil.the(LoginForm.LOGIN_BUTTON,isVisible()),
                // Click.on(LoginForm.LOGIN_BUTTON)
        );

    }

    public static Performable searchCouponNotFound(String product){
        return Task.where("search coupon not found",
                WaitUntil.the(Home.INPUT_BUSCAR_CUPON, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(product).into(Home.INPUT_BUSCAR_CUPON).thenHit(Keys.ENTER)
                //  WaitUntil.the(MenuOpcion.VER_TODOS_LOS_RESULTADOS,isVisible()).forNoMoreThan(10).seconds(),
                //  Click.on(MenuOpcion.VER_TODOS_LOS_RESULTADOS)
                // WaitUntil.the(LoginForm.LOGIN_BUTTON,isVisible()),
                // Click.on(LoginForm.LOGIN_BUTTON)
        );

    }

    }
