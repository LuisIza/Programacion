package leccion08;
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
	boolean retirar(int cantidad){
		
		if (cantidad> balance){
			
			return false;
		}else{
			balance=balance -cantidad;
			return true;
		}
		
	}
	
	int obtenerBalance(){
		return balance;
	}
}
