# language: es
#Author: mbarrosos@choucairtesting.com


@Regresion
Característica: Gestionar cita Médica
	Como paciente
	Quiero realizar la solicitud de una cita médica
	A través del sistema de Administración de Hospitales
	
@registrodoctor
Escenario: Realizar el Registro de un Doctor
	Dado que Carlos necesita registrar un nuevo doctor
	Cuando el realiza el registro del mismo en el aplicativo de Administración de Hospitales
		| nombres 				| apellidos     | telefono | tipo    							| documento  |
		| Juanito Doctor 	| Alimaña Peres | 225644   | Cédula de ciudadanía | 1213565485 |  
	Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

@registropaciente
Escenario: Realizar el Registro de un Paciente
	Dado que Carlos necesita registrar un nuevo paciente
	Cuando el realiza el registro en el aplicativo de Administración de Hospitales
		| nombres  				 | apellidos     | telefono | tipo    						 | documento  |
		| Juanito Paciente | Ochoa Lopez   | 356642   | Cédula de ciudadanía | 1035974852 |
	Entonces el verifica que muestre en pantalla el mensaje Datos guardados correctamente.


@agendarcita
Escenario: Realizar el Agendamiento de una Cita
	Dado que Carlos necesita asistir al medico
	Cuando el realiza el agendamiento de una Cita
		| diacita 		 | documentodelpaciente | documentodeldoctor | observaciones |
		| 05/02/2019   | 1035754852     				| 1213562545 					 | Cita médica   |
	Entonces el confirma que se presente en pantalla el mensaje Datos guardados correctamente.




