Proceso Actividad2
	//Actividad 2 :
	//Solicitar 2 n�mero y operaci�n aritm�ticaque quiere 
	//realizar el usuario (+ - * /). Calculadora 
	Escribir "***** Calculadora *****";
	
	//definir variable
	definir numero1 como real;
	definir numero2 como real;
	definir operacion como caracter;
		
	//solicitar datos
	Escribir "Ingrese primer n�mero";
	leer numero1;
	Escribir "Ingrese segundo n�mero";
	leer numero2;
	
	//procesar y dar resultados
	Escribir "Ingrese s�mbolo de la operaci�n que desea realizar (+ , - , * , / ).";
	leer operacion;
	
	si operacion = "+" Entonces
		Escribir "El resultado es ", numero1 + numero2, ".";
	FinSi
	si operacion = "-" Entonces
		Escribir "El resultado es ", numero1 - numero2, ".";
	FinSi
	si operacion = "*" Entonces
		Escribir "El resultado es ", numero1 * numero2, ".";
	FinSi
	si operacion = "/" Entonces
		si numero2 == 0 Entonces
			Escribir "No se puede realizar la divisi�n por 0.";
		SiNo 
		Escribir "El resultado es ", numero1 / numero2, ".";
		finsi 
	FinSi
	
FinProceso
