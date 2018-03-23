package parte1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo02Botones extends JFrame{
	
	public Ejemplo02Botones () {
		super ("Ejemplo Botones");
		setSize(450,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("Nuevo");
		JButton btn2 = new JButton("Abrir");
		JButton btn3 = new JButton("Guardar");
		JButton btn4 = new JButton ("Salir");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		setVisible (true);
	}
	
	
	public static void main(String[] arguments) {
		Ejemplo02Botones ventana = new Ejemplo02Botones ();
		
	}

}
