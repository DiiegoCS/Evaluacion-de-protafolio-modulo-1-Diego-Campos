import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
                // Ejemplo de mientras pero en java => while
                //String opcion = "";
                int opcion = 0;
                int numero1= 0;
                int numero2= 0;
                Scanner leerTeclado = new Scanner(System.in);
                
                while(opcion != 6)
                {
                        System.out.println("******  M e n ú  *******");
                        System.out.println("1-. Sumar.");
                        System.out.println("2.- Restar");
                        System.out.println("3.- Multiplicar");
                        System.out.println("4.- Dividir");
                        System.out.println("5.- Mostrar la tabla del número ingresado hasta el número que pida el usuario");
                        System.out.println("6.- Salir");
                        System.out.print("Ingrese la opción: ");                        
                        opcion = leerTeclado.nextInt();
                        
                        if(opcion < 1 || opcion > 6)
                        {
                                // opciones incorrectas
                                System.out.println("Opcion no válida. Vuelva a intentar.");
                                System.out.println("presione c y enter para continuar");
                                leerTeclado.next();                
                        }
                        else if(opcion <5 && opcion >0 ) {
                        		// opciones correctas (el usuario presionó opción válida)
                                System.out.print("Ingrese 1er nro: ");
                                numero1 = leerTeclado.nextInt();
                                System.out.print("Ingrese 2do nro: ");
                                numero2 = leerTeclado.nextInt();
                                
	                                if(opcion == 1)
	                                {
	                                        System.out.println("El resultado es: " + (numero1 + numero2));
	                                }
	                                
	                                if(opcion == 2)
	                                {
	                                	System.out.println("El resultado es: " + (numero1 - numero2));
	                                }
	                                
	                                if(opcion == 3)
	                                {
	                                	System.out.println("El resultado es: " + (numero1 * numero2));
	                                } 
	                                
	                                if(opcion == 4)
	                                {
	                                	if(numero2 == 0)
	                                	{
	                                		System.out.println("No se puede dividir por 0");
	                                	}
	                                	else {
	                                			System.out.println("El resultado es: " + (numero1 / numero2));
	                                	}
	                                }
	                                System.out.println("presione c y enter para continuar");
	                                leerTeclado.next();
                                }
                        else if(opcion == 5)
	                                     {
		                                	System.out.print("Ingrese 1er nro para ver su tabla: ");
		                                    numero1 = leerTeclado.nextInt();
		                                    System.out.print("Ingrese 2do nro para indicar el último nro de la talba: ");
		                                    numero2 = leerTeclado.nextInt();
		                                    
		                                	for(int i = 0 ; i <= numero2; i++)
	                                     	{
	                                     		System.out.println(numero1 + " * " + i + " = " + numero1 * i);
	                                      	}
		                                	System.out.println("Tabla del " + numero1);	
		                                	System.out.println("presione c y enter para continuar");
		                                    leerTeclado.next();
	                                     }
                        
                        }
                                 
                System.out.println("*** Creado por Android Trainee Teams ***");                
        }

}