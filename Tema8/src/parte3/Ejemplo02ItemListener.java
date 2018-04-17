
package parte3;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Ejemplo02ItemListener extends JFrame implements ItemListener {
	
	private JComboBox<String> cmbPeliculas;
	private JLabel lblProtas;
	
	public Ejemplo02ItemListener () {
		super("Peliculas y actores");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		String []pelis = {"Harry Potter","Matriz","Mad max","Malditos bastardos"};
		cmbPeliculas = new JComboBox<>(pelis);
		cmbPeliculas.addItemListener(this);
		
		lblProtas = new JLabel("Protagonista: Daniel Rad");
		add(cmbPeliculas);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo02ItemListener ventana = new Ejemplo02ItemListener();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String [] actores = {"Daniel Rad", "Keanu","Mel Gibson","Brad Pitt"};
		JComboBox<String> cmbCombo = (JComboBox<String>)e.getSource();
				
		int pos = cmbCombo.getSelectedIndex();
		lblProtas.setText("Protagonista: " + actores[pos]);
		
	}

}
