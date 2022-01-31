
public class Automovil extends Vehiculo {

	private boolean esAutomatico;
	private int cantidadAirBag;
	
	public Automovil() {
		super(); //invoca al constructor sin parámetros de Vehiculo
		this.esAutomatico = false;
		this.cantidadAirBag = 0;
	}
	
	public Automovil(String patente, String combustible, int capacidadPasajeros, 
			int velocidadRecorrido, int paradas,boolean esAutomatico, int cantidadAirBag) {
		super(patente, combustible, capacidadPasajeros, velocidadRecorrido, paradas);
		this.esAutomatico = esAutomatico;
		this.cantidadAirBag = cantidadAirBag;
		
	}

	public boolean isEsAutomatico() {
		return esAutomatico;
	}

	public void setEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}

	public int getCantidadAirBag() {
		return cantidadAirBag;
	}

	public void setCantidadAirBag(int cantidadAirBag) {
		this.cantidadAirBag = cantidadAirBag;
	}
	
	public String encender(boolean tieneBoton)
	{
		if(tieneBoton)
		return "El automovil enciende al presionar embriague";
		else
			return "El automovil enciende al girar la llave";
	}

	@Override 
	public String mostrarDatos() {
		return "****Automovil****"
				+ "\n¿Es Automatico?       = " + (this.isEsAutomatico()?"Si":"NO") + 
				"\nCantidad AirBags        = " + this.cantidadAirBag + 
				"\nPatente                 = " + super.getPatente() + 
				"\nTipo Combustible        = " + super.getCombustible() + 
				"\nCapacidad de Pasajeros  = " + super.getCapacidadPasajeros() + 
				"\nVelocidad Recorrido     = " + super.getVelocidadRecorrido() + 
				"\nN° de Paradas           = " + super.getParadas();
	}
	
	
	
}
