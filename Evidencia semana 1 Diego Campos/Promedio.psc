Algoritmo Promedio
	
	//Definir variables
	Definir nota1 como real;
	Definir nota2 como real;
	Definir nota3 como real;
	Definir Resultado_promedio como real;
		
	//Solicitar informacion
	
	Escribir "**Promedio de 3 notas**";
	
	Escribir "Ingresar primera nota a promediar";
	Leer nota1;
	
	si nota1 <=7 Entonces 
		
	Escribir "Ingresar segunda nota a promediar";
	Leer nota2;
	SiNo 
	Escribir "Vuelva a ingresar la primera nota";
	leer nota1;
		Escribir "Ingresar segunda nota a promediar";
		Leer nota2;
		si nota2 <=7 entonces 
			Escribir "Ingresar tercera nota a promediar";
			Leer nota3;
		SiNo
			Escribir "Vuelva a ingresar la segunda nota";
			leer nota2;
			Escribir "Ingresar tercera nota a promediar";
			Leer nota3;
			Si nota3 <=7 Entonces
			//Operacion de las variables
			Resultado_promedio <- (nota1+nota2+nota3)/3;
			//Mostrar resultado
			SiNo
			Escribir "Vuelva a ingresar la tercera nota";
			leer nota3;
				
			FinSi
		FinSi
	FinSi

Resultado_promedio <- (nota1+nota2+nota3)/3;
//Mostrar resultado
Escribir "Su promedio es:", Resultado_promedio;
FinAlgoritmo
