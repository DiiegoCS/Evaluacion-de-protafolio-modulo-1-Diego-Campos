
public class Motocicleta extends Vehiculo {

	private String estilo;
	private int largoDelManillar;
	
	public Motocicleta() {
		super();
		this.estilo = " ";
		this.largoDelManillar = 0;
	}
	
	public Motocicleta(String patente, String combustible, int capacidadPasajeros, 
			int velocidadRecorrido, int paradas, String estilo, int largoDelManillar) {
		super(patente, combustible, capacidadPasajeros, velocidadRecorrido, paradas);
		this.estilo = estilo;
		this.largoDelManillar = largoDelManillar;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getLargoDelManillar() {
		return largoDelManillar;
	}

	public void setLargoDelManillar(int largoDelManillar) {
		this.largoDelManillar = largoDelManillar;
	}
	
	public String accionarManetaIzq()
	{
	return "Maneta accionada";
	}

	@Override
	public String mostrarDatos() {
		return "**** Motocicleta ****"
				+ "\nEstilo de Motocicleta = " + this.estilo + 
				"\nLargo del Manillar      = " + this.largoDelManillar +
				"\nPatente                 = " + super.getPatente() + 
				"\nTipo Combustible        = " + super.getCombustible() + 
				"\nCapacidad de Pasajeros  = " + super.getCapacidadPasajeros() + 
				"\nVelocidad Recorrido     = " + super.getVelocidadRecorrido() + 
				"\nN° de Paradas           = " + super.getParadas();
	}
	
	
	
}
