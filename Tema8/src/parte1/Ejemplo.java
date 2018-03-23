package parte1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo extends JFrame {
	public Ejemplo() {
		super("Botonesss");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout());
		
		JButton btn1 = new JButton ("Inicio");
		JButton btn2 = new JButton ("Ubicacion");
		JButton btn3 = new JButton ("Salir");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		Ejemplo ej = new Ejemplo ();

	}

}
