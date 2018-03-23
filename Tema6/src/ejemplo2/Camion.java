package ejemplo2;

public class Camion extends Vehiculo{
	private int mma;
	private int ejes;
	
	
	public Camion(String matricula, String modelo, String marca, int mma,
			int ejes) {
		super(matricula, modelo, marca);
		this.mma = mma;
		this.ejes = ejes;
	}

	@Override
	public void mostrar (){
		System.out.println("Datos del Camion............");
		System.out.println("Masa máxima autorizada: " + mma);
		System.out.println("Nº de ejes: " + ejes);
		super.mostrar();
	}


	public int getMma() {
		return mma;
	}


	public void setMma(int mma) {
		this.mma = mma;
	}


	public int getEjes() {
		return ejes;
	}


	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	

}
