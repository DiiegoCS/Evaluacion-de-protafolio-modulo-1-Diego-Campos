Proceso sin_titulo
	// Actividad 3: Promediar 3 notas y mostrar si aprobó o no el curso.
	//además la ponderación es de 30%, 30% y 40%
	
	//Definir variables
	Definir nota1 Como Real;
	Definir nota2 Como Real;
	Definir nota3 Como Real;
	Definir promedio Como Real;
	
	Escribir "********************************";
	Escribir "Calculando el promedio de 3 notas";
	Escribir "********************************";
	Escribir "A continuación deberá escribir 3 notas entre 1 y 7.";
		
	// solicitar notas y validarlas
	Escribir "Ingrese la primera nota ";
	Leer nota1;
	
	Si nota1<= 7 y nota1>= 1 Entonces
		Escribir "Ingrese la segunda nota ";
		Leer nota2;
		
		Si nota2<= 7 y nota2>= 1 Entonces
			Escribir "Ingrese la tercera nota ";
			Leer nota3;
			
			Si nota3<= 7 y nota3>= 1 Entonces
				
				//promediar con ponderación 30%, 30% y 40%
				promedio<- (nota1*0.3)+(nota2*0.3)+(nota3*0.4);
				Escribir "Su promedio de notas es ",promedio;
				
				//calificar aprobado / no aprobado
				si promedio >= 4 Entonces
					Escribir "El/la estudiante ha aprobado.";
				SiNo 
					Escribir "El/la estudiante ha reprobado.";
				FinSi
			sino
				Escribir "Su tercera nota no es válida. Intente nuevamente.";
			Finsi
		sino
			Escribir "Su segunda nota no es válida. Intente nuevamente. ";
		Finsi
	sino
		Escribir "Su primera nota no es válida. Intente nuevamente. ";
	FinSi
FinProceso
