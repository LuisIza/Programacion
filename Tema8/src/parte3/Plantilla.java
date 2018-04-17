
package parte3;
import java.awt.*;
import javax.swing.*;

public class Plantilla extends JFrame {

	public Plantilla () {
		super("Titulo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		
		
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Plantilla ventana = new Plantilla();

	}

}
