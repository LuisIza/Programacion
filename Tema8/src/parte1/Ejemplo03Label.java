package parte1;

import java.awt.FlowLayout;
import javax.swing.*;

public class Ejemplo03Label extends JFrame {
	
	public Ejemplo03Label() {
		super("Ejemplo con lbl y txt");
		setSize (400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout ());	
		JLabel lblUrl = new JLabel ("Dirección Web: ");
		JTextField txtUrl = new JTextField ("Escribe aqui...", 30);
		JButton btnAceptar = new JButton ("Aceptar");
		add(lblUrl);
		add(txtUrl);
		add(btnAceptar);
			
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ejemplo03Label texto = new Ejemplo03Label ();
		

	}

}
