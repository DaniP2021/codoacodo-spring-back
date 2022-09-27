package ar.com.codoacodo.Auto;

public class Auto {
	
	/*
	 * atributos
	 */
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	//constructor
	Auto() {
		//aca va el codigo cuando nace el auto
		encendido = false;//nace apagado
	}
	
	//metodos
	void encender() {
		encendido = true;
	}
	
	void apagar() {
		
	}
	void acelerar() {
		
	}
	void frenar( ) {
		
	}
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}
	
	

}
