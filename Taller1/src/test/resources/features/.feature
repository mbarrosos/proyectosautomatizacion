# language: es
#Author: mbarrosos@choucairtesting.com

Característica: inicio de sesion en sucursal virtual
como usuario quiero logearme para ingresar a sucursal virtual

@caso1
Escenario: logueo exitoso
Dado usuario sucursal
Cuando ingresa credenciales correctas 
Entonces logueo exitoso a sucursal virtual

@caso2
Escenario: logueo fallido
Dado usuario sucursal
Cuando ingresa credenciales incorrectas 
Entonces logueo fallido a sucursal virtual
