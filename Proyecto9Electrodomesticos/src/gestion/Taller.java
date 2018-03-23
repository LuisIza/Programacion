package gestion;

public class Taller {
	private final int MAX_LAVADORAS = 20;
	private Lavadora [] lavadoras = new Lavadora[MAX_LAVADORAS];
	
	public void listaLavadoras(){
		System.out.println("---LISTADO DE LAVADORAS EN STOCK---");
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i]!= null)
			System.out.println(lavadoras[i].toString());
		}
	}
		
	public void addLavadora(Lavadora lav){
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i]==null){
				lavadoras[i]=lav;
				break;
			}
		}
	}
	public void borraLavadora(int id){
		int borrar = buscaLavadora(id);
		if (borrar != -1){
			lavadoras[borrar]= null;
		}
	}
	
	public int buscaLavadora(int id){
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i]!=null && lavadoras[i].getId()== id){
				return i;
			}
		}
		return -1;
	
}
}
