package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado(
				"34956789", "Matias", "Alvarez", LocalDate.of(2001, 5, 19),
				"Masculino", "Callao 322", "1120394392", "matiasalv@gmail.com", "Analista de sistemas"
				);
		
		
		System.out.println(empleado1.toString());
		System.out.println("\n" + "El próximo legajo será " + Empleado.devuelveProximoLegajo());
	}

}
