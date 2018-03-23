package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo09OptionPanes2 extends JFrame {

	
	public static void main(String[] args) {
		String []estaciones = {"Primavera","Verano","Otoño","Invierno"};
		
		int option = JOptionPane.showOptionDialog(null,"En que estación naciste?","Estaciones",
				0,JOptionPane.QUESTION_MESSAGE,null,estaciones,estaciones[0]);		
				
		
		JOptionPane.showMessageDialog(null,"Has elegido: " + estaciones[option],"Respuesta",JOptionPane.QUESTION_MESSAGE);
		
		
		}
	
	}


