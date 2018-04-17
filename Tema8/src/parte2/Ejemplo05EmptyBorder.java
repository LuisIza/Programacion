
package parte2;
import java.awt.*;
import javax.swing.*;

public class Ejemplo05EmptyBorder extends JFrame {

	public Ejemplo05EmptyBorder () {
		super("Titulo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnl1.setBorder(BorderFactory.createEmptyBorder(40,0,0,0));
		pnl1.setPreferredSize(new Dimension(280, 180));
		
		JLabel lblNombre = new JLabel("Nombre Completo:");
		JTextField txtNombre= new JTextField(20);
		
		pnl1.add(lblNombre);
		pnl1.add(txtNombre);
		
		
		add(pnl1);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo05EmptyBorder ventana = new Ejemplo05EmptyBorder();

	}

}
