package com.qvision.certificacion.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarUsuarioIU {

    public static Target BTN_REGISTRARSE=Target.the("boton convertirse en tester").located(By.xpath("(//*[@id='mainContent']//a)[1]"));
    public static Target LBL_PAGINA_REGISTRO=Target.the("titulo pagina de registro").located(By.xpath("//span[contains(.,'Tell us about yourself')]"));
    public static Target TXT_NOMBRES=Target.the("texto nombres").located(By.id("firstName"));
    public static Target TXT_APELLIDOS=Target.the("texto apellido").located(By.id("lastName"));
    public static Target TXT_CORREO=Target.the("texto correo").located(By.id("email"));
    public static Target SLC_MES=Target.the("lista meses").located(By.id("birthMonth"));
    public static Target SLC_DIA=Target.the("lista dia").located(By.id("birthDay"));
    public static Target TXT_ANNO=Target.the("lista año").located(By.id("birthYear"));
    public static Target BTN_SIGUIENTE=Target.the("boton siguiente").located(By.xpath("//*[@aria-label='Next step - define your location']"));
    public static Target LBL_PAGINA_REGISTRO_STEP2=Target.the("titulo pagina de registro paso 2").located(By.xpath("//span[contains(.,'Add your address')]"));
    public static Target BTN_SIGUIENTE_DEVICES=Target.the("boton siguiente").located(By.xpath("//*[@aria-label='Next step - select your devices']"));
    public static Target LBL_PAGINA_REGISTRO_STEP3=Target.the("titulo pagina de registro paso 3").located(By.xpath("//span[contains(.,'Tell us about your devices')]"));
    public static Target BTN_SIGUIENTE_PAGINA=Target.the("boton siguiente").located(By.xpath("//*[@aria-label='Next - final step']"));
    public static Target LBL_PAGINA_REGISTRO_STEP4=Target.the("titulo pagina de registro paso 4").located(By.xpath("//span[contains(.,'The last step')]"));
    public static Target TXT_PASSWORD=Target.the("contraseña").located(By.id("password"));
    public static Target TXT_CONFIRMAR_PASSWORD=Target.the("confirmar contraseña").located(By.id("confirmPassword"));
    public static Target CHK_ACEPTAR_UTEST=Target.the("contraseña").located(By.xpath("(//*[@name='userForm']//span)[3]"));
    public static Target CHK_ACEPTAR_POLITICAS=Target.the("confirmar contraseña").located(By.xpath("(//*[@name='userForm']//span)[5]"));
    public static Target BTN_COMPLETAR_REGISTRO=Target.the("contraseña").located(By.id("laddaBtn"));

}
