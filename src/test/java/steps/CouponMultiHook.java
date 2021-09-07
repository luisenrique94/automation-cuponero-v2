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

public class CouponMultiHook {
    @When("^you enter yourMultiHook (.*)$")
    public void you_enter_your_document_number(String dni) {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(dni)
        );
    }

    @And("^click a multi-hook coupon$")
    public void click_a_multi_hook_coupon() {
        theActorInTheSpotlight().wasAbleTo(
                Coupons.couponMultiHook()
        );
    }



    @Then("^you can view the detail of a multi-hook coupon$")
    public void you_can_view_the_detail_of_a_multi_hook_coupon() {
        String VALIDO= OverviewData.detalleCuponMultiHookValido().answeredBy(theActorInTheSpotlight());
        String FECHA_DE_CAMPAÑA= OverviewData.detalleCuponMultiHookCampañaFecha().answeredBy(theActorInTheSpotlight());
        String CODIGO=OverviewData.detalleCuponMultiHookMuestraCodigo().answeredBy(theActorInTheSpotlight());
        String CODIGOBARRA=OverviewData.detalleCuponMultiHookCodigoBarra().answeredBy(theActorInTheSpotlight());

        System.out.println("Se muestra el mensaje de:"+VALIDO);
        System.out.println("La fecha de campaña es:"+FECHA_DE_CAMPAÑA);
        System.out.println("Se muestra mensaje de codigo de barra:"+CODIGO);
        System.out.println("Se muestra  el codigo de barra:"+CODIGOBARRA);

        theActorInTheSpotlight().should(
                seeThat("Mensaje", OverviewData.detalleCuponMultiHookValido(),equalTo(VALIDO)),
                 seeThat("Fecha de campaña", OverviewData.detalleCuponMultiHookCampañaFecha(),equalTo(FECHA_DE_CAMPAÑA)),
                seeThat("Mostrar codigo de barra", OverviewData.detalleCuponMultiHookMuestraCodigo(),equalTo(CODIGO))

        );
    }
}
