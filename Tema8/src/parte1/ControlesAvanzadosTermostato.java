
package parte1;
import java.awt.*;
import javax.swing.*;

public class ControlesAvanzadosTermostato extends JFrame {

	public ControlesAvanzadosTermostato () {
		super("Velocidad de crucero");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		 // SLIDER CRUCERO
		JSlider sldCrucero = new JSlider(JSlider.HORIZONTAL);
		sldCrucero.setPreferredSize(new Dimension(290, 80));
		sldCrucero.setMinimum(10);
		sldCrucero.setMaximum(120);
		sldCrucero.setValue(90);
		sldCrucero.setMajorTickSpacing(20);
		sldCrucero.setMinorTickSpacing(5);
		sldCrucero.setPaintTicks(true);
		sldCrucero.setPaintLabels(true);
		
		
		add(sldCrucero);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ControlesAvanzadosTermostato ventana = new ControlesAvanzadosTermostato();

	}

}
