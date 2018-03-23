package parte1;
import java.awt.*;
import javax.swing.*;

public class Actividad01 extends JFrame {

		
	public static void main(String[] args) {
		
		
		//JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?","Confirmación de formateo", JOptionPane.OK_CANCEL_OPTION,
		//		JOptionPane.WARNING_MESSAGE);

		
		//JOptionPane.showInputDialog(null, "Escribe tu DNI", "Confirmación de identidad",
		//		JOptionPane.QUESTION_MESSAGE);
		
		
		//JOptionPane.showConfirmDialog(null, "Se ha detectado un escaneo de red \n"
		//		+ "desde la IP 192.168.1.152.", "Alerta de Seguridad",JOptionPane.DEFAULT_OPTION,
		//		JOptionPane.WARNING_MESSAGE);
	
		
		//String series[]= {"Futurama","Los Simpson","Héroes"};
		//JOptionPane.showOptionDialog(null,"En que estación naciste?","Estaciones",
		//		0,JOptionPane.INFORMATION_MESSAGE,null,series,series[2]);
		
		
		String servidores [] = {"Apache","IIS","Nginx","Node.JS"};
		JOptionPane.showOptionDialog(null,"En que estación naciste?","Estaciones",
				0,JOptionPane.INFORMATION_MESSAGE,null,servidores,servidores[1]);
	
	
	}

}
