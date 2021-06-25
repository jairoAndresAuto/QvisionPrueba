package com.qvision.certificacion.utest.tasks;

import static com.qvision.certificacion.utest.userinterface.RegistrarUsuarioIU.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.qvision.certificacion.utest.interactions.AvanzarSiguientePagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

public class RegistrarUsuario implements Task {

    private List<Map<String,String>> datosRegistro;
    private List<String> titulos;

    public RegistrarUsuario(List<Map<String, String>> datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AvanzarSiguientePagina.con(BTN_REGISTRARSE, LBL_PAGINA_REGISTRO),
                Enter.theValue(datosRegistro.get(0).get("nombre")).into(TXT_NOMBRES),
                Enter.theValue(datosRegistro.get(0).get("apellido")).into(TXT_APELLIDOS),
                Enter.theValue(datosRegistro.get(0).get("correo")).into(TXT_CORREO),
                SelectFromOptions.byVisibleText(datosRegistro.get(0).get("med")).from(SLC_MES),
                SelectFromOptions.byVisibleText(datosRegistro.get(0).get("dia")).from(SLC_DIA),
                SelectFromOptions.byVisibleText(datosRegistro.get(0).get("anno")).from(TXT_ANNO),
                AvanzarSiguientePagina.con(BTN_SIGUIENTE, LBL_PAGINA_REGISTRO_STEP2),
                AvanzarSiguientePagina.con(BTN_SIGUIENTE_DEVICES, LBL_PAGINA_REGISTRO_STEP3),
                AvanzarSiguientePagina.con(BTN_SIGUIENTE_PAGINA, LBL_PAGINA_REGISTRO_STEP4),
                Enter.theValue(datosRegistro.get(0).get("contrasena")).into(TXT_PASSWORD),
                Enter.theValue(datosRegistro.get(0).get("contrasena")).into(TXT_CONFIRMAR_PASSWORD),
                Click.on(CHK_ACEPTAR_UTEST),
                Click.on(CHK_ACEPTAR_POLITICAS),
                Click.on(BTN_COMPLETAR_REGISTRO)
        );
    }

    public static RegistrarUsuario con(List<Map<String,String>> datosRegistro){
        return Tasks.instrumented(RegistrarUsuario.class,datosRegistro);
    }


}
