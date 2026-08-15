package ejercicio1;

public class Empleado extends Persona{
	
	private int legajo;
	private String puesto;
	
	
	@Override
	public String toString() {
	    return "Empleado [legajo=" + legajo + ", puesto=" + puesto + 
	           ", dni=" + getDni() + ", nombre=" + getNombre() + 
	           ", apellido=" + getApellido() + ", edad=" + getEdad() + 
	           ", fechaNacimiento=" + getFechaNacimiento() + 
	           ", genero=" + getGenero() + ", direccion=" + getDireccion() + 
	           ", telefono=" + getTelefono() + ", email=" + getEmail() + "]";
	}
	
}
