package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo09MessageDialog extends JFrame {

	
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Se ha borrado el historial.");
		
		//JOptionPane.showMessageDialog(null, "No se ha podico conecatr a la base de datos.","Fallo de conexión", JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showConfirmDialog(null, "¿Guardar cambios en el archivo?");
		
		int option =JOptionPane.showConfirmDialog(null, "¿Desea continuar con el Formateo..?", "Formatear disco", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		
		if (option == JOptionPane.YES_OPTION) {
			System.out.println("Seguro..");
			JOptionPane.showConfirmDialog(null, "¿Seguro....","Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
		}else if (option == JOptionPane.NO_OPTION) {
			System.out.println("Menos mal");
			JOptionPane.showMessageDialog(null, "Menos mal","Confirmar",JOptionPane.INFORMATION_MESSAGE);
		}else {
			System.out.println("EIN???");
			JOptionPane.showMessageDialog(null, "EIN???","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		}
	
	}

}
