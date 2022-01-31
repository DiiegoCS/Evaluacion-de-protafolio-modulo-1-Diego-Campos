Proceso sin_titulo
	
	
	Definir opcion Como Entero;;
	opcion <- 0;
	Mientras opcion <>3 	Hacer
		Escribir "***** Menú *****";
		Escribir " 1. Saludar";
		Escribir " 2. Despedir";
		Escribir " 3. Salir de la aplicación";
		Leer opcion;
		
		Si opcion = 1 Entonces
			Escribir "=====> Hola Humano";
			Escribir "Presione cualquier tecla para continuar";
			Esperar Tecla;
		FinSi
		
		Si opcion = 2 Entonces
			Escribir "====> Adios Humano";
			Escribir "Presione cualquier tecla para continuar";
			Esperar Tecla;
		FinSi
	FinMientras
	Escribir "Cierre de ciclo Mientras.";
FinProceso