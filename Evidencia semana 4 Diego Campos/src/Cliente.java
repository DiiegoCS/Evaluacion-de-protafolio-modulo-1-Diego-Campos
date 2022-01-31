
public class Cliente {

	// Atributos
	
	private String nombre;
	private String apellido;
	private int rut;
	private char digito;
	private int credito;
	private int cuotas;
	private int edad;
	private boolean nacionalidad;
	private int sueldo;
	private int antiguedadLaboral;
	private boolean morosidad;
		
	// constructor
	
	public Cliente()
	{
		this.nombre = " ";
		this.rut = 0;
		this.digito = ' ';
		this.credito = 0;
		this.cuotas = 0;
		this.edad = 0;
		this.nacionalidad = false;
		this.sueldo = 0;
		this.antiguedadLaboral = 0;
		this.morosidad = false;
	}

	public Cliente(String nombre, String apellido, int rut, char digito, int credito, int cuotas, int edad, boolean nacionalidad,
			int sueldo, int antiguedadLaboral, boolean morosidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.digito = digito;
		this.credito = credito;
		this.cuotas = cuotas;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
		this.antiguedadLaboral = antiguedadLaboral;
		this.morosidad = morosidad;
	}
	//getters & setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public char getDigito() {
		return digito;
	}

	public void setDigito(char digito) {
		this.digito = digito;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(boolean nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getAntiguedadLaboral() {
		return antiguedadLaboral;
	}

	public void setAntiguedadLaboral(int antiguedadLaboral) {
		this.antiguedadLaboral = antiguedadLaboral;
	}

	public boolean isMorosidad() {
		return morosidad;
	}

	public void setMorosidad(boolean morosidad) {
		this.morosidad = morosidad;
	}
	
	
	//customer
	
	public String evaluarCredito()
	{
		if(credito >= 500000 &&  credito <= sueldo * 10)
		{
			if(cuotas >= 3 && cuotas <= 84)
			{
				if(edad >= 24 && edad <= 79)
				{
					if(nacionalidad)
					{
						if(sueldo >= 250000)
						{
							if(antiguedadLaboral >= 3)
							{
								if(morosidad == false)
								{
									return "--------------------------------\n" + nombre.toUpperCase() +  " " + apellido.toUpperCase() 
									+ " " + rut + "-" + digito + "\n -------------------------------- \n Cumple con los requisitos \n Sueldo : " 
									+ sueldo + "\n Monto máximo : " + sueldo * 10 + "\n Monto Solicitado : " + credito 
									+ "\n Tasa Mensual : 1,46% \n N° de Cuotas : " + cuotas + "\n Monto a pagar: " + (int)(credito * 1.46) + "\n";
								}
							}
						}
					}
				}
			}
		}
		
		return "-------------------------- \n" + nombre.toUpperCase() + " " + apellido.toUpperCase() + "       " 
					+ rut + "-" + digito + "\n--------------------------\n" + "No cumple con los requisitos \n";
	
				
	}
	
	
}
