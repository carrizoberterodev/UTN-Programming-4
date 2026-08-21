package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		
		Empleado[] vEmpleados = new Empleado[5];
		//EMPLEADO 1
		vEmpleados[0]= new Empleado(
				"34956789", "Matias", "Alvarez", LocalDate.of(2001, 5, 19),
				"Masculino", "Callao 322", "1120394392", "matiasalv@gmail.com", "Analista de sistemas"
				);
		//EMPLEADO 2
		vEmpleados[1] = new Empleado(
						"75126943", "Gonzalo", "Lopez", LocalDate.of(1985, 11, 25),
						"Masculino", "Paso 558", "1174394513", "gonzalop@gmail.com", "Analista QA"
						);	
		//EMPLEADO 3
		vEmpleados[2]= new Empleado(
						"49568752", "Javier", "Medina", LocalDate.of(1997, 1, 10),
						"Masculino", "Av. San Martin 1250", "1116845109", "javierm@gmail.com", "Desarrollador Backend"
						);
		
		//EMPLEADO 4
		vEmpleados[3]= new Empleado();
		
		//EMPLEADO 5
		vEmpleados[4]= new Empleado();
		
		
				
		for (Empleado emp : vEmpleados) 
		{ 
		        System.out.println(emp.toString());
		        System.out.println();
		}
		
		System.out.println("\n" + "El próximo legajo será " + Empleado.devuelveProximoLegajo());
		
		
	}
	
		

}
