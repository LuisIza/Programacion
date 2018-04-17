package actividades3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class Parametros extends JFrame {
	
	public Parametros () {
		super("Parámetros críticos");
		setSize(300,130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		JLabel lblCombustible = new JLabel("Combustible");
		JLabel lblPrecion1 = new JLabel("Presión motor 1");
		JLabel lblPrecion2 = new JLabel("Presión motor 2");
		//COMBUSTIBLE
		JProgressBar prgCombustible = new JProgressBar(0,100);
		prgCombustible.setValue(20);
		prgCombustible.setStringPainted(true);
		prgCombustible.setPreferredSize(new Dimension(150, 20));
		prgCombustible.setForeground(Color.RED);
		//PRESION MOTOR 1
		JProgressBar prgMotor1 = new JProgressBar(0,100);
		prgMotor1.setValue(75);
		prgMotor1.setStringPainted(true);
		prgMotor1.setPreferredSize(new Dimension(150,20));
		prgMotor1.setForeground(new Color(0,128,0));
		//PRESION MOTOR 2
		JProgressBar prgMotor2 = new JProgressBar(0,100);
		prgMotor2.setValue(75);
		prgMotor2.setStringPainted(true);
		prgMotor2.setPreferredSize(new Dimension(150,20));
		prgMotor2.setForeground(new Color(0,128,0));
		
		add(prgCombustible);
		add(lblCombustible);
		add(prgMotor1);
		add(lblPrecion1);
		add(prgMotor2);
		add(lblPrecion2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Parametros ventana = new Parametros();

	}

}