# language: es
Característica: Automatización SauceDemo

  Antecedentes:
    Dado que el usuario abre la página de Sauce
    Y inicia sesión correctamente

  @TEST-1 @HAPPYPATH @LOGIN
  Escenario: Visualizar productos correctamente
    Entonces debería ver la lista de productos

  @TEST-2 @HAPPYPATH @CARRITO
  Escenario: Agregar producto al carrito
    Cuando agrega el producto mochila
    Entonces el carrito debería mostrar 1 producto

  @TEST-3 @HAPPYPATH @LOGOUT
  Escenario: Cerrar sesión correctamente
    Cuando el usuario cierra sesión
    Entonces debería regresar a la pantalla de login

  @TEST-4 @UNHAPPYPATH @PASSWORDINCORRECTA
  Escenario: Login con contraseña incorrecta
    Dado que el usuario abre la página de Sauce
    Cuando inicia sesión con contraseña incorrecta
    Entonces debería visualizar mensaje de error

  @TEST-5 @HAPPYPATH @DELETEPRODUCTOS
  Escenario: Agregar 5 productos y eliminar 2 del carrito
    Cuando agrega 5 productos al carrito
    Y va al carrito y elimina 2 productos
    Entonces el carrito debería mostrar 3 productos