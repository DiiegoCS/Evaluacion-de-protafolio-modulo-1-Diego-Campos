Proceso sin_titulo
	//Actividad Portafolio:
	// Crear una calculadora con las operaciones b�sicas(+-*/)
	//que mediante un men� se pueda seleccionar
	//debe haber una opci�n de salida
	
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
		escribir "////////// Men� \\\\\\\\\\\";
		escribir "      1.- Sumar (+)";
		escribir "      2.- Restar (-)";
		Escribir "      3.- Multiplicar(*)";
		Escribir "      4.- Dividir (/)";
		Escribir " 5.- Salir de la aplicaci�n ";
		Escribir "/////////////\\\\\\\\\\\\\\\";
		
		Escribir "Elija una operaci�n."; //solicitar opci�n
		leer operacion;
		Escribir "/////////////\\\\\\\\\\\\\\\\"; 
		
		//validar que solo ingrese las opciones del men�
		si operacion <> 5 Entonces
			
			si operacion > 0 y operacion < 6 Entonces
													
				//solicitar 2 n�meros.
				Escribir "Ingrese el 1er n�mero";
				leer numero1;
				Escribir "Ingrese el 2do n�mero";
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
						Escribir "No se puede realizar la divisi�n por 0.";
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
				Escribir "UPS! Opci�n no v�lida.";
				Escribir "Presione cualquier tecla para continuar y vuelva a intentar.";
				Esperar Tecla;
			FinSi
		FinSi
	FinMientras
	Escribir "Saliste de la calculadora �Hasta pronto!";
FinProceso
