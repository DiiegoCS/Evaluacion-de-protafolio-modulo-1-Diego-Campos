Proceso sin_titulo
	
	// ejercicio: solicitar un numero al usuario
	// y mostrar la multiplicaci�n del 1 al 10
	
	definir numero1 como entero;
	definir indice como entero;
	
	Escribir "*********************";
	Escribir "Tabla de multiplicaci�n";
	Escribir "*********************";
	
	Escribir "Ingresa un n�mero a elecci�n.";
	Leer numero1;
	
	Para indice<-1 Hasta 10 Hacer
		Escribir numero1, " * ", indice," = ", numero1 * indice;
	FinPara
	Escribir "Tabla del n�mero ", numero1;
FinProceso
