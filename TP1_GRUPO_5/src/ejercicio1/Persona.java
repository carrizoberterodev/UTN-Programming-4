package ejercicio1;

import java.time.LocalDate;

public class Persona {
	private String 	dni;
	private String 	nombre;
	private String 	apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;

	//atributos listos

	//----------CONSTRUCTORES----------
	
	//constructor vacio
	public Persona(){
		setNombre("sin nombre");
		setEdad(99);
	} 

	
	
	// constructor con parametros
	public Persona(String Dni, String Nombre, String Apellido,
			LocalDate FechaNacimiento, String Genero, String Direccion, String Telefono, String Email ){
		
		setDni(Dni);
		setNombre(Nombre);
		setApellido(Apellido);
		setFechaNacimiento(FechaNacimiento);
		setGenero(Genero);
		setDireccion(Direccion);
		setTelefono(Telefono);
		setEmail(Email);
	    LocalDate hoy = LocalDate.now();
	    int edadCalculada = hoy.getYear() - fechaNacimiento.getYear();
	    if (fechaNacimiento.getMonthValue() > hoy.getMonthValue() ||
	        (fechaNacimiento.getMonthValue() == hoy.getMonthValue() && fechaNacimiento.getDayOfMonth() > hoy.getDayOfMonth())) 
	    {
	        edadCalculada--;
	    }
	    setEdad(edadCalculada);
	}
	//---------------------------------
	
	
	// faltaria realizar otro constructor
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	// metodo toString (modificable)
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	
	
	
}
