package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/")
public class SaucePage extends PageObject {

    @FindBy(id = "user-name")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    @FindBy(className = "inventory_item")
    WebElementFacade productos;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElementFacade addBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElementFacade addBikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElementFacade addBoltShirt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElementFacade addJacket;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElementFacade addOnesie;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElementFacade removeBackpack;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElementFacade removeBikeLight;

    @FindBy(className = "shopping_cart_badge")
    WebElementFacade cartBadge;

    @FindBy(id = "react-burger-menu-btn")
    WebElementFacade menu;

    @FindBy(id = "logout_sidebar_link")
    WebElementFacade logout;

    @FindBy(css = ".error-message-container")
    WebElementFacade errorMessage;

    @FindBy(id = "shopping_cart_container")
    WebElementFacade cartIcon;

    public void agregarBackpack() {
        addBackpack.click();
    }

    public void agregarCincoProductos() {
        addBackpack.click();
        addBikeLight.click();
        addBoltShirt.click();
        addJacket.click();
        addOnesie.click();
    }

    public void irAlCarritoYEliminarDos() {
        cartIcon.click();
        removeBackpack.click();
        removeBikeLight.click();
    }

    public String obtenerCantidadCarrito() {
        return cartBadge.getText();
    }

    public void enterUsername(String user) {
        username.type(user);
    }

    public void enterPassword(String pass) {
        password.type(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean productosVisibles() {
        return productos.isVisible();
    }

    public void abrirMenu() {
        menu.click();
    }

    public void cerrarSesion() {
        logout.click();
    }

    public boolean mensajeErrorVisible() {
        return errorMessage.isVisible();
    }
}
