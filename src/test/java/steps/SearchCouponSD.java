package steps;

import action.Sleep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import question.OverviewData;
import task.Login;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchCouponSD {

    @When("^you enter your (.*)")
    public void you_enter_your_document_number(String documentNumber) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(documentNumber)
        );
        Sleep.By(5);

    }

    @And("^I'm looking for a (.*)")
    public void i_m_looking_for_a_specific_product(String product) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.searchCoupon(product)
        );


    }

    @And("^you search for a (.*) and find it$")
    public void you_search_for_a_specific_product_and_find_it(String product) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.searchCouponNotFound(product)
        );
        Sleep.By(6);


    }

    @Then("^you should see the list and the detail of the coupon$")
    public void you_should_see_the_list_and_the_detail_of_the_coupon() {
        String MENSAJE_RESULTADO_BUSQUEDA_CUPON= OverviewData.messageResultSearchCoupon().answeredBy(theActorInTheSpotlight());
        System.out.println("CUPONES ENCONTRADOS:" +MENSAJE_RESULTADO_BUSQUEDA_CUPON);
        theActorInTheSpotlight().should(
                seeThat("CUPONES ENCONTRADOS", OverviewData.messageResultSearchCoupon(),equalTo(MENSAJE_RESULTADO_BUSQUEDA_CUPON))
        );


    }
    @Then("^you should see the detail of the coupon$")
    public void you_should_see_the_detail_of_the_coupon() {
        String DESCRIPCION_DETALLE_CUPON= OverviewData.detalleCuponNormalDescripcion().answeredBy(theActorInTheSpotlight());
        System.out.println("DESCRIPCION DETALLE CUPON:" +DESCRIPCION_DETALLE_CUPON);
        theActorInTheSpotlight().should(
                seeThat("DESCRIPCION DETALLE CUPON", OverviewData.detalleCuponNormalDescripcion(),equalTo(DESCRIPCION_DETALLE_CUPON))
        );

    }
    @Then("^you should see an information message$")
    public void you_should_see_an_information_message() {
        String mensaje_1= OverviewData.messageResultSearchCouponNotFound_1().answeredBy(theActorInTheSpotlight());
        System.out.println("CUPON NO ENCONTRADO :" +mensaje_1);

        String mensaje_2= OverviewData.messageResultSearchCouponNotFound_2().answeredBy(theActorInTheSpotlight());
        System.out.println("RESUMEN DE CUPON NO ENCONTRADO:" +mensaje_2);

        theActorInTheSpotlight().should(
                seeThat("CUPON NO ENCONTRADO", OverviewData.messageResultSearchCouponNotFound_1(),equalTo(mensaje_1)),
                seeThat("RESUMEN CUPON NO ENCONTRADO", OverviewData.messageResultSearchCouponNotFound_2(),equalTo(mensaje_2))
        );

    }

}
