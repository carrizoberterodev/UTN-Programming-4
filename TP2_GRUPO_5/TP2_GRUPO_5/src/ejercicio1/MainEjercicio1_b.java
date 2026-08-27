package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {
	public static void main(String[] args) {
      // array de personas//
		ArrayList<Empleado> listaempleados = new ArrayList<Empleado>(5);
		
		Empleado emp1 = new Empleado("30111222", "Juan", "Pérez", 
                LocalDate.of(1990, 5, 14), "Masculino", 
                "Av. Siempreviva 123", "1122334455", 
                "juan.perez@mail.com", "Vendedor");

		Empleado emp2 = new Empleado("28555666", "María", "Gómez", 
		                LocalDate.of(1985, 11, 2), "Femenino", 
		                "Calle Falsa 456", "1155667788", 
		                "maria.gomez@mail.com", "Cajera");
		
		Empleado emp3 = new Empleado("35999888", "Carlos", "López", 
		                LocalDate.of(1995, 3, 27), "Masculino", 
		                "Belgrano 789", "1199887766", 
		                "carlos.lopez@mail.com", "Repositor");
		
		Empleado emp4 = new Empleado("32444555", "Lucía", "Fernández", 
		                LocalDate.of(1992, 8, 9), "Femenino", 
		                "San Martín 321", "1166554433", 
		                "lucia.fernandez@mail.com", "Supervisora");
		
		Empleado emp5 = new Empleado("40777111", "Diego", "Martínez", 
		                LocalDate.of(1998, 1, 19), "Masculino", 
		                "Rivadavia 654", "1133221100", 
		                "diego.martinez@mail.com", "Vendedor");


		listaempleados.add(emp1);
		listaempleados.add(emp2);
		listaempleados.add(emp3);
		listaempleados.add(emp4);
		listaempleados.add(emp5);
		
		//Mostrar informacion con un Iterator
		Iterator<Empleado> it = listaempleados.iterator();
		
		while(it.hasNext()) {
			Empleado empleado = it.next();
			System.out.println("-------------------------------------");
			System.out.println(empleado.toString());
		}
		
		
		
    }
}
