

import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Luis Iza
 *
 */
public class Ejemplo14 extends JFrame {
		
	public Ejemplo14 () {
		super("Lector");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		JMenu menu = new JMenu ("Archivo");
		JMenuItem mAbrir = new JMenuItem("Abrir");
		menu.add(mAbrir);
		JMenuBar barra = new JMenuBar();
		barra.add(menu);
		JTextArea txtVisor = new JTextArea();
		JScrollPane srcTxt = new JScrollPane();
		
		srcTxt.add(txtVisor);
		
		
		setJMenuBar(barra);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo14 ventana = new Ejemplo14();

	}

}
