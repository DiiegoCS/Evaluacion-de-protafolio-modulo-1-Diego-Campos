import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion  {

	ArrayList<Vehiculo> vehiculos;
	Scanner leerTeclado = new Scanner(System.in);
	Integer moto = 0, auto = 0;

	public Coleccion() {
		
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public Coleccion(ArrayList<Vehiculo> vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	public boolean agregar(Vehiculo vehiculo)
	{

		for(Vehiculo aux : vehiculos)
		{
			if(aux.getPatente() == vehiculo.getPatente())
			{
				return false; // no lo agrega porque ya existe
			}
		}
				vehiculos.add(vehiculo);
				return true; //devuelve true para confirmar que se agregó
	}
	
	
	public String listar()
	{
		String datos = "";
		for(Vehiculo aux : vehiculos)
		{
			datos += "\n" + aux.mostrarDatos();
		}
		
		return datos;
	}
	
	public String contabilizar()
	{
		
		for(Vehiculo aux : vehiculos)
		{
			if(aux instanceof Automovil)
			{
				moto++;
			}
			else 
			{
				auto++;
			}
		}
		 return "Existen:\n" + moto + " motocicletas y " + auto + " automóviles"; 
	}

	
}
