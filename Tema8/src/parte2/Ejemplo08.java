
package parte2;
import java.awt.*;
import javax.swing.*;

public class Ejemplo08 extends JFrame {

	public Ejemplo08 () {
		super("Ejemplo Borde colores");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		

		JPanel pnlIzq = new JPanel();
		pnlIzq.setPreferredSize(new Dimension(140, 130));
		pnlIzq.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
		
		JPanel pnlDrch = new JPanel();
		pnlDrch.setPreferredSize(new Dimension(140, 130));
		pnlDrch.setBorder(BorderFactory.createLineBorder(Color.BLUE,5,true));
		
		JPanel pnlAbajo = new JPanel();
		pnlAbajo.setPreferredSize(new Dimension(285, 130));
		pnlAbajo.setBorder(BorderFactory.createLineBorder(Color.GREEN,5,true));
		
		add(pnlIzq);
		add(pnlDrch);
		add(pnlAbajo);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo08 ventana = new Ejemplo08();

	}

}
