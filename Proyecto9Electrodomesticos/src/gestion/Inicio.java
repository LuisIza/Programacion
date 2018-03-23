package gestion;

public class Inicio {

	public static void main(String[] args) {
		Motor m1 = new Motor (1,"Mitsubishi", "V3");
		Motor m2 = new Motor (2,"Samsung", "A1");
		
		Lavadora lav1 = new Lavadora (201,m1,"Balay",450);
		Lavadora lav2 = new Lavadora (202,m2,"Balay",390);
		Lavadora lav3 = new Lavadora (203,m2,"Balay",580);
		Lavadora lav4 = new Lavadora (204,m1,"Balay",750);
		Lavadora lav5 = new Lavadora (205,m1,"Balay",410);

		Taller taller = new Taller();
		taller.addLavadora(lav1);
		taller.addLavadora(lav2);
		taller.addLavadora(lav3);
		taller.addLavadora(lav4);
		taller.addLavadora(lav5);
		
		taller.listaLavadoras();
		
		
		System.out.println("\nBUSCANDO LAVADORA CON CODIGO 204....");
		
		System.out.println("Encontrado en la posicion " + taller.buscaLavadora(209));
		//System.out.println(lav1.toString());
		
		
		
		
		
	}

}
