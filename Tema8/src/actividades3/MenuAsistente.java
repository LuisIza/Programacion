package actividades3;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

public class MenuAsistente extends JFrame {
	
	public MenuAsistente () {
		super("Asistente matemático");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		//Cambio de look and feel.
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				SwingUtilities.updateComponentTreeUI(this);
			} catch (Exception e) {
				
				System.out.println("Error Look");
			} 
				
		//MENU ARITMETICA
		JMenu mAritmetica = new JMenu("Aritmética");
		mAritmetica.add(new JMenuItem("Suma"));
		mAritmetica.add(new JMenuItem("Resta"));
		mAritmetica.addSeparator();
		mAritmetica.add(new JMenuItem("Multiplicación"));
		mAritmetica.add(new JMenuItem("División"));
		mAritmetica.addSeparator();
		mAritmetica.add(new JMenuItem("Porcentaje"));
		
		//MENU CALCULO
		JMenu mCalculo = new JMenu("Cálculo");
		mCalculo.add(new JMenuItem("Derivada"));
		mCalculo.add(new JMenuItem("Integral"));
		mCalculo.addSeparator();
		mCalculo.add(new JMenuItem("Polinomio de Taylor"));
		mCalculo.add(new JMenuItem("Ecuación diferencial"));
		
		//BARRA MENU...
		JMenuBar barra = new JMenuBar();
		barra.add(mAritmetica);
		barra.add(mCalculo);
		
		setJMenuBar(barra);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MenuAsistente ventana = new MenuAsistente();

	}

}