Proceso sin_titulo
	//Actividad Portafolio:
	// Crear una calculadora con las operaciones básicas(+-*/)
	//que mediante un menú se pueda seleccionar
	//debe haber una opción de salida
	
	//definir variables
	definir numero1 Como Real; 
	definir numero2 Como Real;
	definir resultado Como Real;
	definir operacion Como Entero;
	operacion <- 0;
	// Inicio Ciclo 
	Mientras operacion <> 5 Hacer
		Limpiar Pantalla;
		//Menu: +,-,*,/ salir (5)
		escribir "////////// Menú \\\\\\\\\\\";
		escribir "      1.- Sumar (+)";
		escribir "      2.- Restar (-)";
		Escribir "      3.- Multiplicar(*)";
		Escribir "      4.- Dividir (/)";
		Escribir " 5.- Salir de la aplicación ";
		Escribir "/////////////\\\\\\\\\\\\\\\";
		
		Escribir "Elija una operación."; //solicitar opción
		leer operacion;
		Escribir "/////////////\\\\\\\\\\\\\\\\"; 
		
		//validar que solo ingrese las opciones del menú
		si operacion <> 5 Entonces
			
			si operacion > 0 y operacion < 6 Entonces
													
				//solicitar 2 números.
				Escribir "Ingrese el 1er número";
				leer numero1;
				Escribir "Ingrese el 2do número";
				leer numero2;
				
				// Procesar datos
				si operacion = 1 Entonces
					resultado<- numero1+numero2;
					Escribir "El resultado es ", resultado, ".";
					Escribir "Presione cualquier tecla para volver a empezar.";
					Esperar Tecla;
				FinSi
				si operacion = 2 Entonces
					resultado<- numero1-numero2;
					Escribir "El resultado es ", resultado, ".";
					Escribir "Presione cualquier tecla para volver a empezar.";
					Esperar Tecla;
				FinSi
				si operacion = 3 Entonces
					resultado<- numero1*numero2;
					Escribir "El resultado es ", resultado, ".";
					Escribir "Presione cualquier tecla para volver a empezar.";
					Esperar Tecla;
				FinSi
				si operacion = 4  Entonces
					si numero2 = 0 Entonces
						Escribir "No se puede realizar la división por 0.";
						Escribir "Presione cualquier tecla para continuar y vuelva a intentar";
						Esperar Tecla;
					SiNo 
						resultado<- numero1/numero2;
						Escribir "El resultado es ", resultado, ".";
						Escribir "Presione cualquier tecla para volver a empezar.";
						Esperar Tecla;
					Finsi 
				FinSi
			Sino 
				Escribir "UPS! Opción no válida.";
				Escribir "Presione cualquier tecla para continuar y vuelva a intentar.";
				Esperar Tecla;
			FinSi
		FinSi
	FinMientras
	Escribir "Saliste de la calculadora ¡Hasta pronto!";
FinProceso
