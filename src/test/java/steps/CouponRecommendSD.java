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

public class CouponRecommendSD {
    @When("^you enter yourRecommend (.*)$")
    public void you_enter_your_document_number(String dni) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(dni)
        );
        Sleep.By(10);
    }


    @And("^click on a coupon$")
    public void click_on_a_coupon() throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Coupons.couponRecommended()
        );
        Sleep.By(10);
    }

    @Then("^you can view the recommended coupons that the main coupon has$")
    public void you_can_view_the_recommended_coupons_that_the_main_coupon_has() {

        String titulo= OverviewData.titleCuponRecomendado().answeredBy(theActorInTheSpotlight());

        System.out.println("************TITULO DE CUPONES RECOMENDADOS**********++++:"+ titulo);

        theActorInTheSpotlight().should(
                seeThat("TITULO DE CUPONES RECOMENDADOS ", OverviewData.titleCuponRecomendado(), equalTo(titulo))
                       );

    }
}
