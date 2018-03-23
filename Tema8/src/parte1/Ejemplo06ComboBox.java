package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo06ComboBox extends JFrame {

	public Ejemplo06ComboBox () {
		super("Meses del año");
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		JComboBox <String>cmbMeses = new JComboBox<>();
		
		cmbMeses.addItem("Enero");
		cmbMeses.addItem("Febrero");
		cmbMeses.addItem("Marzo");
		cmbMeses.addItem("Abril");
		cmbMeses.addItem("Mayo");
		cmbMeses.addItem("Junio");
		cmbMeses.addItem("Julio");
		cmbMeses.addItem("Agosto");
		cmbMeses.addItem("Septiembre");
		cmbMeses.addItem("Octubre");
		cmbMeses.addItem("Noviembre");
		cmbMeses.addItem("Diciembre");
		cmbMeses.setPreferredSize(new Dimension (240,30));
		
		JLabel lblmes = new JLabel("Elige tu mes de nacimiento");
		
		add(lblmes);
		add(cmbMeses);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo06ComboBox ventana = new Ejemplo06ComboBox();

	}

}
