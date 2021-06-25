package com.qvision.certificacion.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AvanzarSiguientePagina implements Interaction {

    private Target siguiente;
    private Target titulos;

    public AvanzarSiguientePagina(Target siguiente, Target titulos) {
        this.siguiente = siguiente;
        this.titulos = titulos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(siguiente),
                WaitUntil.the(titulos,isVisible())
        );
        actor.remember(Text.of(titulos).viewedBy(actor).asString(), Text.of(titulos).viewedBy(actor).asString());
    }

    public static AvanzarSiguientePagina con(Target siguiente,Target titulos){
        return Tasks.instrumented(AvanzarSiguientePagina.class,siguiente,titulos);
    }

}
