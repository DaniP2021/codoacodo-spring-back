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
		if(!encendido) {
			System.out.println("se ha encendido");
		encendido = true;
	} else {
		System.out.println("ya esta encendido");
	}
	}
	void apagar() {
		
	}
	void acelerar() {
		if(encendido) {
			System.out.println("acelerando");
		} else {
			System.out.println("debe encender el auto");
		}
	}
	void frenar( ) {
		
	}
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}
	
	

}
