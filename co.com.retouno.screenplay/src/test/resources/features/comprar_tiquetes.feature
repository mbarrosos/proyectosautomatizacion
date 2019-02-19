# language: es
#Author: mbarrosos@choucairtesting.com

@comprartiquetes
Característica: Comprar tiquetes en Viva Air
	Como persona
	Quiero comprar tiquetes para ir de vacaciones
	A través de la página web de Vivaair.com/co

@buscar
Escenario: realizar la busqueda de tiquetes en la página Viva Air
	Dado que Miguel quiere acceder a la Web Viva Air
	Cuando el realiza la busqueda de tiquetes
		| 		origen 													| destino 		 | fechaida    | fecharegreso  | moneda |  numeropasajero   | numeroninio| numeroinfante  |
		| Medellín, José María Córdova (MDE)  | Bogotá (BOG) | 10/03/2019  | 11/04/2019    | USD    | 		1 						|	 2				 |  	1    			  |
	Y da clic en reservar vuelo ingresa los datos de los pasajeros
		| nombreadulto | apellidoadulto | generoadulto | documentoadulto | correo 			 | celularadulto | nombreninio | apellidoninio | generoninio | documentoninio | fechanacimientoninio | nombreinfante | apellidoinfante | fechanacimientoinfante | serviciosadicionales |
		| José         | Peres          | Masculino  	 | 1032545774      | juan@info.com | 3216547895 	 |	 Pablito	 | Peres    		 | Masculino	 | 2547895414     | 02/04/2012					 | Juanito       | Ruiz						 |	04/02/2018						| No gracias.					 |
		| 						 |								|							 |								 |							 |							 |   Juanita	 | Rojas				 | Femenino		 | 6464668654			| 05/06/2013					 |		 					 |								 |												| 										 |
	Entonces el verifique que la suma de los servicios adicionales es USD 0.00