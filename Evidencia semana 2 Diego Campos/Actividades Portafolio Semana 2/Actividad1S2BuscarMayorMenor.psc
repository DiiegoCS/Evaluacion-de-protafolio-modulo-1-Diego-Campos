Proceso Actividad1S2BuscarMayorMenor
	// Actividad: solicitar 2 número y señalar cuál es el mayor
	
	Escribir "***** Buscando el número mayor *****";	
	
	definir numero1 Como Real;
	definir numero2 como real;
	
	Escribir "Ingresa el primer número.";
	leer numero1;
	
	Escribir "Ingresa el segundo número.";
	leer numero2;
	
	Si numero1 < numero2 Entonces
		escribir "El número ",numero2," es el mayor.";
	sino 
		si numero1 = numero2 Entonces
			escribir "Los números ingresados son iguales.";
		sino
			escribir "El número ",numero1," es el mayor.";
		FinSi
	FinSi
	
FinProceso
