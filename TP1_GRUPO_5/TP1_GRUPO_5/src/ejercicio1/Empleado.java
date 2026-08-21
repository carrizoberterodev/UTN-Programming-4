package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {

    private static int proximoLegajo = 1000;
    private final int legajo;
    private String puesto;

    //-------CONSTRUCTORES-------
    public Empleado() {
        super();
        this.legajo = proximoLegajo++;
        this.puesto = "Sin puesto";
    }
    
    public Empleado(String dni, String nombre, String apellido,LocalDate fechaNacimiento, 
    				String genero, String direccion, String telefono, String email,String puesto ) 
    {
    	super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
    	this.legajo = proximoLegajo++;
    	setPuesto(puesto);
    }
    //---------------------------
 
    //------GETTERS SETTERS------
    public int getLegajo() {
        return legajo;
    }

    public static int getProximoLegajo() {
        return proximoLegajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    //---------------------------
    
    //------METODO toString------
    @Override
    public String toString() {
        return "Empleado, LEGAJO: " + legajo + ", PUESTO: " + puesto + "\n" + 
               "DNI: " + getDni() + ", NOMBRE: " + getNombre() + 
               ", APELLIDO: " + getApellido() + ", EDAD: " + getEdad() + 
               ", FECHA DE NACIMIENTO: " + getFechaNacimiento() + "\n" +
               "GENERO: " + getGenero() + ", DIRECCION: " + getDireccion() + 
               ", TELEFONO: " + getTelefono() + ", EMAIL: " + getEmail();
    }
    //---------------------------
    
    //----------METODOS----------
    public static int devuelveProximoLegajo() {
    	return getProximoLegajo();
    }
    
    
    
    
    
    
    
    
}
