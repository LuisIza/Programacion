
package parte3;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ejemplo03KeyListener extends JFrame implements KeyListener{
		
	private JLabel lblTv;
	private int x,y;
	
	public Ejemplo03KeyListener () {
		super("Mover Tv");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		addKeyListener(this);
		
		lblTv = new JLabel(new ImageIcon("Iconos/21.png"));
		x=100;
		y=150;
		
		lblTv.setBounds(x, y, 24, 24);		
		
		
		
		add(lblTv);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo03KeyListener ventana = new Ejemplo03KeyListener();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar()=='a') {
			x= x-5;
		}
		
		if (e.getKeyChar()=='d') {
			x= x+5;
		}
		
		if (e.getKeyChar()=='w') {
			y= y-5;
		}
		
		if (e.getKeyChar()=='s') {
			y= y+5;
		}
		if (x==5) {
			x=270;
		}else if (x==270) {
			x=5;
		}
		if (y==5) {
			y=270;
		}else if (y==270) {
			y=5;
		}
		
		lblTv.setBounds(x, y, 24, 24);		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Metodo sin utilizar
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Metodo sin utilizar
		
	}

}
