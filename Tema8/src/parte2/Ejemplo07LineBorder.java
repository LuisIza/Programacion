
package parte2;
import java.awt.*;
import javax.swing.*;

public class Ejemplo07LineBorder extends JFrame {

	public Ejemplo07LineBorder () {
		super("Titulo");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		// PANEL IZQUIERDO
		JPanel pnlIzq = new JPanel();
		pnlIzq.setBorder(BorderFactory.createLineBorder(Color.RED));
		pnlIzq.setPreferredSize(new Dimension(140, 280));
		pnlIzq.setBorder(BorderFactory.createLineBorder(Color.black,5,true));
		JButton btn1 = new JButton("Atrás");
		JButton btn2 = new JButton("Adelante");
		pnlIzq.add(btn1);
		pnlIzq.add(btn2);
		pnlIzq.setLayout(new FlowLayout(FlowLayout.LEFT));
		// PANLE DERECHO
		JPanel pnlDrch = new JPanel();
		pnlDrch.setPreferredSize(new Dimension(140, 280));
		pnlDrch.setBorder(BorderFactory.createLineBorder(Color.BLUE,5,true));
		JButton btn3 = new JButton("Arriba");
		JButton btn4 = new JButton("Abajo");
		pnlDrch.add(btn3);
		pnlDrch.add(btn4);
		pnlDrch.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(pnlIzq);
		add(pnlDrch);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo07LineBorder ventana = new Ejemplo07LineBorder();

	}

}
