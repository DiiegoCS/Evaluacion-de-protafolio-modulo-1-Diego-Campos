package View;
import java.util.Scanner;

import Controller.Coleccion;
import Model.Automovil;
import Model.Motocicleta;
import Model.Vehiculo;

public class Principal {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		
		//realizar registro de ingreso para 2 automóviles y 1 moto
		//listar los vehículos
		//eliminar 1 vehículo por patente
		//mostrar totales por c/vechículo
		
		//crear arraylist para agregar vehiculos validando patente
		//mostrar todos los vehiculos listar)
		//contar vehículos en cada categoría

		Scanner leerTeclado = new Scanner(System.in);
		Coleccion coleccion = new Coleccion();
		
		
		
		System.out.println("----------------------");
		System.out.println("---Taller  Mecánico---");
		System.out.println("----------------------");
		
		
		Automovil auto1 = new Automovil("ppp12", "toyota", "azul", 40000, 4, 50);
		coleccion.agregar(auto1);
		
		Automovil auto2 = new Automovil( "fff13", "NN", "rojo", 25000, 4, 80);
		coleccion.agregar(auto2);
		
		Motocicleta moto1 = new Motocicleta( "rrr123", "PP", "negro", 30000, "deportiva", 9);
		coleccion.agregar(moto1);
		
		
		
		System.out.print("Ingrese patente para calcular pago: ");
		String patente = leerTeclado.next();
		
		for(Vehiculo aux : coleccion.getVehiculos())
		{
			if(aux.getPatente().equalsIgnoreCase(patente))
			{
				
				System.out.println("El total con IVA es: ");
				System.out.println(aux.totalConIva());
				aux.obtenerDescuento();
				System.out.println("El total por Pagar es: ");
				System.out.println(aux.totalPorPagar());
				break;
			}
			
		}
			
		System.out.println(coleccion.listar());
		
		System.out.println("Ingrese patente para eliminar vehiculo");
		String patente2 = leerTeclado.next();
		
		
		for(Vehiculo aux : coleccion.getVehiculos())
		{
			if(aux.getPatente().equalsIgnoreCase(patente2))
			{
				
				System.out.println("se eliminó el vehiculo - Pantente: " + aux.getPatente());
				coleccion.getVehiculos().remove(aux);
				break;
			}

		}
		
		System.out.println(coleccion.contabilizar());

	}

}
