public class Netflix {
	protected String titulo;
	protected String genero;
	protected String creador;
	protected String duracion;
	protected Boolean visto = false;
	
	public Netflix(String titulo, String genero, String creador, String duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}
	
	public Netflix(String titulo, String genero){
		this.titulo = titulo;
		this.genero = genero;
	}
	
	//Getters y Setter
	public Netflix(){
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	public void mostrarDatos(String nombreClase){
		
		System.out.println(nombreClase);
		System.out.println("Titulo: " + titulo);
		System.out.println("Genero: " + genero);
		System.out.println("Creador: " + creador);
		System.out.println("Duracion: " + duracion);
		System.out.println("Visto: " + visto);
		
	}
}
