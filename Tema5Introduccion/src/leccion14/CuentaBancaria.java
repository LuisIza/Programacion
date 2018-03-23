package leccion14;
//
public class CuentaBancaria {
	int balance;
	
	// Constructor.
	CuentaBancaria( int balance){
		this.balance = balance;
	}
	
	
	// Metodos.
	void depositar(int cantidad){
		balance = balance+cantidad;
	}
	
	void depositar (int cantidad, int comision){
		balance = balance + cantidad-comision;
		
	}
	
	boolean retirar(int cantidad){
		
		if (cantidad> balance){
			
			return false;
		}else{
			balance=balance -cantidad;
			return true;
		}
		
	}
	
	boolean retirar (int cantidad, int comision){
		if (cantidad+comision> balance){
			
			return false;
		}else{
			balance = balance -cantidad - comision;
			return true;
		}
	}
	
	
	int obtenerBalance(){
		return balance;
	}
}
