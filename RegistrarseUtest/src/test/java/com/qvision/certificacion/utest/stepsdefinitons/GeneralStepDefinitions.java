package com.qvision.certificacion.utest.stepsdefinitons;

import com.qvision.certificacion.utest.exception.InternetConnectionException;
import com.qvision.certificacion.utest.util.CheckInternetConnection;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class GeneralStepDefinitions {

    /*indicamos el navegador a trabajar*/
    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    /*donde se llama el actor y se inicializa la pagina en la url indicada*/
    @SuppressWarnings("unchecked")
    public void setUp(String URL)  {
        try {
            setTheStage(new Cast());
            theActorCalled("JairoGarcia");
            theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
            URL url = new URL(URL);
            CheckInternetConnection checkInternetConnection = new CheckInternetConnection(url);
            checkInternetConnection.checkConnection();
            theActorInTheSpotlight().wasAbleTo(Open.url(URL));

        } catch (InternetConnectionException | MalformedURLException e) {
            throw new InternetConnectionException(InternetConnectionException.INTERNET_FAILED);
        }
    }
}
