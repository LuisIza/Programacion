
package parte3;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class Ejemplo01 extends JFrame implements FocusListener{
	
	private JTextField  txtNum1;
	private JTextField  txtNum2;
	private JTextField  txtNum3;
	private JLabel lblMedia;
	private double promedio;
	
	public Ejemplo01 () {
		super("Promedios");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.CENTER,30,20));
		
		txtNum1 = new JTextField ("0",5);
		txtNum2 = new JTextField ("0",5);
		txtNum3 = new JTextField ("0",5);
		lblMedia = new JLabel("La media es " + promedio);
		
		txtNum1.addFocusListener(this);
		txtNum2.addFocusListener(this);
		txtNum3.addFocusListener(this);
		
		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblMedia);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo01 ventana = new Ejemplo01();

	}

	@Override
	public void focusGained(FocusEvent e) {
		//Leemos valores y los convertimos a double
	
		
	try {	
		double num1  = Double.parseDouble(txtNum1.getText());
		double num2  = Double.parseDouble(txtNum2.getText());
		double num3  = Double.parseDouble(txtNum3.getText());
		promedio = (num1+num2+num3)/3;
		
		lblMedia.setText("La media es " +(double)Math.round(promedio*100)/100);
		
	}catch (Exception ex) {
		lblMedia.setText("Error de entrada");
	}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

}
