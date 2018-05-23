package actividadesFicheros;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 * @author Luis Iza
 *
 */

public class HallOfFame extends JFrame{
	
	private JTextArea txtVisor ;
	private static JList<String> lisVisor;
	private static DefaultListModel modelo ;
	
	public  HallOfFame () {
		super("Puntuaciones");
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		JLabel lblTitulo = new JLabel("*** Hall of Fame ***");
		modelo = new DefaultListModel<>();
		lisVisor = new JList<>(modelo);
		lisVisor.setBorder(BorderFactory.createLineBorder(Color.black));	
		JScrollPane srcVisor = new JScrollPane(lisVisor);
		srcVisor.setPreferredSize(new Dimension(280,380));
		
		JButton btNuevo = new JButton("Nuevo");
		btNuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane option = new JOptionPane();
				
				String nombre = option.showInputDialog(null,"¿Nombre del jugador?");
				
				String puntuacion = JOptionPane.showInputDialog(null,"¿Puntuacion del jugador?");	
				if (nombre == null || puntuacion == null) {
					JOptionPane.showMessageDialog(null, "No se ha guardado ningun jugador","Jugador", JOptionPane.INFORMATION_MESSAGE);
				}else {
				addJugador(nombre,puntuacion);
				}
			}
		});
		
		
		JButton btBorrar = new JButton("Borrar");
		btBorrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int borrar = JOptionPane.showConfirmDialog(null, "Seguro que quieres borrar todos los datos de jugadores?",
						"Advertencia", JOptionPane.OK_CANCEL_OPTION);
								
				if (borrar == 0) {
					borraArchivo();
					leeJugadores();	}
			}
		});
		
		add(lblTitulo);
		add(srcVisor);
		add(btNuevo);
		add(btBorrar);
	
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		HallOfFame ventana = new HallOfFame();
		leeJugadores();	
		
	}
	
	public static void  addJugador(String nombre, String puntuacion) {
		
		try {
			FileWriter archivo = new FileWriter("ficheros/jugadores.txt",true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			buffer.newLine();
			if (!nombre.equals("")&& !puntuacion.equals("")) {
				buffer.write(nombre+","+puntuacion);
				modelo.addElement(nombre + " ··· " + puntuacion);
			}
			
			buffer.close();
		
		} catch (IOException e) {
			System.out.println("Error Archivo no existe");
			e.printStackTrace();
		}
	}
	
	public static void leeJugadores() {
		try {
			FileReader archivo = new FileReader("ficheros/jugadores.txt");
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea;
			modelo.clear();
			
			while (!eof) {
				linea = buffer.readLine();
				
				if (linea == null) {
					eof=true;
				}else {
					if (linea.length()>0) {
					String textos[] = linea.split(",");
						modelo.addElement(textos[0] + " ··· " + textos[1]);}
				}
			
			}
			
			buffer.close();
			
		} catch (IOException e) {
			System.out.println("El archivo jugadores no Existe... y se ha creado");
			addJugador("","");
			//e.printStackTrace();
		}
	}
	
	public void borraArchivo() {
		try {
			FileWriter archivo = new FileWriter("ficheros/jugadores.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);
			buffer.close();
		
		} catch (IOException e) {
			System.out.println("Error Archivo no existe");
			e.printStackTrace();
		}
	}
		

}
