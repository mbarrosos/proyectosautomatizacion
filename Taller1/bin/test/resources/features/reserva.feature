# language: es
#Author: mbarrosos@choucairtesting.com

Característica: Reservar tiquites desde aplicación web Avianca

como usuario 
quiero desde aplicación web reservar tiquetes 
para viajar 

@caso1
Esquema del escenario: Reservar tiquites de Medellín a Canadá 
Dado usuario ingresa <nro_niños> en el formulario 
Y usuario ingresa <nro_adultos> en el formulario
Y usuario selecciona <clase_vuelo>
Cuando usuario da clic en el bot+on <botón>  
Entonces estado de reserva <estado_reserva>

Ejemplos:
	| nro_niños | nro_adultos | clase_vuelo | botón    | estado_reserva |
	| 2 				| 2           | económica   | reservar | exitoso        |
	| 2 				| 2           | ejecutiva   | reservar | fallido        | 


@caso2
Esquema del escenario: Reservar tiquites de Bogotá a Paris 
Dado usuario ingresa <nro_niños> en el formulario 
Y usuario ingresa <nro_adultos> en el formulario
Y usuario selecciona <clase_vuelo>
Cuando usuario da clic en el bot+on <botón>  
Entonces estado de reserva <estado_reserva>

Ejemplos:
	| nro_niños | nro_adultos | clase_vuelo | botón    | estado_reserva |
	| 4 				| 4           | ejecutiva   | reservar | exitoso        |
	| 4 				| 4           | económica   | reservar | fallido        | 

