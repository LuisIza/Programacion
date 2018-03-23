package parte1;
import java.awt.FlowLayout;

import javax.swing.*;

public class Ejemplo05Botonesradio extends JFrame {
	
	public Ejemplo05Botonesradio () {
		
		super("NACIONALIDAD");
		setSize(200,210);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JRadioButton rdb1 = new JRadioButton("España         ", true);
		JRadioButton rdb2 = new JRadioButton("Francia        ");
		JRadioButton rdb3 = new JRadioButton("Portugal       ");
		JRadioButton rdb4 = new JRadioButton("Argentina      ");
		JRadioButton rdb5 = new JRadioButton("Ecuador        ");
		
		JLabel lblPais = new JLabel("Pais de Nacionalidad");
		JButton btnSiguiente = new JButton("Siguiente");
		
		ButtonGroup grupo =new ButtonGroup();
		grupo.add(rdb1);
		grupo.add(rdb2);
		grupo.add(rdb3);
		grupo.add(rdb4);
		grupo.add(rdb5);
		
		add(lblPais);
		add(rdb1);
		add(rdb2);
		add(rdb3);
		add(rdb4);
		add(rdb5);
		add(btnSiguiente);
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		Ejemplo05Botonesradio radio = new Ejemplo05Botonesradio ();
		

	}

}
