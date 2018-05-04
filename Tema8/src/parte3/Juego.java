
package parte3;
import java.awt.*;
import javax.swing.*;

public class Juego extends JFrame {

	public Juego () {
		super("Titulo");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new GridLayout(3, 3,5,5));
		
		
		JButton btn1 = new JButton("Botón 1");
		JButton btn2 = new JButton("Botón 2");
		JButton btn3 = new JButton("Botón 3");
		JButton btn4 = new JButton("Botón 4");
		JButton btn5 = new JButton("Botón 5");
		JButton btn6 = new JButton("Botón 6");
		JButton btn7 = new JButton("Botón 7");
		JButton btn8 = new JButton("Botón 8");
		JButton btn9 = new JButton("Botón 9");

		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Juego ventana = new Juego();

	}

}
