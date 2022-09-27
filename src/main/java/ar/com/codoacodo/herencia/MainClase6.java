package ar.com.codoacodo.herencia;

public class MainClase6 {

	public static void main(String[] args) {
	
		Libro libro1 = new Libro("/libro.jpg", "Iron Man", "Alguien",3500);
		
		Articulo articulo = new Articulo("/libro.jpg", "Iron Man", "Alguien",3500);
		
		Articulo a = new Libro("/libro.jpg", "Iron Man 2", "Alguien2",4500);
		Libro libroDentroDeA = (Libro)a;
		
		Articulo[] resultados = new Articulo[2];
		resultados[0] = libro1;
		resultados[1] = articulo;
		

	}

}

