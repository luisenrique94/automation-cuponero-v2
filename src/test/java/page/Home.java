package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target welcomeMessage = Target.the("NOMBRE DEL CLIENTE").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]"));
    public static final Target closeModalFavorite = Target.the("MODAL DE FAVORITOS").located(By.xpath("//body/app-modal-favorites[1]/div[2]/img[2]"));
    public static final Target closeSession=Target.the("Cerrar sesion").located(By.xpath("//a[@id='lnkMenuCloseSession']"));

    //BUSCAR CUPON
    public static final Target  INPUT_BUSCAR_CUPON=Target.the("BUSCAR CUPON").located(By.xpath("//header/div[1]/div[1]/div[3]/app-search-bar[1]/div[1]/form[1]/input[1]"));
    public static final Target  VER_TODOS_LOS_RESULTADOS=Target.the("OPCIONES VER TODOS LOS RESULTADOS").locatedBy("//a[contains(text(),'Ver todos los resultados')]");
    public static final Target  MENSAJE_RESULTADO_DE_BUSQUEDA=Target.the("MENSAJE DE RESULTADO DE BUSQUEDA").locatedBy("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-search-coupons[1]/div[1]/div[1]/div[1]/div[1]");
    //-------------//

    //MENSAJE DE PRODUCTO NO ENCONTRADO//
    public static final Target MENSAJE_PRODUCTO_NO_ENCONTRADO=Target.the("PRODUCTO NO ENCONTRADO").locatedBy("/html[1]/body[1]/app-root[1]/app-main[1]/main[1]/app-home[1]/app-search-coupons[1]/div[1]/div[1]/div[2]/div[1]/p[1]");
    public static final Target RESUMEN_MENSAJE_PRODUCTO_NO_ENCONTRADO=Target.the("RESUMEN DE MENSAJE PRODUCTO NO ENCONTRADO").locatedBy("/html/body/app-root/app-main/main/app-home/app-search-coupons/div/div/div[2]/div/p[2]");

    //-------------------------CUPONES---------------------------//

    //---------CUPONES BICANAL//
    public static final Target TITLE_COUPON_BICANAL=Target.the("TITLE COUPON BICANAL").locatedBy("//h3[contains(text(),'Aprovecha estos cupones en boticas y online')]");
    public static  final Target COUPON_BICANAL_1=Target.the("COUPON BICANAL 1").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/app-coupon-grid[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-coupon[1]/div[2]/div[1]"));
    public static  final Target COUPON_BICANAL_2=Target.the("COUPON BICANAL 2").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/app-coupon-grid[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/app-coupon[1]/div[2]/div[1]"));
    public static  final Target COUPON_BICANAL_3=Target.the("COUPON BICANAL 3").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/app-coupon-grid[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/app-coupon[1]/div[2]/div[1]"));
    //------------------------//

    //---------CUPONES MULTIGANCHO//
    public static final Target TITLE_COUPON_MULTIHOOK=Target.the("TITLE COUPON CUPONAZO").locatedBy("//h3[contains(text(),'¡Disfruta de estos cupones sólo en boticas!')]");
    public static  final Target COUPON_MULTIHOOK_1=Target.the("COUPON CUPONAZO 1").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/app-coupon-grid[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-coupon-hook[1]/div[2]/div[1]"));
    //------------------------//

    //---------CUPONES FLASH O RELAMPAGO//
    public static final Target IMAGE_COUPON_FLASH=Target.the("IMAGEN DE SECCION DE CUPONES FLASH").locatedBy("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/app-coupon-grid[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    public static  final Target COUPON_FLASH_24=Target.the("COUPON FLASH 24 HORAS").located(By.xpath("//div[contains(text(),'Solo x 24 horas')]"));
    public static  final Target COUPON_FLASH_48=Target.the("COUPON FLASH 48 HORAS").located(By.xpath("//div[contains(text(),'Solo x 48 horas')]"));
    public static  final Target COUPON_FLASH_72=Target.the("COUPON FLASH 72 HORAS").located(By.xpath("//div[contains(text(),'Solo x 72 horas')]"));
    //------------------------//

    //---------------------CUPONES NORMALES----------------//
    public static final Target COUPON_NORMAL_1=Target.the("COUPON NORMAL").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-home[1]/app-coupons-list[1]/app-coupon-grid[1]/section[3]/div[1]/div[1]/div[1]/div[1]/app-coupon[1]/div[1]/div[2]/div[1]"));

    //----------------------//
    //------------------------------------------------------------//

    //------CATEGORIAS DE CUPONES-----------//
    public static final Target CATEGORY_1=Target.the("CATEGORIA 1").locatedBy("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]");
    public static final Target CATEGORY_2=Target.the("CATEGORIA 2").locatedBy("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]");
    public static final Target CATEGORY_3=Target.the("CATEGORIA 3").locatedBy("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]");
    //---------------------------------//



}
