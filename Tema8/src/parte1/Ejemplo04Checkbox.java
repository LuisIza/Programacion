package parte1;

import java.awt.FlowLayout;

import javax.swing.*;

public class Ejemplo04Checkbox extends JFrame {
	public Ejemplo04Checkbox () {
		super("CheckBoxs Peliculas");
		setSize (220,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		JLabel lblPregunta = new JLabel("Elige tus generos favoritos:");
		JCheckBox chx1 = new JCheckBox("Acción          ", true);
		JCheckBox chx2 = new JCheckBox("Drama           ");
		JCheckBox chx3 = new JCheckBox("Infantil        ");
		JCheckBox chx4 = new JCheckBox("Ciencia Ficción ");
		JCheckBox chx5 = new JCheckBox("Bélico          ");
		JCheckBox chx6 = new JCheckBox("Terror          ");
		JCheckBox chx7 = new JCheckBox("Policiaco       ");
		JCheckBox chx8 = new JCheckBox("Fantasia        ");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(chx1);
		grupo.add(chx2);
		grupo.add(chx3);
		grupo.add(chx4);
		grupo.add(chx5);
		grupo.add(chx6);
		grupo.add(chx7);
		grupo.add(chx8);
		
		add(lblPregunta);
		add(chx1);
		add(chx2);
		add(chx3);
		add(chx4);
		add(chx5);
		add(chx5);
		add(chx6);
		add(chx7);
		add(chx8);
		
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		Ejemplo04Checkbox chx= new Ejemplo04Checkbox();

	}

}
