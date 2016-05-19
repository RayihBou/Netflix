public class Serie extends Netflix implements IVisualizable {
	
	protected int nt = 1;
	
	public Serie (){
		super();		
	} //Constructor Default
	
	public Serie (String titulo, String creador){
		super(titulo, creador);
		} //Constructor Titulo - Creador
	
	public Serie (String titulo, String creador, String genero, String duracion, int nt){
		super(titulo, creador, genero, duracion);
		this.nt = nt;
	} //Constructor Todos los atributos

	//Getters y Setter
	public int getNt() {
		return nt;
	}

	public void setNt(int nt) {
		this.nt = nt;
	}
	
	@Override
	public void mostrarDatos(String nombreClase) {
		super.mostrarDatos(nombreClase);
		System.out.println("No. De Temporadas: " + nt);	
	}
	@Override
	public void marcarVisto() {
		super.visto = true;		
	}
	
	@Override
	public void esVisto() {
		if (visto==true){
		super.mostrarDatos("Serie");
		System.out.println("Numero Temporadas: " + nt);
		System.out.println("");
		}
	}
	
	@Override
	public void tiempoVisto() {
		String tv = "45m/00s";
		if (visto==true){
			super.mostrarDatos("Serie");
			System.out.println("Numero Temporadas: " + nt);
			System.out.println("Tiempo Visto: " + tv);
			System.out.println("");
		}
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n Genero: " + genero + "\n Creador: " + creador + "\n Duracion: " + duracion
				+ "\n Visto: " + visto + "\n Numero de Temporadas: " +nt;
	}		
	
	
}
