package ejemplo2;

public class Furgoneta extends Automovil{
	private float m3;
	
	public Furgoneta(String matricula, String modelo, String marca, int plazas,
			int puertas, float m3) {
		super(matricula, modelo, marca, plazas, puertas);
		this.m3 = m3;
	}

	@Override
	public void mostrar(){
		System.out.println("Datos furgoneta........");
		System.out.println("Metros cubicos: "+m3);
		super.mostrar();
	}

}
