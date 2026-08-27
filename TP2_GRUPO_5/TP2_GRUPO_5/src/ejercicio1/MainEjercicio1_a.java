package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {
	public static void main(String[] args) {
        // Prueba 1: DNI Inválido
        try {
        	Persona personaInvalida = new Persona(
                    "AA202020", "Juan", "Perez", 
                    LocalDate.of(1990, 5, 20), "Masculino", "Calle 123", "11223344", "juan@mail.com"
                );

            Persona.exVerificarDNI(personaInvalida.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI: " + e);
        }
        
        
        //Persona 2: DNI Valido
        try {
        	Persona personaValida = new Persona(
        			"20202020","Marcelo","Dominguez",
        			LocalDate.of(2001, 2, 12),"Masculino","Av. Olivos 222", "1123436565","marcedo@gmail.com"
        			);
        	Persona.exVerificarDNI(personaValida.getDni());
        	System.out.println("Persona agregada correctamente: " + "\n" + personaValida.toString());
        } catch(ExVerificarDNI e){
        	System.out.println("Persona no agregada por no verificar el DNI: " + e);
        }
    }
}
