Proceso sin_titulo
	// ejercicio: solicitar un numero y obtener la sumatoria
	
	Definir indice Como Entero;
	Definir numero1 Como Entero;
	Definir resultado como entero;
	resultado<-0;
	
	Escribir "*********************";
	Escribir "******Sumatoria******";
	Escribir "*********************";
	
	Escribir "Ingrese n�mero para la sumatoria.";
	Leer numero1;
	
	Para indice<-1 Hasta numero1 Hacer
		resultado<-resultado+indice;
		Escribir resultado;
	FinPara
FinProceso
