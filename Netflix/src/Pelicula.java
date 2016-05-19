public class Pelicula extends Netflix implements IVisualizable{

	private int a�o;

	public Pelicula(){
		super();
	} //Constructor Default
	
	public Pelicula(String titulo, String creador){
		super(titulo, creador);
	} //Constructor Titulo - Creador
	
	public Pelicula(String titulo, String genero, String creador, int a�o, String duracion){
		super(titulo, genero, creador, duracion);
		this.a�o = a�o;		
	} //Constructor con todos los atributos

	//Getters y Setter
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	@Override
	public void mostrarDatos(String nombreClase) {
		super.mostrarDatos(nombreClase);
		System.out.println("A�o: " + a�o);		
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
		System.out.println("A�o: "+a�o);
		
	}
	}
	
	@Override
	public void tiempoVisto() {
		if (visto==true){	
		String tv = "50m/05s";
		super.mostrarDatos("Pelicula");
		System.out.println("A�o: "+a�o);
		System.out.println("Tiempo Visto: " + tv);
		System.out.println("");
		
		}
		
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n Genero: " + genero + "\n Creador: " + creador + "\n A�o: " + a�o +"\n Duracion: " + duracion
				+ "\n Visto: " + visto + "";
	}
	
}
