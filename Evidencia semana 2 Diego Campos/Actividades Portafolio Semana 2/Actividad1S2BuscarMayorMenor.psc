Proceso Actividad1S2BuscarMayorMenor
	// Actividad: solicitar 2 n�mero y se�alar cu�l es el mayor
	
	Escribir "***** Buscando el n�mero mayor *****";	
	
	definir numero1 Como Real;
	definir numero2 como real;
	
	Escribir "Ingresa el primer n�mero.";
	leer numero1;
	
	Escribir "Ingresa el segundo n�mero.";
	leer numero2;
	
	Si numero1 < numero2 Entonces
		escribir "El n�mero ",numero2," es el mayor.";
	sino 
		si numero1 = numero2 Entonces
			escribir "Los n�meros ingresados son iguales.";
		sino
			escribir "El n�mero ",numero1," es el mayor.";
		FinSi
	FinSi
	
FinProceso
