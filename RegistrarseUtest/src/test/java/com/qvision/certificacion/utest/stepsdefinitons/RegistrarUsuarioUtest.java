package com.qvision.certificacion.utest.stepsdefinitons;

import com.qvision.certificacion.utest.tasks.RegistrarUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static com.qvision.certificacion.utest.util.Constantes.*;
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

    @Entonces("^procedo a validar titulos$")
    public void procedoAValidarTitulos() {
        Assert.assertThat(theActorInTheSpotlight().recall(titulo1), Matchers.is("Tell us about yourself"));
        Assert.assertThat(theActorInTheSpotlight().recall(titulo2), Matchers.is("Add your address"));
        Assert.assertThat(theActorInTheSpotlight().recall(titulo3), Matchers.is("Tell us about your devices"));
        Assert.assertThat(theActorInTheSpotlight().recall(titulo4), Matchers.is("The last step"));
    }

}
