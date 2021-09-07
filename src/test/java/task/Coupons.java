package task;

import io.cucumber.java.hu.De;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import page.DetailCoupons;
import page.FooterSection;
import page.Home;
import page.LoginForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Coupons {
    public static Performable couponBicanal() throws InterruptedException {
        return net.serenitybdd.screenplay.Task.where("coupon Bicanal",

               WaitUntil.the(Home.TITLE_COUPON_BICANAL,isVisible()),
                Click.on(Home.COUPON_BICANAL_1),
                Click.on(DetailCoupons.BTN_COPIAR_CODIGO_CUPON),
                Click.on(DetailCoupons.BTN_SEGUIR_EN_CUPONERO),
                Click.on(DetailCoupons.BTN_IR_A_MIFARMA)

        );
    }

    public static Performable couponMultiHook() {
        return net.serenitybdd.screenplay.Task.where("coupons Multi Hook",
                WaitUntil.the(Home.TITLE_COUPON_MULTIHOOK,isVisible()),
                Click.on(Home.COUPON_MULTIHOOK_1)

        );
    }

    public static Performable couponFlash() {
        return net.serenitybdd.screenplay.Task.where("coupons Flash",
                WaitUntil.the(Home.IMAGE_COUPON_FLASH,isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(Home.IMAGE_COUPON_FLASH),
                Click.on(Home.COUPON_FLASH_24),
                WaitUntil.the(DetailCoupons.CUPON_FLASH_VALIDO,isVisible()).forNoMoreThan(20).seconds()

        );
    }

    public static Performable couponNormal() {
        return net.serenitybdd.screenplay.Task.where("coupon Normal",
                WaitUntil.the(Home.COUPON_NORMAL_1, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(Home.COUPON_NORMAL_1),
                Click.on(Home.COUPON_NORMAL_1),
                WaitUntil.the(DetailCoupons.CUPON_NORMAL_VALIDO,isVisible()).forNoMoreThan(10).seconds()

        );
    }

    public static Performable couponRecommended() {
        return net.serenitybdd.screenplay.Task.where("coupon Recommended",
                WaitUntil.the(Home.COUPON_NORMAL_1, isPresent()),
                Click.on(Home.COUPON_NORMAL_1),
               WaitUntil.the(DetailCoupons.TITLE_RECOMENDADOS_PARA_TI,isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(FooterSection.PREGUNTAS_FRECUENTES),
                WaitUntil.the(DetailCoupons.CUPON_RECOMENDADO_1,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DetailCoupons.CUPON_RECOMENDADO_1),
                Scroll.to(FooterSection.PREGUNTAS_FRECUENTES)
        );
    }

    public static Performable categoryCoupons() {
        return Task.where("category coupons",
                  WaitUntil.the(Home.CATEGORY_1,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Home.CATEGORY_1),
                WaitUntil.the(Home.CATEGORY_2,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Home.CATEGORY_2),
                WaitUntil.the(Home.CATEGORY_3,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Home.CATEGORY_3)
                );
    }
}
