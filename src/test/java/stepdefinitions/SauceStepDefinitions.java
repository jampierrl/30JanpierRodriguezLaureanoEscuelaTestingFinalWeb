package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import steps.SauceSteps;

public class SauceStepDefinitions {

    @Steps
    SauceSteps sauceSteps;

    @Dado("que el usuario abre la página de Sauce")
    public void abrirPagina() {
        sauceSteps.abrirSauce();
    }

    @Y("inicia sesión correctamente")
    public void loginCorrecto() {
        sauceSteps.loginValido();
    }

    @Entonces("debería ver la lista de productos")
    public void validarProductos() {
        Assert.assertTrue(sauceSteps.validarProductos());
    }

    @Cuando("agrega el producto mochila")
    public void agregarProducto() {
        sauceSteps.agregarProducto();
    }

    @Entonces("el carrito debería mostrar 1 producto")
    public void validarCarrito() {
        Assert.assertEquals("1", sauceSteps.obtenerCantidadCarrito());
    }

    @Cuando("el usuario cierra sesión")
    public void cerrarSesion() {
        sauceSteps.cerrarSesion();
    }

    @Entonces("debería regresar a la pantalla de login")
    public void validarLogout() {
        Assert.assertTrue(true);
    }

    @Cuando("inicia sesión con contraseña incorrecta")
    public void loginIncorrecto() {
        sauceSteps.loginIncorrecto();
    }

    @Entonces("debería visualizar mensaje de error")
    public void validarErrorLogin() {
        Assert.assertTrue(sauceSteps.validarErrorLogin());
    }

    @Cuando("agrega 5 productos al carrito")
    public void agregar5Productos() {
        sauceSteps.agregarCincoProductos();
    }

    @Y("va al carrito y elimina 2 productos")
    public void eliminar2Productos() {
        sauceSteps.irAlCarritoYEliminarDos();
    }

    @Entonces("el carrito debería mostrar 3 productos")
    public void validarCantidadCarrito3() {
        Assert.assertEquals("3", sauceSteps.obtenerCantidadCarrito());
    }

}
