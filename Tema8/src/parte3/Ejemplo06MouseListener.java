
package parte3;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Ejemplo06MouseListener extends JFrame implements MouseListener {
	
	private JLabel lblCordenadas, lblBoton;
	
	
	public Ejemplo06MouseListener () {
		super("Titulo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		lblCordenadas= new JLabel("Haz click en la ventana");
		lblBoton = new JLabel();
		lblBoton.setPreferredSize(new Dimension(180, 30));
		
		addMouseListener(this);
		add(lblCordenadas);
		add(lblBoton);
		
		
		
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo06MouseListener ventana = new Ejemplo06MouseListener();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x,y;
		
		x= e.getX();
		y= e.getY();
		
		lblCordenadas.setText("Coordenadas= X: " + x + ",  Y: "+y);
		lblBoton.setText("Botón: " + e.getButton());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
