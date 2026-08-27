package ejercicio1;

import java.time.LocalDate;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		TreeSet<Empleado> arbolEmpleados = new TreeSet<>();
		Empleado emp1 = new Empleado("18985632", "Tomas", "Pérez", 
                LocalDate.of(1994, 6, 12), "Masculino", 
                "Av. Marquez 153", "1185234455", 
                "tomas.perez@mail.com", "Vendedor");
		
		Empleado emp2 = new Empleado("22345678", "Sofía", "Ramírez",
		        LocalDate.of(1991, 9, 3), "Femenino",
		        "Calle Libertad 450", "1178452233",
		        "sofia.ramirez@mail.com", "Cajera");

		Empleado emp3 = new Empleado("31234567", "Martín", "González",
		        LocalDate.of(1988, 12, 21), "Masculino",
		        "Av. Belgrano 980", "1167321980",
		        "martin.gonzalez@mail.com", "Repositor");

		Empleado emp4 = new Empleado("27654321", "Carla", "Suárez",
		        LocalDate.of(1996, 4, 7), "Femenino",
		        "San Juan 210", "1188997744",
		        "carla.suarez@mail.com", "Supervisora");

		Empleado emp5 = new Empleado("33445566", "Hernán", "López",
		        LocalDate.of(1993, 10, 15), "Masculino",
		        "Mitre 600", "1177008899",
		        "hernan.lopez@mail.com", "Vendedor");
		
		arbolEmpleados.add(emp1);
		arbolEmpleados.add(emp2);
		arbolEmpleados.add(emp3);
		arbolEmpleados.add(emp4);
		arbolEmpleados.add(emp5);
		
	}

}
