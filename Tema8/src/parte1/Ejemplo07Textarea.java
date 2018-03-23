package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo07Textarea extends JFrame {

	public Ejemplo07Textarea () {
		super("Ejemplo Text area");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		JTextArea txtr1 = new JTextArea(10,30);
		txtr1.setLineWrap(true);
		txtr1.setWrapStyleWord(true);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//txtr1.setPreferredSize(new Dimension(390,170));
		JScrollPane scrPanel = new JScrollPane(txtr1);
		scrPanel.setPreferredSize(new Dimension(390,170));
		
		
		
		add(new JLabel("Escribe tus comentarios:"));
		add(scrPanel);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo07Textarea ventana = new Ejemplo07Textarea();

	}

}
