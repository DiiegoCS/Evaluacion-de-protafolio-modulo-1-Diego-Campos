
public class Tren extends Vehiculo {
	
	private int cantidadVagones;
	private String tipo; // carga, pasajeros, etc
	
	public Tren() {
		super();
		this.cantidadVagones = 0;
		this.tipo = " ";
	}
	
	public Tren(String patente, String combustible, int capacidadPasajeros, 
			int velocidadRecorrido, int paradas, int cantidadVagones, String tipo) {
		super(patente, combustible, capacidadPasajeros, velocidadRecorrido, paradas);
		this.cantidadVagones = cantidadVagones;
		this.tipo = tipo;
	}

	public int getCantidadVagones() {
		return cantidadVagones;
	}

	public void setCantidadVagones(int cantidadVagones) {
		this.cantidadVagones = cantidadVagones;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String cambiarCarril()
	{
		return "El tren ha cambiado de carril";
	}

	@Override
	public String mostrarDatos() {
		return "**** Tren ****"
				+ "\nCantidad de vagones   = " + this.cantidadVagones + 
				"\nTipo de tren            = " + this.tipo +
				"\nPatente                 = " + super.getPatente() + 
				"\nTipo Combustible        = " + super.getCombustible() + 
				"\nCapacidad de Pasajeros  = " + super.getCapacidadPasajeros() + 
				"\nVelocidad Recorrido     = " + super.getVelocidadRecorrido() + 
				"\nN° de Paradas           = " + super.getParadas();
	}

	
	
}
