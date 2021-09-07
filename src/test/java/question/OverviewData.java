package question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import page.DetailCoupons;
import page.FooterSection;
import page.Home;
import page.LoginForm;

public class OverviewData {
    //mensaje de bienvenida al momento de ingresar a cuponero
    public static Question<String> welcomeMenssageToCouponero(){
        return  actor -> TextContent.of(Home.welcomeMessage).viewedBy(actor).asString().trim();
    }

    //mensaje de error al introducir credenciales invalidas
    public static Question <String> menssageError(){
        return  actor -> TextContent.of(LoginForm.MESSAGE_ERROR).viewedBy(actor).asString().trim();
    }

    //------------MODAL REGISTRO A CUPONERO---------------//
    public static Question<String>modalRegisterCuponero(){
        return actor -> TextContent.of(LoginForm.MODAL_REGISTER_CUPONERO).viewedBy(actor).asString().trim();
    }

    //mensaje de error dni invalido
    public static Question<String>phoneInvalid(){
        return actor -> TextContent.of(LoginForm.MESSAGE_ERROR_PHONE).viewedBy(actor).asString().trim();
    }
    public static Question<String>emailInvalid(){
        return actor -> TextContent.of(LoginForm.MESSAGE_ERROR_EMAIL).viewedBy(actor).asString().trim();
    }

    //mensaje de resultado de busqueda de cupones
    public static Question <String> messageResultSearchCoupon(){
        return actor -> TextContent.of(Home.MENSAJE_RESULTADO_DE_BUSQUEDA).viewedBy(actor).asString().trim();
    }

    //mensaje de resultado de busqueda de cupones no encontrados
    public static Question <String> messageResultSearchCouponNotFound_1(){
        return actor -> TextContent.of(Home.MENSAJE_PRODUCTO_NO_ENCONTRADO).viewedBy(actor).asString().trim();
    }

    public static Question <String> messageResultSearchCouponNotFound_2(){
        return actor -> TextContent.of(Home.RESUMEN_MENSAJE_PRODUCTO_NO_ENCONTRADO).viewedBy(actor).asString().trim();
    }


    // DETALLE CUPON NORMAL //

    public static Question<String>detalleCuponNormalValido(){
        return actor -> TextContent.of(DetailCoupons.CUPON_NORMAL_VALIDO).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponNormalCampañaFecha() {
        return actor -> TextContent.of(DetailCoupons.CUPON_NORMAL_FECHA_DE_CAMAPAÑA).viewedBy(actor).asString().trim();
    }
    /*
    public static Question<String>detalleCuponNormalDescargarAqui() {
        return actor -> TextContent.of(DetailCoupons.CUPON_NORMAL_BTN_DESCARGAR_AQUI).viewedBy(actor).asString().trim();
    }
    */

    public static Question<String>detalleCuponNormalDescripcion() {
        return actor -> TextContent.of(DetailCoupons.CUPON_NORMAL_DESCRIPCION).viewedBy(actor).asString().trim();
    }
    //-------------------_---//

    //DETALLE CUPON BICANAL
    public static Question<String>detalleCuponBicanalCampañaFecha() {
        return actor -> TextContent.of(DetailCoupons.FECHA_DE_CAMPAÑA).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalDescargarAqui() {
        return actor -> TextContent.of(DetailCoupons.BTN_DESCARGAR_AQUI).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalCanjeaAqui() {
        return actor -> TextContent.of(DetailCoupons.CANJEA_TU_CUPON).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalMostrarCodigo(){
        return actor -> TextContent.of(DetailCoupons.MOSTRAR_CODIGO).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalCodigoDeBarra(){
        return actor -> TextContent.of(DetailCoupons.CODIGO_DE_BARRA).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalCopiarCodigoCupon(){
        return actor -> TextContent.of(DetailCoupons.BTN_COPIAR_CODIGO_CUPON).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalTerminosYCondiciones(){
        return actor -> TextContent.of(DetailCoupons.TERMINOS_CONDICIONES_CUPON).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponBicanalDescripcion_De_TerminosYCondiciones(){
        return actor -> TextContent.of(DetailCoupons.DESCRIPCION_DE_TERMINOS_CONDICIONES_CUPON).viewedBy(actor).asString().trim();
    }

    //public static Question<String>detalleCuponBicanalSeccionRecomendados(){
     //   return actor -> TextContent.of(DetailCoupons.RECOMENDADOS_PARA_TI_BICANAL).viewedBy(actor).asString().trim();
   // }
    //-------------------------------------//
     public static Question<String>titleCuponRecomendado(){
         return actor -> TextContent.of(DetailCoupons.TITLE_RECOMENDADOS_PARA_TI).viewedBy(actor).asString().trim();

     }

    // DETALLE CUPON MULTIHOOK //

    public static Question<String>detalleCuponMultiHookValido(){
        return actor -> TextContent.of(DetailCoupons.CUPON_MULTIGANCHO_VALIDO).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponMultiHookCampañaFecha() {
        return actor -> TextContent.of(DetailCoupons.CUPON_MULTIGANCHO_FECHA_DE_CAMPAÑA).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponMultiHookMuestraCodigo() {
        return actor -> TextContent.of(DetailCoupons.CUPON_MULTIGANCHO_MUESTRA_CODIGO).viewedBy(actor).asString().trim();
    }

    public static Question<String>detalleCuponMultiHookCodigoBarra() {
        return actor -> TextContent.of(DetailCoupons.CUPON_MULTIGANCHO_CODIGO_DE_BARRA).viewedBy(actor).asString().trim();
    }
    //-------------------_---//

    //DETALLE CUPON FLASH//
    public static Question<String>detalleCuponFlashValido(){
        return actor -> TextContent.of(DetailCoupons.CUPON_FLASH_VALIDO).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponFlashNuestrosLocales() {
        return actor -> TextContent.of(DetailCoupons.CUPON_FLASH_NUESTROS_LOCALES).viewedBy(actor).asString().trim();
    }
    public static Question<String>detalleCuponFlashMostrarCodigo() {
        return actor -> TextContent.of(DetailCoupons.CUPON_FLASH_MOSTRAR_CODIGO).viewedBy(actor).asString().trim();
    }



    //------------------//


    //PREGUNTAS FRECUENTES//
    public static Question<String>pregunta1(){
        return actor -> TextContent.of(FooterSection.PREGUNTA_1).viewedBy(actor).asString().trim();
    }
    public static Question<String>pregunta2(){
        return actor -> TextContent.of(FooterSection.PREGUNTA_2).viewedBy(actor).asString().trim();
    }
    public static Question<String>respuesta2(){
        return actor -> TextContent.of(FooterSection.RESPUESTA_2).viewedBy(actor).asString().trim();
    }
    public static Question<String>pregunta3(){
        return actor -> TextContent.of(FooterSection.PREGUNTA_3).viewedBy(actor).asString().trim();
    }
    public static Question<String>respuesta3(){
        return actor -> TextContent.of(FooterSection.RESPUESTA_3).viewedBy(actor).asString().trim();
    }
    public static Question<String>pregunta4(){
        return actor -> TextContent.of(FooterSection.PREGUNTA_4).viewedBy(actor).asString().trim();
    }
    public static Question<String>respuesta4(){
        return actor -> TextContent.of(FooterSection.RESPUESTA_4).viewedBy(actor).asString().trim();
    }
    //---------------------///

    //MODAL DE TERMINOS Y CONDICIONES
    public static Question<String>modalTituloTerminosCondiciones(){
        return actor -> TextContent.of(FooterSection.TITULO_MODAL_TERMINOS_Y_CONDICIONES).viewedBy(actor).asString().trim();
    }






}
