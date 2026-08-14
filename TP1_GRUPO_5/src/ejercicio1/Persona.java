package ejercicio1;

public class Persona {
	private String 	dni;
	private String 	nombre;
	private String 	apellido;
	//faltan mas atributos
	
	
	//constructores
	Persona(){} //constructor vacio
	
	//getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
}
