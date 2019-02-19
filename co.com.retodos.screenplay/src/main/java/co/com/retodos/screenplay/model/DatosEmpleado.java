package co.com.retodos.screenplay.model;

public class DatosEmpleado {
	
	private String nombre;
	private String segundonombre;
	private String apellido;
	private String localidad;
	private String region;
	private String fte;
	private String departamentotemporal;
	private String gruposanguineo;
	private String actividad;
	
	public String nombreCompleto () {
		return nombre+" "+segundonombre+" "+apellido; 
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getFte() {
		return fte;
	}
	public void setFte(String fte) {
		this.fte = fte;
	}
	public String getDepartamentotemporal() {
		return departamentotemporal;
	}
	public void setDepartamentotemporal(String departamentotemporal) {
		this.departamentotemporal = departamentotemporal;
	}
	public String getGruposanguineo() {
		return gruposanguineo;
	}
	public void setGruposanguineo(String gruposanguineo) {
		this.gruposanguineo = gruposanguineo;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	
	
	

}
