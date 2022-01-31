
public class Automovil extends Vehiculo{

	//2 atributos
	
	private int cantidadPuertas;
	private int capacidadMaletero; //lts
	private int totalPorPagar =0;
	
	
	public Automovil() {
		super();
		this.cantidadPuertas = 0;
		this.capacidadMaletero = 0;
	}
	
	public Automovil(String patente, String marca, String color, int costoServicio, int cantidadPuertas, int capacidadMaletero) {
		super(patente, marca, color, costoServicio);
		this.cantidadPuertas = cantidadPuertas;
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public String mostrarDatos() {
		return "** Automóvil **"
				+ "\nPatente            = " + super.getPatente() 
				+ "\nMarca              = " + super.getMarca() 
				+ "\nColor              = " + super.getColor() 
				+ "\nCosto de Servicio  = " + super.getCostoServicio()
				+ "\nEstilo             = " + this.cantidadPuertas
				+ "\nMedida Manillar    =" + this.capacidadMaletero;
	}
	
	@Override
	public int totalPorPagar()
	{
		return totalPorPagar;
	}
	
	@Override
	public int totalConIva() {
		
		totalPorPagar = (int) ((super.getCostoServicio() * IVA)) + super.getCostoServicio() ;
		return totalPorPagar;
	}
	
	@Override
	public int obtenerDescuento() {
		// 
		totalPorPagar= (int)((super.getCostoServicio() * DESCUENTO_MOTOCICLETA));
		return totalPorPagar;
	}
	
	public int obtenerDescuento(int descuento) {

		totalPorPagar = (int)((super.getCostoServicio() * descuento));
		return totalPorPagar;
	}
		//aplicar sobreescritura
		
		//aplicarsobrecarga
		
		//calcular descuent (obtenerDescuento), según valores por parámetro
		
	
}
