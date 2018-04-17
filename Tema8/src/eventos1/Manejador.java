package eventos1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Manejador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Has pulsado el botón");
		
	}
	
}
