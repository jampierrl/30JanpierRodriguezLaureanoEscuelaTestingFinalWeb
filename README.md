# Automatización SauceDemo - SerenityBDD + Cucumber

## Descripción
Este proyecto automatiza pruebas sobre la aplicación [SauceDemo](https://www.saucedemo.com/) utilizando **SerenityBDD** con **Cucumber** en idioma español.  
El objetivo es validar escenarios de **happy path** y **unhappy path** relacionados con login, carrito de compras y logout.

### Escenarios automatizados

#### Happy Path
1. **Visualizar productos correctamente**  
   Valida que al iniciar sesión se muestre la lista de productos.

2. **Agregar producto al carrito**  
   Agrega la mochila al carrito y valida que el contador aumente a 1.

3. **Cerrar sesión correctamente**  
   Permite cerrar sesión y validar que regresa a la pantalla de login.

4. **Agregar 5 productos y eliminar 2 del carrito**  
   Agrega 5 productos al carrito, navega al carrito y elimina 2 productos. Verifica que queden 3 productos en el carrito.

#### UnHappy Path
1. **Inicia sesion con contraseña incorrecta**  
    Inicia sesión ingresando contraseña incorrectas y se muestra mensaje de error.

### TAG:
1. @TEST-1 @HAPPYPATH @LOGIN
2. @TEST-2 @HAPPYPATH @CARRITO
3. @TEST-3 @HAPPYPATH @LOGOUT
4. @TEST-4 @UNHAPPYPATH @PASSWORDINCORRECTA
5. @TEST-5 @HAPPYPATH @DELETEPRODUCTOS

### Prerequisitos

- Java JDK 17 o superior.
- Maven 3.6 o superior.
- Navegador Chrome.
- Configuración de credenciales de inicio de sesion en "serenity.conf".

### Ejecutar de la siguiente manera
1. Run en la clase SauceRunner, se ejecutan sucesivamente los casos.
2. Ejecutar cada caso en features/SauceSearch.feature.