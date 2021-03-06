package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo14Menus extends JFrame {

	public Ejemplo14Menus () {
		super("Barras de menú");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		//Cambio de look and feel.
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
		
			System.out.println("Error Look");
		}		
		
		
		//Menu File
		JMenu mFile= new JMenu("File");
		JMenuItem itemNew = new JMenuItem("New");
		JMenuItem itemFile = new JMenuItem("Open File...");
		JMenuItem itemClose= new JMenuItem("Close");
		mFile.add(itemNew);
		mFile.add(itemFile);
		mFile.addSeparator();
		mFile.add(itemClose);
		
		//Menu Edit
		JMenu mEdit= new JMenu("Edit");
		JMenuItem itemUndo = new JMenuItem("Undo Typing");
		JMenuItem itemCopy = new JMenuItem("Copy");
		JMenuItem itemPaste = new JMenuItem("Paste");
		mEdit.add(itemUndo);
		mEdit.addSeparator();
		mEdit.add(itemCopy);
		mEdit.addSeparator();
		mEdit.add(itemPaste);

		//Barra menu
		JMenuBar barra = new JMenuBar();
		barra.add(mFile);
		barra.add(mEdit);
		
		setJMenuBar(barra);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo14Menus ventana = new Ejemplo14Menus();

	}

}

