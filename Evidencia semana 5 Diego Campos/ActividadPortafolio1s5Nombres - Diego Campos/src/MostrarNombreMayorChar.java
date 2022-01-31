import java.util.Scanner;

public class MostrarNombreMayorChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Actividad3. 
		Solicitar la cantidad de nombres a ingresar, guardar en un arreglo y luego determine cual es el nombre que tiene más caracteres.
		
		actividad 4: mostrar el nombre que tiene más carácteres.
		*/
				
				int cantidadNombres;
				int mayor = 0;
				
				Scanner leerTeclado = new Scanner(System.in);
				
				System.out.print("Ingrese la cantidad nombres:"); //solicitar cantidad de nombres
				cantidadNombres = leerTeclado.nextInt();
				
				String nombres[] = new String[cantidadNombres]; //crear arreglo
				
				for(int i = 0; i < cantidadNombres; i++) //pedir nombres
				{
					System.out.println("Ingrese nombre n° " + (i+1) + " :");
					nombres[i] = leerTeclado.next();
					
				}
					
				String nombreMayor = " ";
				for (int x = 1; x < nombres.length; x++) {
								
						if (nombres[x].length() > mayor) 
						{
							mayor = nombres[x].length();    //buscar mayor
						}
						if (mayor == nombres[x].length())
						{
							nombreMayor = nombres[x];
						}
					}
				
				
					System.out.println("El nombre con más carácteres es: " + nombreMayor); //mostrar nombre con más carácteres
		
	}

}
