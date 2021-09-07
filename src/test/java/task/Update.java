package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import page.LoginForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Update {
    public static Performable UpdateWithValidData(String documentNumber, String phone, String email){
        return Task.where("update with valid data",
                WaitUntil.the(LoginForm.INPUT_DOCUMENT_NUMBER,isVisible()),
                Enter.theValue(documentNumber).into(LoginForm.INPUT_DOCUMENT_NUMBER),
                WaitUntil.the(LoginForm.BTN_LOGIN,isVisible()),
                Click.on(LoginForm.BTN_LOGIN),
                WaitUntil.the(LoginForm.PHONE,isVisible()),
                Enter.theValue(phone).into(LoginForm.PHONE),
                WaitUntil.the(LoginForm.EMAIL,isVisible()),
                Enter.theValue(email).into(LoginForm.EMAIL),
                //TERMINOS Y CONDICIONES
                Click.on(LoginForm.CHECK_TERMINOS_CONDICIONES),
                WaitUntil.the(LoginForm.MODAL_TERMINOS_CONDICIONES,isVisible()),
                Click.on(LoginForm.MODAL_TERMINOS_CONDICIONES),
                WaitUntil.the(LoginForm.CLOSE_MODAL_TERMINOS_CONDICIONES,isVisible()),
                Click.on(LoginForm.CLOSE_MODAL_TERMINOS_CONDICIONES),
                //TRATAMIENTO DE DATOS
                // WaitUntil.the(LoginForm.CHECK_TRATAMIENTO_DE_DATOS,isVisible()),
                Click.on(LoginForm.CHECK_TRATAMIENTO_DE_DATOS),
                WaitUntil.the(LoginForm.MODAL_TRATAMIENTO_DE_DATOS,isVisible()),
                Click.on(LoginForm.MODAL_TRATAMIENTO_DE_DATOS),
                WaitUntil.the(LoginForm.CLOSE_MODAL_TRATAMIENTO_DE_DATOS,isVisible()),
                Click.on(LoginForm.CLOSE_MODAL_TRATAMIENTO_DE_DATOS),
                Click.on(LoginForm.BTN_ACTUALIZAR_DATOS)
                //WaitUntil.the(Coupons.COUPON_1, isVisible()),
               // WaitUntil.the(Coupons.COUPON_2, isVisible())
        );
    }
    public static Performable UpdateWithInvalidData(String documentNumber,String phone,String email){
        return Task.where("update with invalid data",
                WaitUntil.the(LoginForm.INPUT_DOCUMENT_NUMBER,isVisible()),
                Enter.theValue(documentNumber).into(LoginForm.INPUT_DOCUMENT_NUMBER),
                WaitUntil.the(LoginForm.BTN_LOGIN,isVisible()),
                Click.on(LoginForm.BTN_LOGIN),
                WaitUntil.the(LoginForm.PHONE,isVisible()),
                Enter.theValue(phone).into(LoginForm.PHONE),
                WaitUntil.the(LoginForm.MESSAGE_ERROR_PHONE,isVisible()),
                WaitUntil.the(LoginForm.EMAIL,isVisible()),
                Enter.theValue(email).into(LoginForm.EMAIL),
                WaitUntil.the(LoginForm.MESSAGE_ERROR_EMAIL,isVisible())


        );

    }
}
