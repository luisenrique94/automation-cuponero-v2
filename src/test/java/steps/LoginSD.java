package steps;

import action.Sleep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.OverviewData;
import task.Login;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSD {

   // @Managed(driver = "chrome")
   // public WebDriver hisBrowser;

    @Given("{actor} enters the coupon website")
    public void user_enters_the_coupon_website(Actor alexander) throws InterruptedException {
        alexander.wasAbleTo(Navigate.toTheHomePage());
       // BrowseTheWeb.as(alexander).waitFor(5).seconds();
        Sleep.By(10);
    }
    @When("^sends number document (.*)$")
    public void sends_number_document(String dni) throws InterruptedException {
       theActorInTheSpotlight().wasAbleTo(
        Login.login(dni)

        );

        //Sleep.By(5);
    }

    @Then("^should be able to view her coupons$")
    public void should_be_able_to_view_her_coupons() throws InterruptedException {
        String mensajeDeBienvenida= OverviewData.welcomeMenssageToCouponero().answeredBy(theActorInTheSpotlight());
        System.out.println("****MENSAJE DE BIENVENIDA*****:"+mensajeDeBienvenida);
        theActorInTheSpotlight().should(
                seeThat("MENSAJE DE BIENVENIDA",OverviewData.welcomeMenssageToCouponero(),equalTo(mensajeDeBienvenida))
                //        seeThat("MENSAJE DE USUARIO SIN CUPONES",OverviewData.menssageNoCupons(),equalTo(mensajeSinFavoritos))

        );
        Sleep.By(5);
        theActorInTheSpotlight().wasAbleTo(
                Login.logout()
        );

    }


    @When("^sends invalid document (.*)$")
    public void sends_invalid_document(String dni) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.loginInvalid(dni)
        );
        Sleep.By(10);
    }

    @Then("^should be able to see error message$")
    public void should_be_able_to_see_error_message() {
        String mensaje=OverviewData.menssageError().answeredBy(theActorInTheSpotlight());
        System.out.println("****MENSAJE DE ERROR*****:"+mensaje);
        theActorInTheSpotlight().should(
                seeThat("MENSAJE DE ERROR",OverviewData.menssageError(),equalTo(mensaje))
        );
    }

    @When("^sends  document (.*)$")
    public void sends_document(String dni) {
        theActorInTheSpotlight().wasAbleTo(
                Login.userNoRegistred(dni)
        );
    }

    @Then("^should be able to see the registration modal$")
    public void should_be_able_to_see_the_registration_modal() throws InterruptedException {
        String mensaje=OverviewData.modalRegisterCuponero().answeredBy(theActorInTheSpotlight());
        //System.out.println("******DESCRIPCION MODAL DE REGISTRO*****************:"+ OverviewData.modalRegisterCuponero().answeredBy(theActorInTheSpotlight()));
        System.out.println("******DESCRIPCION DE MODAL DE REGISTRO************:"+mensaje);

        theActorInTheSpotlight().should(
                seeThat("DESCRIPCION MODAL DE REGISTRO*****", OverviewData.modalRegisterCuponero(),equalTo(mensaje))

        );
        theActorInTheSpotlight().wasAbleTo(
                Sleep.By(5),
                Switch.toNewWindow()

        );
    }


}
