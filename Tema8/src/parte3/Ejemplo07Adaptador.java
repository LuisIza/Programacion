
package parte3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * Ejemplo que en lugar de usar clases internas anonimas,
 * usamos una clase adaptador.
 */

public class Ejemplo07Adaptador extends JFrame {
	private JButton btnAbrir;
	
	public Ejemplo07Adaptador () {
		super("Prueba clase adaptador");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new Adaptador() {
			
			
		});
		
		
		
		add(btnAbrir);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo07Adaptador ventana = new Ejemplo07Adaptador();

	}

}
