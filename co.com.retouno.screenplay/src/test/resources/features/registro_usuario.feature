# language: es
#Author: mbarrosos@choucairtesting.com


@registro
Característica: registro de usuario
	Como usuario
	Quiero realizar el registro en la pagina
	A traves del deligencionamiento del formulario

Escenario: realizar el registro en la página Automation web
	Dado que Carlos quiere acceder a la Web Automation Demo Site
	Cuando el realiza el registro en la página
	| nombre 		| apellido 	| direccion      | email 		          | celular    |  genero   | actividad| lenguajes 	  | habilidades |  pais     | seleccionarpais   | anio  | mes      | dia | contrasena  |
	| Juanito   | alimaña   | Cr 20 # 47-20  | juanito@coeo.com | 0123956789 | Masculino | Movies		|  English      | Java        | Colombia  | Hong Kong				  | 1991  | December | 15  | Abc123      |
	Entonces el verifica que se carga la pantalla con texto - Double Click on Edit Icon to EDIT the Table Row.