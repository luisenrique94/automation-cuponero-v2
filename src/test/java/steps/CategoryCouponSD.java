package steps;

import action.Sleep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task.Coupons;
import task.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoryCouponSD {
    @When("^(.*) selects a coupon category$")
    public void selects_a_coupon_category(String dni) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(dni),
                Sleep.By(5),
                Coupons.categoryCoupons()
        );
    }

    @Then("^view the coupons of the selected category$")
    public void view_the_coupons_of_the_selected_category() {
         System.out.print("hola mundo");
    }
}
