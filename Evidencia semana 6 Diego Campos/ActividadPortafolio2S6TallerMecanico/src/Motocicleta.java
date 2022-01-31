
public class Motocicleta extends Vehiculo{

	//2 atributos
	
	private String estilo;
	private int medidaManillar;
	private int totalPorPagar =0;
	
	
	public Motocicleta() {
		super();
		this.estilo = " ";
		this.medidaManillar = 0;
	}
	
	public Motocicleta(String patente, String marca, String color, int costoServicio, String estilo, int medidaManillar) {
		super(patente, marca, color, costoServicio);
		this.estilo = estilo;
		this.medidaManillar = medidaManillar;
	}

	
	
	
	@Override
	public String mostrarDatos() {
		return "** Motocicleta **"
				+ "\nPatente              = " + super.getPatente() 
				+ "\nMarca                = " + super.getMarca() 
				+ "\nColor                = " + super.getColor() 
				+ "\nCosto de Servicio    = " + super.getCostoServicio()
				+ "\nEstilo               = " + this.estilo 
				+ "\nMedida Manillar      = " + this.medidaManillar;
	}

	@Override
	public int totalPorPagar()
	{
		return totalPorPagar;
	}
	
	@Override
	public int totalConIva() {
		
		totalPorPagar = (int) (((super.getCostoServicio() * IVA)) + super.getCostoServicio()) ;
		return totalPorPagar;
	}
	
	@Override
	public int obtenerDescuento() {
		
		totalPorPagar =  (int)((this.totalConIva() * DESCUENTO_MOTOCICLETA));
		return totalPorPagar;
	}
	public int obtenerDescuento(int descuento) {

		totalPorPagar = (int)((this.totalConIva() * descuento));
		return totalPorPagar;
	}
	
	//aplicar sobreescritura
	
	//aplicarsobrecarga
	
	//calcular descuent (obtenerDescuento), según valores por parámetro
	
	
	
	
}
