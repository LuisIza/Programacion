
package parte3;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ejemplo04 extends JFrame implements KeyListener{
		
	private JLabel lblTv;
	private int x,y;
	
	public Ejemplo04 () {
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
		Ejemplo04 ventana = new Ejemplo04();

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
		if (x<0) {
			x=300;
		}else if (x>300) {
			x=0;
		}
		if (y<0) {
			y=300;
		}else if (y>300) {
			y=0;
		}
		
		lblTv.setBounds(x, y, 24, 24);		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			x= x-5;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x= x+5;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			y= y-5;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			y= y+5;
		}
		if (x<0) {
			x=300;
		}else if (x>300) {
			x=0;
		}
		if (y<0) {
			y=300;
		}else if (y>300) {
			y=0;
		}
		
		lblTv.setBounds(x, y, 24, 24);		
	}
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// Metodo sin utilizar
		
	}

}
