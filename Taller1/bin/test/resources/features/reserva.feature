# language: es
#Author: mbarrosos@choucairtesting.com

Caracter�stica: Reservar tiquites desde aplicaci�n web Avianca

como usuario 
quiero desde aplicaci�n web reservar tiquetes 
para viajar 

@caso1
Esquema del escenario: Reservar tiquites de Medell�n a Canad� 
Dado usuario ingresa <nro_ni�os> en el formulario 
Y usuario ingresa <nro_adultos> en el formulario
Y usuario selecciona <clase_vuelo>
Cuando usuario da clic en el bot+on <bot�n>  
Entonces estado de reserva <estado_reserva>

Ejemplos:
	| nro_ni�os | nro_adultos | clase_vuelo | bot�n    | estado_reserva |
	| 2 				| 2           | econ�mica   | reservar | exitoso        |
	| 2 				| 2           | ejecutiva   | reservar | fallido        | 


@caso2
Esquema del escenario: Reservar tiquites de Bogot� a Paris 
Dado usuario ingresa <nro_ni�os> en el formulario 
Y usuario ingresa <nro_adultos> en el formulario
Y usuario selecciona <clase_vuelo>
Cuando usuario da clic en el bot+on <bot�n>  
Entonces estado de reserva <estado_reserva>

Ejemplos:
	| nro_ni�os | nro_adultos | clase_vuelo | bot�n    | estado_reserva |
	| 4 				| 4           | ejecutiva   | reservar | exitoso        |
	| 4 				| 4           | econ�mica   | reservar | fallido        | 

