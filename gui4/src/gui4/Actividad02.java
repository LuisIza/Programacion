package gui4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author LuisIza
 *
 */
public class Actividad02 extends JFrame implements ItemListener {
	private JLabel lblVisor;
	private JComboBox<String> cmbCurso;
	
	public Actividad02() {

		super("Matícula");
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		String [] cursos = {"Selecciona un curso","1º ESO","2º ESO","3º ESO","4º ESO"};
		
		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(19);
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(19);
		JLabel lblCurso = new JLabel("Curso");
		
		cmbCurso = new JComboBox<>(cursos);
		cmbCurso.addItemListener(this);

		lblVisor = new JLabel("");
		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCurso);
		add(lblVisor);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Actividad02 ventana = new Actividad02();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String [] cursos = {"","1º ESO","2º ESO","3º ESO","4º ESO"};
		JComboBox<String> cmb1 = (JComboBox<String>)e.getSource();
		int pos = cmb1.getSelectedIndex();
		if (pos==0) {
			lblVisor.setText("" );
		}else {
		lblVisor.setText("Curso: " + cursos[pos]);}
		
	}

}