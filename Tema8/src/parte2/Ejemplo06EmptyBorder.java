
package parte2;
import java.awt.*;
import javax.swing.*;

public class Ejemplo06EmptyBorder extends JFrame {

	public Ejemplo06EmptyBorder () {
		super("Titulo");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		JPanel pnl1 = new JPanel();
		pnl1.setBorder(BorderFactory.createEmptyBorder(85,90,0,0));
		JButton btnPulsar = new JButton("PÚLSAME");
		btnPulsar.setPreferredSize(new Dimension(100, 100));
		
		pnl1.add(btnPulsar);
		
		add(pnl1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo06EmptyBorder ventana = new Ejemplo06EmptyBorder();

	}

}
