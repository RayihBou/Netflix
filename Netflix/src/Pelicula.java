public class Pelicula extends Netflix implements IVisualizable{

	private int año;

	public Pelicula(){
		super();
	} //Constructor Default
	
	public Pelicula(String titulo, String creador){
		super(titulo, creador);
	} //Constructor Titulo - Creador
	
	public Pelicula(String titulo, String genero, String creador, int año, String duracion){
		super(titulo, genero, creador, duracion);
		this.año = año;		
	} //Constructor con todos los atributos

	//Getters y Setter
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	@Override
	public void mostrarDatos(String nombreClase) {
		super.mostrarDatos(nombreClase);
		System.out.println("Año: " + año);		
	}

	@Override
	public void marcarVisto() {
		super.visto = true;
	}

	@Override
	public void esVisto() {
		if (visto==true){
		System.out.println("");
		super.mostrarDatos("Pelicula");
		System.out.println("Año: "+año);
		
	}
	}
	
	@Override
	public void tiempoVisto() {
		if (visto==true){	
		String tv = "50m/05s";
		super.mostrarDatos("Pelicula");
		System.out.println("Año: "+año);
		System.out.println("Tiempo Visto: " + tv);
		System.out.println("");
		
		}
		
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n Genero: " + genero + "\n Creador: " + creador + "\n Año: " + año +"\n Duracion: " + duracion
				+ "\n Visto: " + visto + "";
	}
	
}
