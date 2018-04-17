
package eventos3;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana3 extends JFrame {
	
	private JButton btnArriba;
	private JButton btnAbajo;
	private JLabel lblPulsado;
	
	public Ventana3 () {
		super("Pulsar botón");
		setSize(150,90);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		btnArriba = new JButton("Arriba");
		btnArriba.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPulsado.setText("Botón arriba");
				
			}
		});
		
		btnAbajo = new JButton("Abajo");
		btnAbajo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPulsado.setText("Botón abajo");
				
			}
		});
		
		
		lblPulsado = new JLabel("Pulsa un botón.");
		
		add(btnArriba);
		add(btnAbajo);
		add(lblPulsado);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana3 ventana = new Ventana3();

	}


}
