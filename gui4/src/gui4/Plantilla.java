
package gui4;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Plantilla extends JFrame {
	private int r,g,b;
	
	public Plantilla () {
		super("Paleta");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		JLabel lblRojo = new JLabel("Rojo");
		JLabel lblVerde = new JLabel("Verde");
		JLabel lblAzul = new JLabel("Azul");
		r=50;
		g=50;
		b=50;
		
		JButton btnColor = new JButton();
		btnColor.setPreferredSize(new Dimension(100, 30));
		btnColor.setBackground(new Color(r,g,b));
		
		JSlider sldRojo = new JSlider(JSlider.HORIZONTAL);
		sldRojo.setPreferredSize(new Dimension(280, 50));
		sldRojo.setMinimum(0);
		sldRojo.setMaximum(250);
		sldRojo.setValue(100);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		
		sldRojo.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				r= sldRojo.getValue();
				btnColor.setBackground(new Color(r,g,b));
			}
		});
		
		JSlider sldVerde = new JSlider(JSlider.HORIZONTAL);
		sldVerde.setPreferredSize(new Dimension(280, 50));
		sldVerde.setMinimum(0);
		sldVerde.setMaximum(250);
		sldVerde.setValue(100);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		
		sldVerde.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				g= sldVerde.getValue();
				btnColor.setBackground(new Color(r,g,b));
			}
		});
		
		JSlider sldAzul = new JSlider(JSlider.HORIZONTAL);
		sldAzul.setPreferredSize(new Dimension(280, 50));
		sldAzul.setMinimum(0);
		sldAzul.setMaximum(250);
		sldAzul.setValue(100);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		
		sldAzul.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				b= sldAzul.getValue();
				btnColor.setBackground(new Color(r,g,b));
				
			}
		});
		
		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Plantilla ventana = new Plantilla();

	}

}
