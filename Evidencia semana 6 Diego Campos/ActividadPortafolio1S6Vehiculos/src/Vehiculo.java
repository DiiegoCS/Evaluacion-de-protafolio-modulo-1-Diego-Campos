
public class Vehiculo {

	private String patente;
	private String combustible;
	private int capacidadPasajeros;
	private int velocidadRecorrido;
	private int paradas;
	
	public Vehiculo() {
		
		this.patente = " ";
		this.combustible = " ";
		this.capacidadPasajeros = 0;
		this.velocidadRecorrido = 0;
		this.paradas = 0;
	}
	
	public Vehiculo(String patente, String combustible, int capacidadPasajeros, int velocidadRecorrido, int paradas) {
		
		this.patente = patente;
		this.combustible = combustible;
		this.capacidadPasajeros = capacidadPasajeros;
		this.velocidadRecorrido = velocidadRecorrido;
		this.paradas = paradas;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public int getVelocidadRecorrido() {
		return velocidadRecorrido;
	}

	public void setVelocidadRecorrido(int velocidadRecorrido) {
		this.velocidadRecorrido = velocidadRecorrido;
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}
	
	
	public String mover()
	{
		return " El Vehiculo se mueve...";
	}
	
	public String frenar()
	{
		return " El Vehiculo está frenando ...";
	}
	
	public String cargarCombustible()
	{
		return " El Vehiculo está cargando combustible...";
	}
	
	
	public String mostrarDatos() {
		return "***Vehículo ***" +
				"\nPatente                 : " + patente + 
				"\nTipo de combustible     :" + combustible + 
				"\nCapacidad de pasajeros  :" + capacidadPasajeros + 
				"\nVelocidad del recorrido :" + velocidadRecorrido +
				"\nN° de paradas           : " + paradas;
		}
	
	
	
}
