
package eventos1;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana () {
		super("Pulsar botón");
		setSize(300,80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		JButton btnPulsar = new JButton("Pélsame!");
		
		Manejador manejador = new Manejador();
		btnPulsar.addActionListener(manejador);
		JLabel lblPulsasdo = new JLabel("No has pulsado el botón, todavía.");
		
		add(btnPulsar);
		add(lblPulsasdo);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();

	}

}
