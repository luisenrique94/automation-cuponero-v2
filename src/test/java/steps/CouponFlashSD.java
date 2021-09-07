package steps;

import action.Sleep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import question.OverviewData;
import task.Coupons;
import task.Login;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CouponFlashSD {

    @When("^you enter yourFlash (.*)$")
    public void you_enter_your_document_number(String dni) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(dni)
        );
        Sleep.By(10);
    }

    @And("^click on a flash coupon$")
    public void click_a_multi_hook_coupon() {
        theActorInTheSpotlight().wasAbleTo(
                Coupons.couponFlash()
        );
    }



    @Then("^you can view the detail of a flash coupon$")
    public void you_can_view_the_detail_of_a_flash_coupon() throws InterruptedException {
        String VALIDO= OverviewData.detalleCuponFlashValido().answeredBy(theActorInTheSpotlight());
        String LOCALES= OverviewData.detalleCuponFlashNuestrosLocales().answeredBy(theActorInTheSpotlight());
        String MOSTRAR_CODIGO=OverviewData.detalleCuponFlashMostrarCodigo().answeredBy(theActorInTheSpotlight());
       // String CODIGOBARRA=OverviewData.detalleCuponMultiHookCodigoBarra().answeredBy(theActorInTheSpotlight());

        Sleep.By(20);

        System.out.println("TIEMPO DE VIDA DEL CUPON:"+VALIDO);
        System.out.println("MOSTRAR LOCALES:"+LOCALES);
        System.out.println("MOSTRAR CODIGO:"+MOSTRAR_CODIGO);
     //   System.out.println("Se muestra  el codigo de barra:"+CODIGOBARRA);

        theActorInTheSpotlight().should(
              //  seeThat("TIEMPO DE VIDA DEL CUPON", OverviewData.detalleCuponFlashValido(),equalTo(VALIDO)),
                seeThat("MOSTRAR LOCALES", OverviewData.detalleCuponFlashNuestrosLocales(),equalTo(LOCALES)),
                seeThat("MOSTRAR CODIGO", OverviewData.detalleCuponFlashMostrarCodigo(),equalTo(MOSTRAR_CODIGO))

        );
    }
}
