import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcion = 0;
		int opcion2= 0;
		int menuSalud = 0;
		int menuIsapre = 0;
		int rut = 0;
		
		ArrayList <Paciente> pacientes = new ArrayList<Paciente>();
		Scanner leerTeclado = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("-- Atención Médica --");
		System.out.println("----------------------");
		
		while(opcion != 5)
		{
			System.out.println("******  M e n ú  *******");
			System.out.println("1-. Ingresar datos de paciente");
			System.out.println("2.- Modificar datos de personales de paciente");
			System.out.println("3.- Ingresar datos de consulta médica");
			System.out.println("4.- Mostrar ficha médica de paciente");
			System.out.println("5.- Salir");

			System.out.println("Ingrese una opción: ");
			opcion = leerTeclado.nextInt();

			if(opcion < 1 || opcion > 5)
			{
				// opciones incorrectas
				System.out.println("Opcion no válida. Vuelva a intentar.");
				System.out.println("presione c y enter para continuar");
				leerTeclado.next();
				continue;
			}
			if(opcion == 5)
			{
				break;
			}
			if(opcion == 1)
			{

				System.out.println("Ingrese el rut del paciente: ");
				rut = leerTeclado.nextInt();

				boolean existe = false;
				for(Paciente aux : pacientes) // for each
				{
					if(aux.getRut() == rut ) 
					{
						existe = true;
						System.out.println("Paciente ingresado anteriormente : ");
						System.out.println(aux.mostrarDatos());
						break;
					}
				}
				if(!existe)
				{
					Paciente paciente = new Paciente();
					pacientes.add(paciente);

					System.out.println("** Paciente nuevo ** ");
					System.out.println("Ingrese el rut del paciente: ");
					paciente.setRut(leerTeclado.nextInt());
					System.out.println("Ingrese digito Verificador: ");
					paciente.setDigito(leerTeclado.next().charAt(0));
					System.out.println("Nombre: ");
					paciente.setNombre(leerTeclado.next());
					System.out.println("Apellido: ");
					paciente.setApellido(leerTeclado.next());

					System.out.println("-- Selección --");
					System.out.println("--Sistema de salud --");
					System.out.println("1. Isapre1");
					System.out.println("2. Isapre2");
					System.out.println("3. MasIsapre");
					System.out.println("4. SuperIsapre");
					System.out.println("5. Fonasa");
					System.out.println("Indique Sistema de Salud:");
					menuSalud = leerTeclado.nextInt();

					if(menuSalud == 1)
					{
						paciente.setSeguroSalud("Isapre1");
					}
					else if(menuSalud  == 2)
					{
						paciente.setSeguroSalud("Isapre2");
					}
					else if(menuSalud  == 3)
					{
						paciente.setSeguroSalud("MasIsapre");
					}
					else if(menuSalud  == 4)
					{
						paciente.setSeguroSalud("SuperIsapre");
					}
					else if(menuSalud  == 5)
					{
						paciente.setSeguroSalud("Fonasa");
					}
					
					System.out.println("Datos ingresados correctamente.");
					System.out.println("Presione c y enter para continuar");
					leerTeclado.next();

				}
				continue;

			}

			if(opcion == 2)
			{
				
				System.out.println("Ingrese el rut del paciente: ");
				rut = leerTeclado.nextInt();

				boolean existe = false;
				for(Paciente aux : pacientes) // for each
				{
					if(aux.getRut() == rut ) 
					{
						existe = true;
						System.out.println(aux.mostrarDatos());
						
						System.out.println("Modificando datos ");
						System.out.println("Ingrese el rut del paciente: ");
						aux.setRut(leerTeclado.nextInt());
						System.out.println("Ingrese digito Verificador: ");
						aux.setDigito(leerTeclado.next().charAt(0));
						System.out.println("Nombre: ");
						aux.setNombre(leerTeclado.next());
						System.out.println("Apellido: ");
						aux.setApellido(leerTeclado.next());

						System.out.println("-- Selección --");
						System.out.println("--Sistema de salud --");
						System.out.println("1. Isapre1");
						System.out.println("2. Isapre2");
						System.out.println("3. MasIsapre");
						System.out.println("4. SuperIsapre");
						System.out.println("5. Fonasa");
						System.out.println("Indique Sistema de Salud:");
						menuSalud = leerTeclado.nextInt();

						if(menuSalud == 1)
						{
							aux.setSeguroSalud("Isapre1");
						}
						else if(menuSalud  == 2)
						{
							aux.setSeguroSalud("Isapre2");
						}
						else if(menuSalud  == 3)
						{
							aux.setSeguroSalud("MasIsapre");
						}
						else if(menuSalud  == 4)
						{
							aux.setSeguroSalud("SuperIsapre");
						}
						else if(menuSalud  == 5)
						{
							aux.setSeguroSalud("Fonasa");
						}
						Paciente paciente = aux;
						break;
					}
					
				}
				
				System.out.println("Datos ingresados correctamente.");
				System.out.println("Presione c y enter para continuar");
				leerTeclado.next();
				continue;

			}

			if(opcion == 3 )
			{
				System.out.println("Ingrese el rut del paciente: ");
				rut = leerTeclado.nextInt();

				boolean existe = false;
				for(Paciente aux : pacientes) // for each
				{
					if(aux.getRut() == rut ) 
					{
						existe = true;

						System.out.println("Ingrese síntomas: ");
						aux.setSintomas(leerTeclado.next());
						System.out.println("Ingrese diagnóstico: ");
						aux.setDiagnostico(leerTeclado.next());
						System.out.println("Remedios recetados: ");
						aux.setRemedios(leerTeclado.next());
						System.out.println("Exámenes solicitados: ");
						aux.setExamenes(leerTeclado.next());
						System.out.println("Datos ingresados correctamente.");
						System.out.println("Presione c y enter para continuar");
						leerTeclado.next();
						Paciente paciente = aux;
						break;
					}
				}
			}
				
				if(opcion == 4)
				{
					System.out.println("Ingrese el rut del paciente: ");
					rut = leerTeclado.nextInt();


					for(Paciente aux : pacientes) // for each
					{
						if(aux.getRut() == rut ) 
						{
							System.out.println(aux.fichaConsulta());
							break;
						}
					}


				}

			}	
		System.out.print("Aplicación Finalizada ¡Hasta pronto!");

		}
		
	}

	








