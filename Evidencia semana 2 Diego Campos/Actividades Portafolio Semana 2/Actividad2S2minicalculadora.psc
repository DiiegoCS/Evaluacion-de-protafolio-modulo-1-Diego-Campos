Proceso Actividad2
	//Actividad 2 :
	//Solicitar 2 número y operación aritméticaque quiere 
	//realizar el usuario (+ - * /). Calculadora 
	Escribir "***** Calculadora *****";
	
	//definir variable
	definir numero1 como real;
	definir numero2 como real;
	definir operacion como caracter;
		
	//solicitar datos
	Escribir "Ingrese primer número";
	leer numero1;
	Escribir "Ingrese segundo número";
	leer numero2;
	
	//procesar y dar resultados
	Escribir "Ingrese símbolo de la operación que desea realizar (+ , - , * , / ).";
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
			Escribir "No se puede realizar la división por 0.";
		SiNo 
		Escribir "El resultado es ", numero1 / numero2, ".";
		finsi 
	FinSi
	
FinProceso
