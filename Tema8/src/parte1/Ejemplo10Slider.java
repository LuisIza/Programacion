package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo10Slider extends JFrame {

	public Ejemplo10Slider () {
		super("Brillo de la pantalla");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		JLabel lblBrillo = new JLabel("Escoja en nivel del brilo?");
		JButton btnAceptar = new JButton("Aceptar");
		
		JSlider sldUno = new JSlider(JSlider.HORIZONTAL);
		sldUno.setPreferredSize(new Dimension(290, 80));
		sldUno.setMinimum(0);
		sldUno.setMaximum(100);
		sldUno.setValue(80);
		sldUno.setMajorTickSpacing(20);
		sldUno.setMinorTickSpacing(5);
		sldUno.setPaintTicks(true);
		sldUno.setPaintLabels(true);
		add(lblBrillo);
		add(sldUno);
		add(btnAceptar);
		
				
		setVisible(true);
		for (int i = 0; i<= 100; i++) {
			sldUno.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Ejemplo10Slider ventana = new Ejemplo10Slider();

	}

}
