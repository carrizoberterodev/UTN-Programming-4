package ejercicio1;

public class Empleado extends Persona{
	
	private int legajo;
	private String puesto;
	
	
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + ", getDni()=" + getDni() + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getGenero()=" + getGenero()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", getEmail()="
				+ getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
