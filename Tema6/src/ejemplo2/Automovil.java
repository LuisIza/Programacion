package ejemplo2;

public class Automovil extends Vehiculo{
	private int plazas;
	private int puertas;

	public Automovil(String matricula, String modelo, String marca, int plazas,
			int puertas) {
		super(matricula, modelo, marca);
		this.plazas = plazas;
		this.puertas = puertas;
	}
	
	@Override
	public void mostrar (){
		super.mostrar();
		System.out.println("Datos del Vehiculo.............");
		System.out.println("Nº de plazas: "+plazas);
		System.out.println("Nº de Puertas: " + puertas);
	}
	
	
}
