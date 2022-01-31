Proceso sin_titulo
	
	// ejercicio: solicitar un numero al usuario
	// y mostrar la multiplicación del 1 al 10
	
	definir numero1 como entero;
	definir indice como entero;
	
	Escribir "*********************";
	Escribir "Tabla de multiplicación";
	Escribir "*********************";
	
	Escribir "Ingresa un número a elección.";
	Leer numero1;
	
	Para indice<-1 Hasta 10 Hacer
		Escribir numero1, " * ", indice," = ", numero1 * indice;
	FinPara
	Escribir "Tabla del número ", numero1;
FinProceso
