package com.qvision.certificacion.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.qvision.certificacion.utest.stepsdefinitons",
        features = "src/test/resources/com.qvision.certificacion.utest.features/registrar_usuario.feature",
        snippets = SnippetType.CAMELCASE
)
public class RegistrarUsuarioRunner {
}
