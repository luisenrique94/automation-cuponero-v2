package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetailCoupons {

    //DETALLE CUPON BICANAL
    public static final Target FECHA_DE_CAMPAÑA=Target.the("FECHA DE CAMPAÑA").located(By.xpath("/html/body/app-root/app-main/main/app-home/app-coupon-detail/div/app-coupon-card-detail/div[2]/div[3]/div[2]/div[1]/ul/li[1]"));
    public static final Target BTN_DESCARGAR_AQUI=Target.the("BOTON DESCARGAR AQUI").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[2]/div[1]"));
    public static final Target CANJEA_TU_CUPON=Target.the("VALIDO EN LOCALES,WEB Y APP").located(By.xpath("//li[contains(text(),'Válido en nuestros locales, Web y App')]"));
    public static final Target MOSTRAR_CODIGO=Target.the("MOSTRAR CODIGO PARA CANJEAR").located(By.xpath("//li[contains(text(),'Para canjear en la botica, muestra el código.')]"));
    public static final Target CODIGO_DE_BARRA=Target.the("CODIGO DE BARRA").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[2]/div[3]/div[2]/div[2]/ngx-barcode[1]"));
    public static final Target BTN_COPIAR_CODIGO_CUPON=Target.the("COPIAR CODIGO DE CUPON").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[2]/div[3]/div[2]/div[2]/button[1]"));
    public static final Target BTN_SI_CANJEAR_EN_MI_FARMA=Target.the("BOTON QUE DIRIGE AL USUARIO  AL PRODUCTO ESPECIFICO O A UNA LISTA DE PRODUCTOS ").located(By.xpath("//a[contains(text(),'Sí, canjear en mifarma')]"));
    public static final Target BTN_SEGUIR_EN_CUPONERO=Target.the("BOTON QUE CIERRA EL MODAL Y MANTIENE AL USUARIO EN DETALLE CUPON ").located(By.xpath("//button[contains(text(),'Seguir en Cuponero')]"));

    public static final Target BTN_IR_A_MIFARMA=Target.the("BOTON QUE DIRIGE AL USUARIO A MIFARMA.COM.PE").located(By.xpath("/html/body/app-root/app-main/main/app-home/app-coupon-detail/div[1]/div/div[2]/div"));
    public static final Target TERMINOS_CONDICIONES_CUPON=Target.the("TERMINOS Y CONDICIONES DE UN CUPON").located(By.xpath("//p[contains(text(),'Términos y condidiciones:')]"));
    public static final Target DESCRIPCION_DE_TERMINOS_CONDICIONES_CUPON=Target.the("DESCRIPCION DE TERMINOS Y CONDICIONES").located(By.xpath("//p[contains(text(),'El Descuento aplica sobre el precio de lista. Stoc')]"));

    //DETALLE CUPON MULTIGANCHO
    public  static final Target CUPON_MULTIGANCHO_FECHA_DE_CAMPAÑA= Target.the("FECHA DE CAMPAÑA").located(By.xpath("/html/body/app-root/app-main/main/app-home/app-coupon-detail/div/app-coupon-card-detail/div[2]/div[3]/div[2]/div[1]/ul/li[1]"));
    public static final Target CUPON_MULTIGANCHO_VALIDO=Target.the("VALIDO EN LOCALES").located(By.xpath("//li[contains(text(),'Válido sólo en nuestros locales.')]"));
    public static final Target CUPON_MULTIGANCHO_MUESTRA_CODIGO=Target.the("MOSTRAR CODIGO DE BARRA").located(By.xpath("//li[contains(text(),'Para canjear en la botica, muestra el código.')]"));
    public static final Target CUPON_MULTIGANCHO_CODIGO_DE_BARRA=Target.the("CODIGO DE BARRA").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[2]/div[3]/div[2]/div[2]/ngx-barcode[1]"));

    //DETALLE CUPON FLASH
    public static final Target CUPON_FLASH_VALIDO=Target.the("TIEMPO DE VIDA DEL CUPON").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]"));
    public static final Target CUPON_FLASH_NUESTROS_LOCALES=Target.the("VALIDO SOLO EN NUESTROS LOCALES").located(By.xpath("//li[contains(text(),'Válido sólo en nuestros locales.')]"));
    public static final Target CUPON_FLASH_MOSTRAR_CODIGO=Target.the("PARA CANJEAR EN LA BOTICA MUESTRA EL CODIGO").located(By.xpath("//li[contains(text(),'Para canjear en la botica, muestra el código.')]"));


    //DETALLE CUPON NORMAL
    public  static final Target CUPON_NORMAL_VALIDO= Target.the("DEBE DE MOSTRAR LA PALABRA VALIDO EN CADA CUPON").located(By.xpath("/html/body/app-root/app-main/main/app-home/app-coupon-detail/div/app-coupon-card-detail/div/div[3]/div[2]/div[1]/ul/li[1]"));
    public static final Target CUPON_NORMAL_FECHA_DE_CAMAPAÑA=Target.the("FECHA DE CAMPAÑA").located(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]"));
    //CUPONES RECOMENDADOS
    public static final Target TITLE_RECOMENDADOS_PARA_TI=Target.the("SECCION DE RECOMENDADOS DE UN CUPON ").located(By.xpath("//div[contains(text(),'Recomendados para ti')]"));
    public static final Target CUPON_RECOMENDADO_1=Target.the("CUPON RECOMENDADO 1").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-coupon[1]/div[1]/div[2]/div[3]"));
    public static final Target ADD_FAVORITE_CUPON_RECOMENDADO_2=Target.the("AGREGAR A FAVORITO CUPON RECOMENDADO 2").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[2]/div[1]/div[1]"));
    public static final Target ADD_FAVORITE_CUPON_RECOMENDADO_3=Target.the("AGREGAR A FAVORITO CUPON RECOMENDADO 3").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[3]/div[1]/div[1]"));
    public static final Target ADD_FAVORITE_CUPON_RECOMENDADO_4=Target.the("AGREGAR A FAVORITO CUPON RECOMENDADO 4").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[4]/div[1]/div[1]"));
    //FECHA DE CAMPAÑA DE CUPONES RECOMENDADOS
    public static final Target FECHA_CAMPAÑA_CUPON_RECOMENDADO_1=Target.the("FECHA DE CAMPAÑA DE CUPON RECOMENDADO 1").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[1]/div[1]/div[4]/div[2]"));
    public static final Target FECHA_CAMPAÑA_CUPON_RECOMENDADO_2=Target.the("FECHA DE CAMPAÑA DE CUPON RECOMENDADO 2").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[2]/div[1]/div[4]/div[2]"));
    public static final Target FECHA_CAMPAÑA_CUPON_RECOMENDADO_3=Target.the("FECHA DE CAMPAÑA DE CUPON RECOMENDADO 3").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[3]/div[1]/div[4]/div[2]"));
    public static final Target FECHA_CAMPAÑA_CUPON_RECOMENDADO_4=Target.the("FECHA DE CAMPAÑA DE CUPON RECOMENDADO 4").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[2]/app-coupon[4]/div[1]/div[4]/div[2]"));
    //descripcion del cupon normal
    public static final Target CUPON_NORMAL_DESCRIPCION=Target.the("NOMBRE DEL CUPON").locatedBy("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupon-detail[1]/div[1]/app-coupon-card-detail[1]/div[1]/div[3]/div[1]/div[2]");

}
