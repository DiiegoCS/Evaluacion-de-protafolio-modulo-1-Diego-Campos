import java.util.Scanner;
public class ActividadMayordeEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2.- Crear una app en la cual, solicite un nombre y la edad. Señale si es mayor de edad o no.
		
		String nombre;
		String apellido;
		int edad;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		nombre = leer.next();
		
		System.out.print("Ingrese su apellido: ");
		apellido = leer.next();
		
		System.out.print("Ingrese su edad: ");
		edad = leer.nextInt();
		//otra opcion: edad= Interger.parseInt(leer.next()); [convierte]
		
	System.out.println("Hola " + nombre + " " + apellido +".");
	if (edad >= 18)
	{
		System.out.print("Eres mayor de edad.");
	}
	else
	{
		System.out.print("Eres menor de edad.");
	}
	}

}
