

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
/**
 * 
 * @author Luis Iza
 *
 */
public class Ejemplo13JFileChooser extends JFrame implements ActionListener{
	
	private JButton btnAbrir, btnGuardar;
	private File archivo;
	

	public Ejemplo13JFileChooser () {
		super("Titulo");
		//setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(this);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		
		add(btnAbrir);
		add(btnGuardar);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo13JFileChooser ventana = new Ejemplo13JFileChooser();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnAbrir) {
			abrir();
		}else {
			guardar();
		}
		
	}

	/**
	 * Muestra una ventana para que el usuario elija
	 * que archivo quiere abrir
	 */
	private void abrir() {
		
		JFileChooser eleccionArchivo = new JFileChooser();
		int respuesta = eleccionArchivo.showOpenDialog(null);
		
		if (respuesta == JFileChooser.APPROVE_OPTION){
			archivo = eleccionArchivo.getSelectedFile();
			JOptionPane.showMessageDialog(null, "Has elegido" + archivo, "File Chooser", JOptionPane.INFORMATION_MESSAGE);
		}else {
			archivo = eleccionArchivo.getSelectedFile();
			JOptionPane.showMessageDialog(null, "Has cancelado sin elegir nada","File Chooser", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	
	/**
	 * Muestra una ventana para que el usuario elija
	 * que archivo quiere guardar
	 */

	private void guardar() {
		JFileChooser arcGuardar = new JFileChooser();
		int respuesta = arcGuardar.showSaveDialog(null);
		
		if (respuesta == JFileChooser.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Has cancelado","File Chooser", JOptionPane.INFORMATION_MESSAGE);
		}else {
			archivo = arcGuardar.getSelectedFile();
			JOptionPane.showMessageDialog(null, "Archivo guardado","File Chooser", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
	}

}
