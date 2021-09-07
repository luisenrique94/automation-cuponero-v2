package steps;

import action.Sleep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Switch;
import question.OverviewData;
import task.Coupons;
import task.Login;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CouponBicanalSD {
    @When("^you enter yourBicanal (.*)$")
    public void you_enter_your_document_number(String dni) {
        theActorInTheSpotlight().wasAbleTo(
                Login.login(dni)
        );
    }


    @And("^click on a dual bicanal coupon$")
    public void click_on_a_dual_bicanal_coupon() throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Coupons.couponBicanal()

        );
    }

    @Then("^you can view the detail of a dual-channel coupon$")
    public void you_can_view_the_detail_of_a_dual_channel_coupon() throws InterruptedException {

        String FECHA_DE_CAMPAÑA= OverviewData.detalleCuponBicanalCampañaFecha().answeredBy(theActorInTheSpotlight());
        String BOTON_DESCARGAR_AQUI=OverviewData.detalleCuponBicanalDescargarAqui().answeredBy(theActorInTheSpotlight());
        String CANJEA_TU_CUPON_AQUI=OverviewData.detalleCuponBicanalCanjeaAqui().answeredBy(theActorInTheSpotlight());
        String CUPON_BICANAL_VALIDO= OverviewData.detalleCuponBicanalMostrarCodigo().answeredBy(theActorInTheSpotlight());
        String EN_NUESTRA_WEB=OverviewData.detalleCuponBicanalCodigoDeBarra().answeredBy(theActorInTheSpotlight());
        String CODIGO_DE_CUPON=OverviewData.detalleCuponBicanalCopiarCodigoCupon().answeredBy(theActorInTheSpotlight());
        String TERMINOS_Y_CONDICIONES_DE_UN_CUPON=OverviewData.detalleCuponBicanalDescripcion_De_TerminosYCondiciones().answeredBy(theActorInTheSpotlight());
        String DESCRIPCION_DE_TERMINOS_Y_CONDICIONES_DE_UN_CUPON=OverviewData.detalleCuponBicanalDescripcion_De_TerminosYCondiciones().answeredBy(theActorInTheSpotlight());
       // String SECCION_DE_RECOMENDADO_DE_CUPON_BICANAL=OverviewData.detalleCuponBicanalSeccionRecomendados().answeredBy(theActorInTheSpotlight());

        /*_ MOSTRANDO RESULTADOS_*/

        System.out.println("*******CUPON BICANAL VALIDO ***********:" + CUPON_BICANAL_VALIDO);
        System.out.println("******FECHA DE CAMPAÑA*****************:"+FECHA_DE_CAMPAÑA);
        System.out.println("******BOTON DESCARGAR AQUI*****************:"+BOTON_DESCARGAR_AQUI);
        System.out.println("******CANJEA TU CUPON AQUI*****************:"+CANJEA_TU_CUPON_AQUI);
        System.out.println("******EN NUESTRA WEB*****************:"+EN_NUESTRA_WEB);
       // System.out.println("******EN TU BOTICA FAVORITA*****************:"+EN_TU_BOTICA_FAVORITA);
        System.out.println("******CODIGO DE CUPON*****************:"+CODIGO_DE_CUPON);
        System.out.println("******TERMINOS Y CONDICIONES DE UN CUPON*****************:"+TERMINOS_Y_CONDICIONES_DE_UN_CUPON);
        System.out.println("******DESCRIPCION DE TERMINOS Y CONDICIONES DE UN CUPON*****************:"+DESCRIPCION_DE_TERMINOS_Y_CONDICIONES_DE_UN_CUPON);
      //  System.out.println("******SECCION DE RECOMENDADOS DE CUPON BICANAL*****************:"+SECCION_DE_RECOMENDADO_DE_CUPON_BICANAL);
        theActorInTheSpotlight().should(
             //   seeThat("CUPON BICANAL VALIDO", OverviewData.detalleCuponBicanalValido(),equalTo(CUPON_BICANAL_VALIDO)),
                seeThat("FECHA DE CAMPAÑA", OverviewData.detalleCuponBicanalCampañaFecha(),equalTo(FECHA_DE_CAMPAÑA)),
                seeThat("BOTON DESCARGAR AQUI", OverviewData.detalleCuponBicanalDescargarAqui(),equalTo(BOTON_DESCARGAR_AQUI)),
                seeThat("CANJEA TU CUPON AQUI", OverviewData.detalleCuponBicanalCanjeaAqui(),equalTo(CANJEA_TU_CUPON_AQUI))
               // seeThat("EN NUESTRA WEB", OverviewData.detalleCuponBicanalEnNuestraWeb(),equalTo(EN_NUESTRA_WEB)),
               // seeThat("EN TU BOTICA FAVORITA", OverviewData.detalleCuponBicanalEnTuBoticaFavorita(),equalTo(EN_TU_BOTICA_FAVORITA))

        );
        theActorInTheSpotlight().wasAbleTo(

                Sleep.By(20),
                Switch.toNewWindow()
        );
    }

    }
