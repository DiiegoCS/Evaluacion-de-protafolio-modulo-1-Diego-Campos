Proceso sin_titulo
	//actividad portafolio descuentos de una compra:
	//Crear un algoritmo que permita ingresar el valor de una compra y realizar descuentos de acuerdo 
	// a las siguientes indicaciones:
	// Si el valor es mayor o igual a $50000, se hace un descuento del 30%.
	// Si el valor es menor de $50000 y mayor o igual a $20000, se descuenta el 20%.
	// Si el monto es menor a $20000 y mayor o igual a $10000, el descuento es del 10%.
	//mostrar el subtotal, descuento y el total a pagar
	Definir totalCompra Como Entero;
	Definir totalaPagar Como Entero;
	
	Escribir "-------------------------";
	Escribir "--Cálculo de descuentos--";
	Escribir "-------------------------";
	
	Escribir "Ingrese el monto total de la compra para calcular el descuento";
	Leer totalCompra;
	
	Si totalCompra >= 50000 Entonces
		totalaPagar<- totalCompra * 0.7;
		Escribir "El detalle de su compra es el siguiente:";
		Escribir "----------------------------------------";
		Escribir "Subtotal: $", totalCompra;
		Escribir "Descuento realizado: $", totalCompra*0.3;
		Escribir "Total a pagar: $", totalaPagar;
	FinSi
	Si totalCompra < 50000 y totalCompra >= 20000 Entonces
		totalaPagar<- totalCompra * 0.8;
		Escribir "El detalle de su compra es el siguiente:";
		Escribir "----------------------------------------";
		Escribir "Subtotal: $", totalCompra;
		Escribir "Descuento realizado: $", totalCompra*0.2;
		Escribir "Total a pagar: $", totalaPagar;
	FinSi
	Si totalCompra < 20000 y totalCompra >= 10000 Entonces
		totalaPagar<- totalCompra * 0.9;
		Escribir "El detalle de su compra es el siguiente:";
		Escribir "----------------------------------------";
		Escribir "Subtotal: $", totalCompra;
		Escribir "Descuento realizado: $", totalCompra*0.1;
		Escribir "Total a pagar: $", totalaPagar;
	FinSi
	Si totalCompra < 10000 y totalCompra > 0 Entonces
		Escribir "Su compra no cumple con las condiciones para descuentos.";
	FinSi
	Si totalCompra <= 0 Entonces
		Escribir "El valor ingresado no es válido.";
	FinSi
	Escribir "Gracias por su compra. Hasta pronto.";
FinProceso
