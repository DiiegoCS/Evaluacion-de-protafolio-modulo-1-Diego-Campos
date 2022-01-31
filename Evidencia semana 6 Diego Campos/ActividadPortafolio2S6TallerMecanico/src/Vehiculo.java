
public abstract class Vehiculo implements IOperaciones {

	//4 atributos
	
	private String patente;
	private String marca;
	private String color;
	private int costoServicio;
	int totalPorPagar;
	
	//contructores
	
	public Vehiculo() {
		
		this.patente = " ";
		this.marca = " ";
		this.color = " ";
		this.costoServicio = 0;
	}
	
	public Vehiculo(String patente, String marca, String color, int costoServicio) {
		
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.costoServicio = costoServicio;
	}
	//g&s
	
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(int costoServicio) {
		this.costoServicio = costoServicio;
	}

	//metodos
	
	

	public abstract int totalPorPagar();
	 
		 
	
	public String mostrarDatos() {
		return "Vehiculo"
				+"\nTipo de Vechilo    = "
				+ "\nPatente           = " + this.patente 
				+ "\nMarca             = " + this.marca 
				+ "\nColor             = " + this.color 
				+ "\nCosto de Servicio = " + this.costoServicio;
	}

	@Override
	public int totalConIva() {
		
		totalPorPagar = (int) (((this.getCostoServicio() * IVA)) + this.getCostoServicio()) ;
		return totalPorPagar;
	}
	
	@Override
	public int obtenerDescuento() {
		
		totalPorPagar = (int)((this.totalConIva() * DESCUENTO_MOTOCICLETA));
		return totalPorPagar;
	}
	public int obtenerDescuento(int descuento) {

		totalPorPagar = (int)((this.totalConIva() * descuento));
		return totalPorPagar;
	}
}
