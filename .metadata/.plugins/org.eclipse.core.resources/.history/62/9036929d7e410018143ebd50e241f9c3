
package eventos2;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana extends JFrame implements ActionListener {
	private JLabel lblPulsado;
	public Ventana () {
		super("Pulsar botón");
		setSize(300,80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		JButton btnPulsar = new JButton("Pélsame!");
		
		
		btnPulsar.addActionListener(this);
		lblPulsado = new JLabel("No has pulsado el botón, todavía.");
		
		add(btnPulsar);
		add(lblPulsado);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//JOptionPane.showMessageDialog(null,"Has pulsado el botón","Aviso",JOptionPane.INFORMATION_MESSAGE);
		
		lblPulsado.setText("Ya has pulsado el botón....          ");
		
	}

}
