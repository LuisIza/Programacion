package leccion08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cb1 = new CuentaBancaria(5000);
		
		System.out.println("Saldo Actual "+ cb1.obtenerBalance()+"€");
		cb1.depositar(500);
		System.out.println("------------------------------------------");
		System.out.println("Se ha realizado un ingreso de 500€");
		System.out.println("Saldo Actual "+ cb1.obtenerBalance()+"€");
		
		System.out.println("------------------------------------------");
	
		System.out.println("Retiro de 1580€ ");
		if (cb1.retirar(1580)){
			System.out.println("Operacion realizada correctamente");
		}else{
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo Actual "+ cb1.obtenerBalance()+"€");
	}

}
