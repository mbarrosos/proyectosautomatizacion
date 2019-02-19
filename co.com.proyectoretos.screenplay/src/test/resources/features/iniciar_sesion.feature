#Author: mbarrosos@choucairtesting.com
# language: es

Característica: Login con ventana emergente en the internet
    Como usuario    
    Quiero ingresar a la p�gina the internet
    Para hacer pruebas 

@login
Escenario: login con ventana emergente
	Dado que Miguel quiere ingresar a the internet
  Cuando el ingresa usuario admin
  Y contrasena admin
  Entonces deberia ver la pantalla de bienvenida