package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import question.OverviewData;
import task.Coupons;
import task.Login;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CouponNormalSD {

    @When("^you enter yourNormal (.*)$")
    public void you_enter_your_document_number(String dni) {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(dni)
        );
    }

    @And("^click on a normal coupon$")
    public void click_on_a_normal_coupon() {
        theActorInTheSpotlight().wasAbleTo(
                Coupons.couponNormal()
        );
    }


    @Then("^you can view the detail of a normal coupon$")
    public void you_can_view_the_detail_of_a_normal_coupon() {
        String VALIDO = OverviewData.detalleCuponNormalValido().answeredBy(theActorInTheSpotlight());
    //    String FECHA_DE_CAMPAÑA = OverviewData.detalleCuponNormalCampañaFecha().answeredBy(theActorInTheSpotlight());
    //    String BTN_IMPRIMIR_AQUI = OverviewData.detalleCuponNormalDescargarAqui().answeredBy(theActorInTheSpotlight());
        System.out.println("Se muestra el mensaje de:" + VALIDO);
     //   System.out.println("La fecha de campaña es:" + FECHA_DE_CAMPAÑA);
     //   System.out.println("Se muestra el boton imprimir aqui:" + BTN_IMPRIMIR_AQUI);

        theActorInTheSpotlight().should(
                       seeThat("Mensaje", OverviewData.detalleCuponNormalValido(),equalTo(VALIDO))
                //      seeThat("Fecha de campaña", OverviewData.detalleCuponNormalCampañaFecha(),equalTo(FECHA_DE_CAMPAÑA)),
               // seeThat("Boton Descargar aqui", OverviewData.detalleCuponNormalDescargarAqui(), equalTo(BTN_IMPRIMIR_AQUI))

        );
    }
}
