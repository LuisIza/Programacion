
package parte1;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControlesAvanzadosSuscripcion extends JFrame {

	public ControlesAvanzadosSuscripcion () {
		super("Suscripción");
		setSize(280,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(21);
		JLabel lblEmail = new JLabel("Email");
		JTextField txtEmail = new JTextField(21);
		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		JTextArea txtMotivo = new JTextArea(7,21);
		txtMotivo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JCheckBox chxInfo = new JCheckBox("Recibir información por correo ", true);
				
		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblMotivo);
		add(txtMotivo);
		add(chxInfo);
		add(new JButton("Enviar"));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ControlesAvanzadosSuscripcion ventana = new ControlesAvanzadosSuscripcion();

	}

}
