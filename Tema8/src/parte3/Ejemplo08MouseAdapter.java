
package parte3;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Ejemplo08MouseAdapter extends JFrame {
	private JLabel lblC, lblB;
	
	public Ejemplo08MouseAdapter () {
		super("Titulo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		lblC = new JLabel("Haz clic en la ventana");
		lblB = new JLabel();
		
		add(lblC);
		add(lblB);
		
		
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				super.mouseClicked(e);
				int x,y;
				
				x= e.getX();
				y= e.getY();
				
				lblC.setText("Coordenadas ( " + x +", "+y + " )");
				lblB.setText("Botón: " + e.getButton());
				
			}
			
		});
			
			
			
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo08MouseAdapter ventana = new Ejemplo08MouseAdapter();

	}

}
