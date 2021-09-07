package page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FooterSection extends PageObject {
    //TERMINOS Y CONDICIONES
    public static final Target TERMINOS_Y_CONDICIONES=Target.the("TERMINOS Y CONDICONES").located(By.xpath("//a[contains(text(),'Términos y condiciones')]"));
    public static final Target TITULO_MODAL_TERMINOS_Y_CONDICIONES=Target.the("TITULO DEL MODAL DE TERMINOS Y CONDICIONES").located(By.xpath("//h5[contains(text(),'Términos y condiciones')]"));
    public static final Target DESCRIPCION_MODAL_TERMINOS_Y_CONDICIONES=Target.the("DESCRIPCION DEL MODAL DE TERMINOS Y CONDICIONES").located(By.xpath("/html/body/app-root/app-main/app-footer/div[2]/div/div/div[2]"));

    //PREGUNTAS FRECUENTES


    public static final Target PREGUNTAS_FRECUENTES=Target.the("OPCION PREGUNTAS FRECUENTES").located(By.xpath("//a[contains(text(),'Preguntas frecuentes')]"));
    public static final Target IMAGE_PREGUNTAS_FRECUENTES=Target.the("LOGO DE PREGUNTAS FRECUENTES").located(By.xpath("//body/app-root[1]/app-main[1]/main[1]/app-frequent-questions[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
    public static final Target TITTLE_PREGUNTAS_FRECUENTES=Target.the("TITULO PREGUNTAS FRECUENTES").located(By.xpath("//h4[contains(text(),'Preguntas frecuentes')]"));

    public static final Target PREGUNTA_1=Target.the("TITULO DE PREGUNTA 1").located(By.id("buttonFaqCollapse1"));
    public static final Target PREGUNTA_2=Target.the("TITULO DE PREGUNTA 2").located(By.id("buttonFaqCollapse2"));
    public static final Target RESPUESTA_2=Target.the("RESPUES DE PREGUNTA 2").located(By.xpath("/html/body/app-root/app-main/main/app-login/section[3]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/p"));

    public static final Target PREGUNTA_3=Target.the("TITULO DE PREGUNTA 3").located(By.id("buttonFaqCollapse3"));
    public static final Target RESPUESTA_3=Target.the("RESPUES DE PREGUNTA 3").located(By.xpath("/html/body/app-root/app-main/main/app-login/section[3]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/p"));
    public static final Target PREGUNTA_4=Target.the("TITULO DE PREGUNTA 4").located(By.id("buttonFaqCollapse4"));
    public static final Target RESPUESTA_4=Target.the("RESPUES DE PREGUNTA 4").located(By.xpath("/html/body/app-root/app-main/main/app-login/section[3]/div/div/div[2]/div/div/div[2]/div[4]/div[1]/div/p"));


}
