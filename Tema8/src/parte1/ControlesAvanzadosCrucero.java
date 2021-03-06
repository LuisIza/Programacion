
package parte1;
import java.awt.*;
import javax.swing.*;

public class ControlesAvanzadosCrucero extends JFrame {

	public ControlesAvanzadosCrucero () {
		super("Termostato");
		setSize(250,260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		JLabel lblTermostato = new JLabel("Temperatura (ºC)");
		
		JSlider sldTermostato = new JSlider(JSlider.VERTICAL);
		sldTermostato.setPreferredSize(new Dimension(70, 240));
		sldTermostato.setMinimum(0);
		sldTermostato.setMaximum(25);
		sldTermostato.setValue(17);
		sldTermostato.setMajorTickSpacing(5);
		sldTermostato.setMinorTickSpacing(1);
		sldTermostato.setPaintTicks(true);
		sldTermostato.setPaintLabels(true);
		
		
		add(sldTermostato);
		add(lblTermostato);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ControlesAvanzadosCrucero ventana = new ControlesAvanzadosCrucero();

	}

}
