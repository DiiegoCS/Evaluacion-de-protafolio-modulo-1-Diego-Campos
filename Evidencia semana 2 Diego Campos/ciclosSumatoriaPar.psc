Proceso sin_titulo
	
	//sumatoria pero s�lo considerar los n�meros par 
	
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
		si indice mod 2 = 0 entonces
			resultado<-resultado+indice;
			Escribir resultado;
		FinSi
	FinPara
FinProceso
