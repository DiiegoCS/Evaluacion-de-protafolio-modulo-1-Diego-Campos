import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Cliente cliente1 = new Cliente();
		Scanner leerTeclado = new Scanner(System.in);
		
		
		System.out.println("----------------------");
		System.out.println("Evaluación de Crédito");
		System.out.println("----------------------");
		
		System.out.println("Ingrese los datos del cliente para la evaluación: ");
					
		System.out.println("Nombre: ");
		cliente1.setNombre(leerTeclado.next());
		System.out.println("Apellido: ");
		cliente1.setApellido(leerTeclado.next());
		System.out.println("N° de Rut: ");
		cliente1.setRut(leerTeclado.nextInt());
		System.out.println("Digito Verificador: ");
		cliente1.setDigito(leerTeclado.next().charAt(0));
		System.out.println("Crédito solicitado: ");
		cliente1.setCredito(leerTeclado.nextInt());
		System.out.println("N° de cuotas: ");
		cliente1.setCuotas(leerTeclado.nextInt());
		System.out.println("Edad: ");
		cliente1.setEdad(leerTeclado.nextInt());
		System.out.println("¿Tiene la nacionalidad chilena?: ");
		cliente1.setNacionalidad(leerTeclado.nextBoolean());
		System.out.println("Sueldo: ");
		cliente1.setSueldo(leerTeclado.nextInt());
		System.out.println("Años de antigüedad laboral: ");
		cliente1.setAntiguedadLaboral(leerTeclado.nextInt());
		System.out.println("¿Tiene antecedentes de morosidad?: ");
		cliente1.setMorosidad(leerTeclado.nextBoolean());
					
		System.out.print(cliente1.evaluarCredito());
			        		
	        
		
	}

}
