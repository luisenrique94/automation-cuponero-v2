package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import page.FooterSection;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Footer {
    public static Performable frequentlyAskedQuestions(){
        return Task.where(" Frequently Asked Questions",
                WaitUntil.the(FooterSection.TERMINOS_Y_CONDICIONES, isVisible()),
                Scroll.to(FooterSection.TERMINOS_Y_CONDICIONES),
                Click.on(FooterSection.PREGUNTAS_FRECUENTES),
             //   WaitUntil.the(FooterSection.IMAGE_PREGUNTAS_FRECUENTES, isVisible()),
                WaitUntil.the(FooterSection.TITTLE_PREGUNTAS_FRECUENTES, isVisible()),
                WaitUntil.the(FooterSection.PREGUNTA_1, isVisible()),
                Click.on(FooterSection.PREGUNTA_1),
                Click.on(FooterSection.PREGUNTA_1),
                WaitUntil.the(FooterSection.PREGUNTA_2,isVisible()),
                Click.on(FooterSection.PREGUNTA_2),
                Click.on(FooterSection.PREGUNTA_2),
                WaitUntil.the(FooterSection.PREGUNTA_3,isVisible()),
                Scroll.to(FooterSection.PREGUNTA_3),
                Click.on(FooterSection.PREGUNTA_3),
                Click.on(FooterSection.PREGUNTA_3),
                WaitUntil.the(FooterSection.PREGUNTA_4,isVisible()),
                Click.on(FooterSection.PREGUNTA_4),
                Click.on(FooterSection.PREGUNTA_4)
        );

    }

    public static Performable  TermsAndConditions(){
        return Task.where(" Frequently Asked Questions",
                WaitUntil.the(FooterSection.TERMINOS_Y_CONDICIONES,isVisible()),
                Scroll.to(FooterSection.TERMINOS_Y_CONDICIONES),
                Click.on(FooterSection.TERMINOS_Y_CONDICIONES)

        );

    }
}
