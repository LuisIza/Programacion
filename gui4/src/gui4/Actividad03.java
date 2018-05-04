
package gui4;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author LuisIza
 *
 */
public class Actividad03 extends JFrame  {
	private JLabel lblTotal;
	private JCheckBox cb1,cb2,cb3,cb4;
	private int total = 120;
	
	public Actividad03() {

		super("Viajes Gorrión");
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		JLabel lblOpciones = new JLabel("Opciones:");
		lblOpciones.setPreferredSize(new Dimension(200, 25));
		
		lblTotal = new JLabel("Precio total: ");
		lblTotal.setPreferredSize(new Dimension(200, 25));
		
		cb1 = new JCheckBox("Billetes de avión",true);
		lblTotal.setText("Precio total:  " + total + " €");
		
		cb1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb1.isSelected()) {
					total=total+120;
				}else {
					total=total-120;
				}
				lblTotal.setText("Precio total:  " + total + " €");
			}
		});
		
		cb2 = new JCheckBox("Transporte aereopuerto");
		cb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb2.isSelected()) {
					total=total+40;
				}else {
					total=total-40;
				}
				lblTotal.setText("Precio total:  " + total + " €");
			}
		});
		
		cb3 = new JCheckBox("Estancia en el hotel");
		cb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb3.isSelected()) {
					total=total+180;
				}else {
					total=total-180;
				}
				lblTotal.setText("Precio total:  " + total + " €");
				
			}
		});
		
		cb4 = new JCheckBox("Pensión completa");
		cb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cb4.isSelected()) {
					total=total+70;
				}else {
					total=total-70;
				}
				lblTotal.setText("Precio total:  " + total + " €");
				
			}
		});
		
		add(lblOpciones);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(lblTotal);
		setVisible(true);

	}

	public static void main(String[] args) {
		Actividad03 ventana = new Actividad03();
	}

	

}