package parte1;
import java.awt.*;

import javax.swing.*;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;

public class Ejemplo08Look extends JFrame {

	public Ejemplo08Look () {
		super("Ejemplo Text area");
		setSize(400,270);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		JTextArea txtr1 = new JTextArea(10,30);
		txtr1.setLineWrap(true);
		txtr1.setWrapStyleWord(true);
		
		//SubstanceLookAndFeel.setSkin(“org.jvnet.substance.skin.BusinessBlackSteelSkin”);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
		
			System.out.println("Error Look");
		}
		//txtr1.setPreferredSize(new Dimension(390,170));
		JScrollPane scrPanel = new JScrollPane(txtr1);
		scrPanel.setPreferredSize(new Dimension(390,170));
		JButton btn1= new JButton("Aceptar");
		JButton btn2= new JButton("Cancelar");
		
		JComboBox <String>cmb1 = new JComboBox<>();
		cmb1.addItem("Comentario");
		cmb1.addItem("Comentario");
		cmb1.addItem("Comentario");
		cmb1.setPreferredSize(new Dimension(390, 30));
		
		add(new JLabel("Escribe tus comentarios:"));
		add(scrPanel);
		add(cmb1);
		add(btn1);
		add(btn2);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo08Look ventana = new Ejemplo08Look();

	}

}
