
package eventos2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana2 extends JFrame implements ActionListener {
	private JButton btnPulsar;
	private boolean btn = true;
	public Ventana2 () {
		super("Pulsar botón");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		btnPulsar = new JButton("Encendido");
		btnPulsar.setPreferredSize(new Dimension(270, 170));
		btnPulsar.setBackground(Color.GREEN);
		btnPulsar.setFont(new Font("Calibri", 3, 35));
		btnPulsar.addActionListener(this);	
		
		add(btnPulsar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana2 ventana = new Ventana2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
				
		if (btn) {
		btnPulsar.setText("Apagado");
		btnPulsar.setBackground(Color.red);
		btn=false;
		}else {
			btn= true;
			btnPulsar.setText("Encendido");
			btnPulsar.setBackground(Color.GREEN);
		}
		
		//btn = !btn;
	}

}
