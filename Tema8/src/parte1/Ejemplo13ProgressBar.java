package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo13ProgressBar extends JFrame {

	public Ejemplo13ProgressBar () {
		super("Nivel Deposito");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		JLabel lblgas = new JLabel("Nivel Combustible");
		JProgressBar prgNivel = new JProgressBar(0,60);
		prgNivel.setValue(35);
		prgNivel.setStringPainted(true);
		prgNivel.setPreferredSize(new Dimension(280, 50));
		//prgNivel.setBackground(new Color(138,200,41));
		
		
		add(lblgas);
		add(prgNivel);
		
		setVisible(true);
		
		
		for (int i = 35; i>=0; i--) {
			prgNivel.setValue(i);
			lblgas.setText("Nivel Combustible: " + i + " Litros");
			if (i==10) {
			prgNivel.setForeground(new Color(2,201, 150));
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Ejemplo13ProgressBar ventana = new Ejemplo13ProgressBar();

	}

}
