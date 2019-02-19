#Author: mbarrosos@choucairtesting.com
# language: es

@registro
Característica: registro de usuario
	Como usuario
	Quiero realizar el registro de un empleado en la pagina OragenHR
	A traves del deligencionamiento del formulario

Escenario: realizar el registro en la página Automation web
	Dado que Juan necesita crear un empleado en el OrageHR
	Cuando el realiza el ingreso del registro en la aplicacion
	| nombre  | segundonombre | apellido 	| localidad      			| region 	 | fte  | departamentotemporal 	| gruposanguineo | actividad 	  |
	| Juanito | manuel  			| alimaña   | France Regional HQ  | Region-2 | 0.75 | Sub unit-1            | AB			 	     |  Movies      |
	Entonces el visualiza el nuevo empleado en el aplicativo
