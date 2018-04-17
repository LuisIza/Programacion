package actividades3;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class PlanificadorPersonal extends JFrame {
	
	public PlanificadorPersonal () {
		super("Planificador personal");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout (new FlowLayout ());
		
		//CREACION DE ICONOS DE BOTONES
		ImageIcon icn1 = new ImageIcon("Iconos/1.png");
		ImageIcon icn2 = new ImageIcon("Iconos/11.png");
		ImageIcon icn3 = new ImageIcon("Iconos/22.png");
		ImageIcon icn4 = new ImageIcon("Iconos/3.png");
		ImageIcon icn5 = new ImageIcon("Iconos/44.png");
		ImageIcon icn6 = new ImageIcon("Iconos/66.png");
		ImageIcon icn7 = new ImageIcon("Iconos/67.png");
		ImageIcon icn8 = new ImageIcon("Iconos/73.png");
		
		//CREACION DE BOTONES
		JButton btn1 = new JButton(icn1);
		JButton btn2 = new JButton(icn2);
		JButton btn3 = new JButton(icn3);
		JButton btn4 = new JButton(icn4);
		JButton btn5 = new JButton(icn5);
		JButton btn6 = new JButton(icn6);
		JButton btn7 = new JButton(icn7);
		JButton btn8 = new JButton(icn8);
		
		//CREACION DEL JTOOLBAR
		JToolBar barra =  new JToolBar();
		barra.add(btn1);
		barra.add(btn2);
		barra.add(btn3);
		barra.add(btn4);
		barra.addSeparator();
		barra.add(btn5);
		barra.add(btn6);
		barra.add(btn7);
		barra.addSeparator();
		barra.add(btn8);
		
		add(barra, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		PlanificadorPersonal ventana = new PlanificadorPersonal();

	}

}