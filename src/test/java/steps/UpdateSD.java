package steps;

import action.Sleep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import question.OverviewData;
import task.Login;
import task.Update;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdateSD {
    @Given("{actor} enters the coupon web page")
    public void the_user_enters_the_coupon_web_page(Actor user) throws InterruptedException {
        user.wasAbleTo(Navigate.toTheHomePage());
        // BrowseTheWeb.as(alexander).waitFor(5).seconds();
        Sleep.By(10);
    }

    @When("^he sends his (.*) and his (.*) and his (.*) with valid data$")
    public void he_sends_his_document_number_and_his_and_phone_and_his_email_with_valid_data(String documentNumber, String phone, String email) {
        theActorInTheSpotlight().wasAbleTo(
                Update.UpdateWithValidData(documentNumber,phone,email)
        );
    }

    @Then("^system allows you to update your data$")
    public void system_allows_you_to_update_your_data() {
        String mensaje= OverviewData.welcomeMenssageToCouponero().answeredBy(theActorInTheSpotlight());
        System.out.println("****MENSAJE DE BIENVENIDA*****:"+mensaje);
        theActorInTheSpotlight().should(
                seeThat("MENSAJE DE BIENVENIDA",OverviewData.welcomeMenssageToCouponero(),equalTo(mensaje))
        );
        theActorInTheSpotlight().wasAbleTo(
                Login.logout()
        );
    }

    @When("^he sends his (.*) and his (.*) and his (.*) with invalid data$")
    public void he_sends_his_document_number_and_his_phone_his_and_email_with_invalid_data(String documentNumber,String phone,String email) {
        theActorInTheSpotlight().wasAbleTo(
                Update.UpdateWithInvalidData(documentNumber,phone,email)
        );
    }

    @Then("^system shows you error messages$")
    public void system_shows_you_error_messages() {
        String mensaje_phone= OverviewData.phoneInvalid().answeredBy(theActorInTheSpotlight());
        System.out.println("****MENSAJE DE CELULAR INVALIDO*****:"+mensaje_phone);
        String mensaje_email= OverviewData.emailInvalid().answeredBy(theActorInTheSpotlight());
        System.out.println("****MENSAJE DE EMAIL INVALIDO*****:"+mensaje_email);

        theActorInTheSpotlight().should(
                seeThat("MENSAJE DE CELULAR INVALIDO",OverviewData.phoneInvalid(),equalTo(mensaje_phone)),
                seeThat("MENSAJE DE EMAIL INVALIDO",OverviewData.emailInvalid(),equalTo(mensaje_email))
        );
    }
}


