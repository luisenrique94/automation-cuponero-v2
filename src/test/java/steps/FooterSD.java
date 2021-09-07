package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import question.OverviewData;
import task.Footer;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FooterSD {

    @Given("that the {actor} enters the couponero website")
    public void that_the_user_enters_the_couponero_website(Actor actor) {
        actor.wasAbleTo(Navigate.toTheHomePage());
    }

    @When("^he clicks on frequently asked questions$")
    public void he_clicks_on_frequently_asked_questions() {
        theActorInTheSpotlight().wasAbleTo(
                Footer.frequentlyAskedQuestions()
        );
    }

    @Then("^he visualizes the frequently asked questions shown by the system$")
    public void he_visualizes_the_frequently_asked_questions_shown_by_the_system() {
        String PREGUNTA_1 = OverviewData.pregunta1().answeredBy(theActorInTheSpotlight());
        String PREGUNTA_2 = OverviewData.pregunta2().answeredBy(theActorInTheSpotlight());
        String RESPUESTA_2 = OverviewData.respuesta2().answeredBy(theActorInTheSpotlight());
        String PREGUNTA_3 = OverviewData.pregunta3().answeredBy(theActorInTheSpotlight());
        String RESPUESTA_3 = OverviewData.respuesta3().answeredBy(theActorInTheSpotlight());
        String PREGUNTA_4 = OverviewData.pregunta4().answeredBy(theActorInTheSpotlight());
        String RESPUESTA_4 = OverviewData.respuesta4().answeredBy(theActorInTheSpotlight());

        System.out.println("*******PREGUNTA 1 ***********:" + PREGUNTA_1);
        System.out.println("*******PREGUNTA 2 ***********:" + PREGUNTA_2);
        System.out.println("*******RESPUESTA 2 ***********:" + RESPUESTA_2);
        System.out.println("*******PREGUNTA 3 ***********:" + PREGUNTA_3);
        System.out.println("*******RESPUESTA 3 ***********:" + RESPUESTA_3);
        System.out.println("*******PREGUNTA 4 ***********:" + PREGUNTA_4);
        System.out.println("*******RESPUESTA 4 ***********:" + RESPUESTA_4);

        theActorInTheSpotlight().should(

                seeThat("PREGUNTA 1", OverviewData.pregunta1(), equalTo(PREGUNTA_1)),
                seeThat("PREGUNTA 2", OverviewData.pregunta2(), equalTo(PREGUNTA_2)),
                seeThat("RESPUESTA 2", OverviewData.respuesta2(), equalTo(RESPUESTA_2)),
                seeThat("PREGUNTA 3", OverviewData.pregunta3(), equalTo(PREGUNTA_3)),
                seeThat("RESPUESTA 3", OverviewData.respuesta3(), equalTo(RESPUESTA_3)),
                seeThat("PREGUNTA 4", OverviewData.pregunta4(), equalTo(PREGUNTA_4)),
                seeThat("RESPUESTA 3", OverviewData.respuesta4(), equalTo(RESPUESTA_4))


        );

    }

    @When("^he clicks on terms and conditions$")
    public void he_clicks_on_terms_and_conditions() {
        theActorInTheSpotlight().wasAbleTo(
                Footer.TermsAndConditions()
        );
    }

    @Then("^he sees the terms and conditions modal$")
    public void he_sees_the_terms_and_conditions_modal() {
        String titulo = OverviewData.modalTituloTerminosCondiciones().answeredBy(theActorInTheSpotlight());
        System.out.println("*******TITULO DEL MODAL DE TERMINOS Y CONDICIONES***********:" + titulo);
        // String descripcion = OverviewData.modalDescripcionTituloTerminosCondiciones().answeredBy(theActorInTheSpotlight());
        //System.out.println("*******DESCRIPCION DEL MODAL DE TERMINOS Y CONDICIONES***********:" + descripcion);

        theActorInTheSpotlight().should(
                seeThat("***TITULO DEL MODAL DE TERMINOS Y CONDICIONES***", OverviewData.modalTituloTerminosCondiciones(), equalTo(titulo))
        );

    }

}
