Proceso sin_titulo
	//Determinar qu� tipo de tri�ngulo seg�n las medidas de los lados.
	//is�celes, escaleno o equil�tero
	Escribir "*********************";
	Escribir "Tipos de tri�ngulos";
	Escribir "*********************";
	
	//1. Definir las variables
	Definir lado1 Como Entero;
	Definir lado2 como entero;
	Definir lado3 como entero;
		
	//2. Pedir medidas de 3 lados
	Escribir "Ingresa la medida de los 3 lados para saber qu� tipo de tri�ngulo es.";
	Escribir "Ingresa la medida del 1er lado";
	leer lado1;
	
	Escribir "Ingresa la medida del 2do lado";
	leer lado2;
	
	Escribir "Ingresa la medida del 3er lado";
	Leer lado3;
	
	//3. Procesar info: Categorizar seg�n tipo de triangulo
	Si lado1 = lado2 Entonces
		si lado2 = lado3 Entonces
			
			//4. Texto salida - mostrar resultado
			Escribir "El tri�ngulo es Equil�tero.";
		SiNo
			Escribir "El tri�ngulo es Is�celes.";
		FinSi
	Sino 
		Si lado1 = lado3 o lado2 = lado3 Entonces
			Escribir "El tri�ngulo es Is�celes.";
		SiNo
			Escribir "El tri�ngulo es Escaleno.";
		FinSi
	FinSi
FinProceso
