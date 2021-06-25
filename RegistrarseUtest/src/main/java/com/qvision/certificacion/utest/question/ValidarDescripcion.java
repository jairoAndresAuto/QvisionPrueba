package com.qvision.certificacion.utest.question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarDescripcion implements Question<Boolean> {

    private String descripcion;
    private Target target;

    public ValidarDescripcion(String descripcion, Target target){
        this.descripcion = descripcion;
        this.target=target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString().contains(descripcion);
    }

    public static ValidarDescripcion attach(String descripcion, Target target) {
        return new ValidarDescripcion(descripcion,target);
    }
}
