package page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {
    //FORMULARIO DE LOGIN
    public static final Target INPUT_DOCUMENT_NUMBER = Target.the("Input de numero de documento").located(By.id("txtDocumentNumber"));

    public static final Target BTN_LOGIN =Target.the("Boton ingresar").located(By.id("btnLogin"));

    public static final Target MESSAGE_ERROR =Target.the("Número de documento inválido").located(By.xpath("//div[contains(text(),'Número de documento inválido')]"));

    //FORMULARIO DE ACTUALIZACION DE DATOS
    public static final Target MENSJAE_ACTUALIZA_TUS_DATOS=Target.the("MENSAJE DE ACTUALIZA TUS DATOS").located(By.xpath("//p[contains(text(),'Actualiza tus datos para mantenerte informado sobr')]"));
    public static final Target SALUDO=Target.the("SALUDO DE BIENVENIDA").located(By.xpath("/html/body/app-root/app-main/main/app-login/section/div/div/div/div[1]/div[2]/div[2]/div/p[1]"));
    public static final Target BTN_ACTUALIZAR_DATOS=Target.the("BOTON ACTUALIZAR DATOS").located(By.xpath("//a[@id='btnUpdateUser']"));


    public static final Target PHONE=Target.the("INPUT DE NUMERO DE CELULAR").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/app-input-mask[1]/div[1]/input[1]"));
                                                                                                               //body/app-root[1]/app-main[1]/main[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/app-input-mask[1]/div[1]/input[1]
    public static final Target MESSAGE_ERROR_PHONE=Target.the("MENSAJE DE ERROR DE NUMERO DE CELULAR").located(By.xpath("//div[contains(text(),'Celular inválido')]"));

    public static final Target EMAIL=Target.the("INPUT DE EMAIL").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/app-input-mask[1]/div[1]/input[1]"));
                                                                                                   //body/app-root[1]/app-main[1]/main[1]/app-login[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/app-input-mask[1]/div[1]/input[1]
    public static final Target MESSAGE_ERROR_EMAIL=Target.the("MENSAJE DE ERROR DE EMAIL").located(By.xpath("//div[contains(text(),'Correo electrónico inválido')]"));

    //TERMINOS Y CONDICIONES
    public static final Target CHECK_TERMINOS_CONDICIONES=Target.the("CHECK DE TERMINOS Y CONDICIONES").located(By.cssSelector("#chkTermsAccept"));
    public static final Target MODAL_TERMINOS_CONDICIONES=Target.the("MODAL DE TERMINOS Y CONDICIONES").located(By.id("lnkTermsLogin"));
    public static final Target CLOSE_MODAL_TERMINOS_CONDICIONES=Target.the("CERRAR MODAL DE TERMINOS Y CONDICIONES").located(By.id("btnCloseScrollableModal"));

    //TRATAMIENTO DE DATOS
    public static final Target CHECK_TRATAMIENTO_DE_DATOS=Target.the("CHECK DE TRATAMIENTO DE DATOS").located(By.name("dataTreatment"));
    public static final Target MODAL_TRATAMIENTO_DE_DATOS=Target.the("MODAL DE TRATAMIENTO DE DATOS").located(By.xpath("//a[@id='']"));
    public static final Target CLOSE_MODAL_TRATAMIENTO_DE_DATOS=Target.the("CERRAL  MODAL DE  TRATAMIENTO DE DATOS").located(By.xpath("//button[@id='btnCloseScrollableModal']"));

    //-----------------FIN DE FORMULARIO DE ACTUALIZAR DATOS-----------------//

    //MODAL REGISTRATE EN CUPONERO
    public static final Target MODAL_REGISTER_CUPONERO=Target.the("MODAL DE REGISTRO A CUPONERO").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]"));
    public static final Target CLOSE_MODAL_REGISTER_CUPONERO=Target.the("CERRAR MODAL DE REGISTRO A CUPONERO").located(By.xpath("//*[@id='btnCloseNoCouponsModal']"));
    public static final Target Link_Registro=Target.the("Link de registro a cuponero").located(By.xpath("//a[contains(text(),'Registro de afiliación')]"));
}
