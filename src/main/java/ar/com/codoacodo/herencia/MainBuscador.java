package ar.com.codoacodo.herencia;

public class MainBuscador {

	public static void main(String[] args) {
		
	
		String claveDelUsuario = "iron man";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
			
		miBuscador.setClaveBusqueda(claveDelUsuario);
		
		miBuscador.buscar();

		
		miBuscador.mostrarResultados();
	}

}