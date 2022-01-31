import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		/*Registro de vehículos en chile:
Se requiere almacenar la información de los vehículos que circulan por Santiago 
para mejorar la eficiencia y generar políticas que descongestionar, 
reducir las emisiones contaminantes y optimizar los tiempos de traslados de las personas.

Diagrama:
https://prnt.sc/26ewr4t
 
Definir en la super clase:
·         5 atributos.
·         3 métodos.
 
Definir en las sub clases:
·         2 atributos.
·         1 método.
		*/
		
	Vehiculo vehiculo1 = new Vehiculo();
	vehiculo1.setCapacidadPasajeros(3);
	vehiculo1.setCombustible("petroleo");
	vehiculo1.setParadas(5);
	vehiculo1.setPatente("fgrt12");
	vehiculo1.setVelocidadRecorrido(50);
	System.out.println("La patente Vehiculo1 es: " + vehiculo1.getPatente());
		
	Automovil automovil1 = new Automovil("44fdg", "Bencina", 4, 5, 4, false, 0);
	System.out.println("La patente automovil1 es: " + automovil1.getPatente());
	
	System.out.println(automovil1.mostrarDatos());
		
	
	// actividad: como resolver este problema???
	
	Vehiculo tren = new Tren("rfcd58", "electrico", 300, 60, 7, 6, "pasajeros");
	
	Vehiculo auto = new Automovil("23edf", "Bencina", 4, 80, 20, true, 4);
	
	Vehiculo moto = new Motocicleta("rtgh56", "bencina", 2, 70, 10, "deportiva", 15);
	
	ArrayList<Vehiculo> vehiculos =  new ArrayList <Vehiculo>();
	vehiculos.add(tren);
	vehiculos.add(auto);
	vehiculos.add(moto);
	
	for(Vehiculo v: vehiculos)
	{
		System.out.println(v.getPatente());
		if(v instanceof Tren)
		{
			System.out.println(((Tren)v).cambiarCarril());
		}
		else if(v instanceof Automovil)
		{
			System.out.println(((Automovil)v).encender(true));
		}
	}
		
	System.out.println(tren.mostrarDatos());
	System.out.println(auto.mostrarDatos());
	System.out.println(moto.mostrarDatos());
	
	
	}

}
