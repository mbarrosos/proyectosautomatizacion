package co.com.retouno.screenplay.model;

public class Cliente {
	
	private String nombre;
	private String primerapellido;
	private String seguntoapellido;
	private int documento;
	
	public Cliente(String nombre, String primerapellido, String seguntoapellido, int documento) {
		super();
		this.nombre = "Antonio";
		this.primerapellido = "Zapata";
		this.seguntoapellido = "Restrepo";
		this.documento = 123456789;
	}
	
	public void imprimirInformacionPersonalCliente() {
		System.out.println("La siguiente es la informacion personal de "+ nombre + " "+ primerapellido + " " 
							+ seguntoapellido + "  Con numero de documento " + documento);
	}
	
	public void imprimirInformacionCompletaCliente() {
		imprimirInformacionPersonalCliente();
	}

}
