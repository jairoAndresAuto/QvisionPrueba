package com.qvision.certificacion.utest.stepsdefinitons;

import com.qvision.certificacion.utest.tasks.RegistrarUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioUtest extends GeneralStepDefinitions{

    @Dado("^que me encuentro en la pagina de Utest$")
    public void queMeEncuentroEnLaPaginaDeUtest() {
       setUp("https://www.utest.com/");
    }


    @Cuando("^Procedo a realizar el registro e ingreso los datos$")
    public void procedoARealizarElRegistroEIngresoLosDatos(List<Map<String,String>> datosRegistro) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.con(datosRegistro));
    }

    @Cuando("^se puede ver que el registro es exitoso$")
    public void sePuedeVerQueElRegistroEsExitoso() {

    }

    @Entonces("^inicio sesion para validar registro exitoso$")
    public void inicioSesionParaValidarRegistroExitoso() {

    }

}
