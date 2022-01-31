
public class Paciente {

	//atributos
		private int rut;
		private char digito;
		private String nombre;
		private String apellido;
		private String seguroSalud;
		private String sintomas;
		private String diagnostico;
		private boolean necesitaReceta;
		private String remedios;
		private boolean necesitaExamen;
		private String examenes;
		
		//constructores
		
		public Paciente() {
			this.rut = 0;
			this.digito = ' ';
			this.nombre = " ";
			this.apellido = " ";
			this.seguroSalud = " ";
			this.sintomas = " ";
			this.diagnostico = " ";
			this.remedios = " ";
			this.examenes = " ";
		}
		
		public Paciente(int rut, char digito, String nombre, String apellido, String seguroSalud, String sintomas,
				String diagnostico, String remedios, String examenes) {
			super();
			this.rut = rut;
			this.digito = digito;
			this.nombre = nombre;
			this.apellido = apellido;
			this.seguroSalud = seguroSalud;
			this.sintomas = sintomas;
			this.diagnostico = diagnostico;
			this.remedios = remedios;
			this.examenes = examenes;
		}
		
		//get & set

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

		public String getSeguroSalud() {
			return seguroSalud;
		}

		public void setSeguroSalud(String seguroSalud) {
			this.seguroSalud = seguroSalud;
		}

		public String getSintomas() {
			return sintomas;
		}

		public void setSintomas(String sintomas) {
			this.sintomas = sintomas;
		}

		public String getDiagnostico() {
			return diagnostico;
		}

		public void setDiagnostico(String diagnostico) {
			this.diagnostico = diagnostico;
		}
		
		public String getRemedios() {
			return remedios;
		}

		public void setRemedios(String remedios) {
			this.remedios = remedios;
		}

			
		public String getExamenes() {
			return examenes;
		}

		public void setExamenes(String examenes) {
			this.examenes = examenes;
		}
		
		
		
		//customer
		
		public String mostrarDatos()
		{
			return "********************** \n DATOS PACIENTE \n ********************** "
					+ "\n Nombre del paciente: " + nombre + " " + apellido 
					+ "\n Rut del paciente: " + rut + "-" + digito + 
					"\n Seguro de salud: " + seguroSalud;
		}
		
		public String fichaConsulta()
		{
			String datos = "********************** \n FICHA MÉDICA \n ********************** "
					+ "\n Motivo de consulta: " + sintomas
					+ "\n Diagnóstico : " + diagnostico;
			
			if(this.remedios.trim().length() > 0)
			{
				datos += "\n Remedios :" + this.remedios;
			}
			if(this.examenes.trim().length() > 0)
			{
				datos += "\n Exámenes :" + this.examenes;
			}
			
			return datos;		
			
		}
		

	
}
