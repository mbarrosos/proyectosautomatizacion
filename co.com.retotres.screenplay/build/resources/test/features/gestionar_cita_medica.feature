#Author: mbarrosos@choucairtesting.com
# language: es

Característica: Gestionar cita Médica
	Como paciente
	Quiero realizar la solicitud de una cita médica
	A través del sistema de Administración de Hospitales

@agendarcita
Escenario: Realizar el Agendamiento de una Cita
	Dado que Carlos necesita asistir al medico
	Cuando el realiza el agendamiento de una Cita
		| dia cita 		 | documento del paciente | documento del doctor | observaciones |
		| 05/02/2019   | 1035754852     				| 1213562545 					 | Cita médica   |
	Entonces el confirma que se presente en pantalla el mensaje Datos guardados correctamente.




