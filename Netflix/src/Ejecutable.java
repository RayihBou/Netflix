import java.util.ArrayList;

public class Ejecutable{
	
	public static ArrayList<Netflix> Pelicula = new ArrayList<Netflix>(); //Creando el ArrayList Peliculas
	public static ArrayList<Netflix> Serie = new ArrayList<Netflix>(); //Creando el ArrayList Series

	public static void main(String[] args) {		
			
		// Excepciones
		try{
		//ArrayList Pelicula
		Pelicula p1 = new Pelicula("DEEP WEB", "Documental", "Alex Winter", 2015, "90 minutos");
		Pelicula p2 = new Pelicula("NOW YOU SEE ME", "Accion", "Louis Leterrier", 2013, "136 minutos");
		Pelicula p3 = new Pelicula("CITY OF GOD", "Accion", "Fernando Meirelles", 2002, "90 minutos");
		Pelicula p4 = new Pelicula("INCEPTION", "Accion", "Christopher Nolan", 2010, "148 minutos");
		Pelicula.add(p1);
		Pelicula.add(p2);
		Pelicula.add(p3);
		Pelicula.add(p4);
		
		} catch (Exception e){
			System.out.println("Ingresaste un valor de mas en una pelicula, prueba nuevamente");
		}
		
		//ArrayList Pelicula
		Pelicula p1 = new Pelicula("DEEP WEB", "Documental", "Alex Winter", 2015, "90 minutos");
		Pelicula p2 = new Pelicula("NOW YOU SEE ME", "Accion", "Louis Leterrier", 2013, "136 minutos");
		Pelicula p3 = new Pelicula("CITY OF GOD", "Accion", "Fernando Meirelles", 2002, "90 minutos");
		Pelicula p4 = new Pelicula("INCEPTION", "Accion", "Christopher Nolan", 2010, "148 minutos");
		Pelicula.add(p1);
		Pelicula.add(p2);
		Pelicula.add(p3);
		Pelicula.add(p4);
		
		//ArrayList Series
		Serie s1 = new Serie("THE WALKING DEAD", "Zombis", "Frank Darabont", "60 minutos", 5);
		Serie s2 = new Serie("LIE TO ME", "SAMUEL BAUM", "DRAMA", "40 minutos", 3);
		Serie s3 = new Serie("FRIENDS", "David Crane", "Novela", "50 minutos", 10);
		Serie s4 = new Serie("HOUSE, M.D.", "David Shore", "Novela", "45 minutos", 8);
		Serie.add(s1);
		Serie.add(s2);
		Serie.add(s3);
		Serie.add(s4);
				
		//Metodo marcarVisto()
		p1.marcarVisto();
		p2.marcarVisto();
		s1.marcarVisto();
		s2.marcarVisto();
		//Fin Metodo marcarVisto()
		
		//Metodo esVisto()
		System.out.println("***METODO esVisto()***");
		System.out.println("");
		System.out.println("la Pelicula 'DEEP WEB' fue Vista?: ");
		p1.esVisto();
		System.out.println("");
						
		System.out.println("la Serie 'LIE TO ME' fue vista?: ");
		System.out.println("");
		s2.esVisto();
		System.out.println("");
		//Fin Metodo esVisto()
				
		//Lista de Peliculas Vistas
		System.out.println("***Metodo tiempoVisto()***");
		System.out.println("");
		System.out.println("Peliculas Vistas: ");
		System.out.println("");
		for(int i=0; i<Pelicula.size(); i++){
			((IVisualizable) Pelicula.get(i)).tiempoVisto();
		}// Fin Lista de Peliculas Vistas
	
		//Lista de Series Vistas
		System.out.println("");
		System.out.println("Series Vistas: ");
		System.out.println("");
		for(int i=0; i<Serie.size(); i++){
		    ((IVisualizable) Serie.get(i)).tiempoVisto();
		}//Fin lista de Series Vistas
		
		//Metodo toString()
		System.out.println("***Metodo toString()***");	
		System.out.println("");
		System.out.println("Serie con mas Temporada: ");
		System.out.println(s3.toString());
		System.out.println("");
		System.out.println("Pelicula mas Reciente: ");
		System.out.println(p1.toString());
		System.out.println("");
		//Fin Metodo toString()
			
		//Lista de Peliculas
		System.out.println("***LISTA DE PELICULAS***");
		System.out.println("");
		for(int i = 0; i<Pelicula.size(); i++){
			Pelicula.get(i).mostrarDatos("Pelicula");
			System.out.println("");
		}//Fin lista de Peliculas
		
		//Lista de Series
		System.out.println("***LISTA DE SERIES***");
		System.out.println("");
		for(int j = 0; j<Serie.size(); j++){
			Serie.get(j).mostrarDatos("Serie");
			System.out.println("");
		}//Fin lista de Series		

	}//main

		
}//class
