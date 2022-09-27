package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class Libro  extends Articulo {
	
	private int nroPaginas;
	private String isbn;
	
	public Libro(String img, String titulo, String autor, float precio) {
		
		
		super(img, titulo, autor, precio);
		
	}
	
	public Libro(String img, String titulo, String autor, float precio; int nroPaginas, String isbn) {
		super(img, titulo, autor, precio);
		
	}
}
	


