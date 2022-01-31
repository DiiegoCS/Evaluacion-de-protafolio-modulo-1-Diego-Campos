
public interface IOperaciones {

	//implementar en superclase
	
	public int totalConIva ();
	public int obtenerDescuento();
	
	
	
	double IVA = 0.19;
	double DESCUENTO_AUTOMOVIL = 0.95;
	double DESCUENTO_MOTOCICLETA = 0.9;
	
	/*IVA 19%
	 * DESCUENTO_AUTOMOVIL 5%
	 * DESCUENTO_MOTOCICLETA 10%
	 * 
	 * METODOS: totalConIva - calculo total a pagar
	 * obtenerDescuento - calcular descuento según tipo.
	 */
	
}
