package ar.com.codoacodo.Auto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		
		//voy a crear una instancia de la clase auto
		
		Auto miPrimerAuto = new Auto();//nace mi auto
		//aca ya puedo usar los metodos de ese auto
		
		
		
		miPrimerAuto.mostrarInfo();
		//ejecutar el metodo encender()

		miPrimerAuto.encender();
		
		miPrimerAuto.mostrarInfo();
	}

}
