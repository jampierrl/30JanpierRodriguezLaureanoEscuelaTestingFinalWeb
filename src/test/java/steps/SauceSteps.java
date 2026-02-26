package steps;

import net.serenitybdd.annotations.Step;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import page.SaucePage;

public class SauceSteps {

    SaucePage saucePage;

    EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();

    String username = environmentVariables.getProperty("sauce.username");
    String password = environmentVariables.getProperty("sauce.password");

    @Step
    public void abrirSauce() {
        saucePage.open();
    }

    @Step
    public void loginValido() {
        saucePage.enterUsername(username);
        saucePage.enterPassword(password);
        saucePage.clickLogin();
    }

    @Step
    public void loginIncorrecto() {
        saucePage.enterUsername(username);
        saucePage.enterPassword("wrong_password");
        saucePage.clickLogin();
    }

    @Step
    public boolean validarProductos() {
        return saucePage.productosVisibles();
    }

    @Step
    public void agregarProducto() {
        saucePage.agregarBackpack();
    }

    @Step
    public void agregarCincoProductos() {
        saucePage.agregarCincoProductos();
    }

    @Step
    public void irAlCarritoYEliminarDos() {
        saucePage.irAlCarritoYEliminarDos();
    }

    @Step
    public String obtenerCantidadCarrito() {
        return saucePage.obtenerCantidadCarrito();
    }

    @Step
    public void cerrarSesion() {
        saucePage.abrirMenu();
        saucePage.cerrarSesion();
    }

    @Step
    public boolean validarErrorLogin() {
        return saucePage.mensajeErrorVisible();
    }
}
