Proceso sin_titulo
	//Determinar qué tipo de triángulo según las medidas de los lados.
	//isóceles, escaleno o equilátero
	Escribir "*********************";
	Escribir "Tipos de triángulos";
	Escribir "*********************";
	
	//1. Definir las variables
	Definir lado1 Como Entero;
	Definir lado2 como entero;
	Definir lado3 como entero;
		
	//2. Pedir medidas de 3 lados
	Escribir "Ingresa la medida de los 3 lados para saber qué tipo de triángulo es.";
	Escribir "Ingresa la medida del 1er lado";
	leer lado1;
	
	Escribir "Ingresa la medida del 2do lado";
	leer lado2;
	
	Escribir "Ingresa la medida del 3er lado";
	Leer lado3;
	
	//3. Procesar info: Categorizar según tipo de triangulo
	Si lado1 = lado2 Entonces
		si lado2 = lado3 Entonces
			
			//4. Texto salida - mostrar resultado
			Escribir "El triángulo es Equilátero.";
		SiNo
			Escribir "El triángulo es Isóceles.";
		FinSi
	Sino 
		Si lado1 = lado3 o lado2 = lado3 Entonces
			Escribir "El triángulo es Isóceles.";
		SiNo
			Escribir "El triángulo es Escaleno.";
		FinSi
	FinSi
FinProceso
