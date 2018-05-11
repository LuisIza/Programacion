import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
 /*
  * Metodo encriptar () que lea un archivo y haga copia sumando 1 a cada byte leido.
  * Metodo desencriptar () que lea un archivo codificado y lo muestre en un textarea desencriptado.
  */
public class Ejercicio01 extends JFrame {
	
	private JTextField txtArchivo;
	private JPanel pnlVisor;
	private static JTextArea txtVisor;
	private static String nombreArchivo;	
	private static String copiaArchivo;
	private static int opcion;
	private ImageIcon fondo;
	private static JLabel lblFondo;
	
	public Ejercicio01 () {
		super("Encriptar");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.CENTER,30,20));
		
		JLabel lblArchivo = new JLabel ("Archivo");
		txtVisor = new JTextArea();
		txtVisor.setLineWrap(true);
		txtVisor.setVisible(false);
		txtVisor.setPreferredSize(new Dimension(370, 390));
		
		txtArchivo = new JTextField(30);
		
		fondo = new ImageIcon("");
		lblFondo = new JLabel(fondo);
		lblFondo.setVisible(false);
		
		
		
		pnlVisor = new JPanel();
		pnlVisor.setPreferredSize(new Dimension(380, 400));
		pnlVisor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlVisor.add(txtVisor);
		pnlVisor.add(lblFondo);
		
		JButton btnEncriptar = new JButton("Encriptar");
		btnEncriptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				nombreArchivo = "ficheros/"+txtArchivo.getText();
				copiaArchivo = "ficheros/"+nombreCopia(txtArchivo.getText());
				
				encriptarArchivo();
				txtVisor.setVisible(true);
				
			}
		});
		
		
		JButton btnDesencriptar = new JButton("Desencriptar");
		btnDesencriptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nombreArchivo = "ficheros/"+txtArchivo.getText();
				String tipo []= {"Imagen", "Texto"};
				opcion =  JOptionPane.showOptionDialog(null, "Tipo de archivo?", "Archivo", 0, JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);
				System.out.println(opcion);
				abrirArchivo();
				
			}
		});
		
		
		
		add(lblArchivo);
		add(txtArchivo);
		add(btnEncriptar);
		add(btnDesencriptar);
		add(pnlVisor);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		
		Ejercicio01 ventana = new Ejercicio01();
		
		//abrirArchivo();
			
		}

	
	private String nombreCopia (String nombre) {
		int posPunto = nombre.lastIndexOf(".");
		String nombreNuevo = nombre.substring(0, posPunto);
		return nombreNuevo+"_copia"+nombre.substring(posPunto,nombre.length());
	}
	
	

	private static void abrirArchivo() {
		try {
			FileInputStream archivo = new FileInputStream(nombreArchivo);
			BufferedInputStream buffer = new BufferedInputStream(archivo);
			boolean eof = false;
			int byteLeido = 0;
			char caracter;
			String mensaje = "";
			if (opcion == 1) {
				txtVisor.setVisible(true);
				
				
			while (!eof) {
				byteLeido=buffer.read();
				
				if (byteLeido == -1) {
					eof = true;
				}else {
					caracter = (char)(byteLeido-1);
					mensaje = mensaje + caracter;
					txtVisor.setText(mensaje);
				}
			}
			
			} else {
				lblFondo.setVisible(true);
				while (!eof) {
					byteLeido=buffer.read();
					
					if (byteLeido == -1) {
						eof = true;
					}else {
						caracter = (char)(byteLeido-1);
						mensaje = mensaje + caracter;
						txtVisor.setText(mensaje);
					}
				
			}
			}
			buffer.close();
			
			}catch(IOException e) {
				System.out.println("Error : ");
				e.printStackTrace();
			}
	}
	
	private static void encriptarArchivo() {
		
		try {
			// archivo de entrada
			FileInputStream entrada = new FileInputStream(nombreArchivo);
			BufferedInputStream bufferEntrada = new BufferedInputStream(entrada);
			
			// archivo de salida
			FileOutputStream salida = new FileOutputStream(copiaArchivo,true);
			BufferedOutputStream bufferSalida = new BufferedOutputStream(salida);
			
			//leer archivo byte a byte
			boolean eof = false;
			int byteLeido=0;
			
			while (!eof) {
				byteLeido = bufferEntrada.read();
				if (byteLeido == -1) {
					eof=true;
				}else {
					bufferSalida.write(byteLeido+1);
				}
			}
			txtVisor.setText("Archivo guardado correctamente: \n" + copiaArchivo);
			//System.out.println("Archivo copiado...");
			
			bufferEntrada.close();
			bufferSalida.close();
		
		}catch (IOException e) {
			txtVisor.setText("ERROR ARCHIVO NO EXISTE \n" + copiaArchivo);
			System.out.println("Error de I/O: " + e.getMessage() );
		}
	}

	

}
