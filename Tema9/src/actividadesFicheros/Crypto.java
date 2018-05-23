package actividadesFicheros;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Crypto extends JFrame {

	private JLabel lblArchivo = new JLabel("Crypto");
	private JTextField txtArchivo = new JTextField();

	private JButton btnEncriptar = new JButton("Encriptar");
	private JButton btnDesencriptar = new JButton("Desencriptar");

	private JTextArea txtMuestra = new JTextArea(10, 16);

	/**
	 * Configura la ventana de la aplicación.
	 */
	public Crypto() {

		super("Crypto");
		setSize(230, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		txtMuestra.setLineWrap(true);
		txtMuestra.setWrapStyleWord(true);

		JScrollPane scrMostrar = new JScrollPane(txtMuestra);

		txtArchivo.setPreferredSize(new Dimension(180, 25));

		btnEncriptar.setPreferredSize(new Dimension(180, 25));
		btnDesencriptar.setPreferredSize(new Dimension(180, 25));

		btnEncriptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				encriptar();
			}
		});

		btnDesencriptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				desencriptar();
			}
		});

		add(lblArchivo);
		add(txtArchivo);
		add(btnEncriptar);
		add(btnDesencriptar);
		add(scrMostrar);

		setVisible(true);

	}

	/**
	 * Abre el archivo que ha indicado el usuario en el formulario y hace una copia
	 * encriptada.
	 */
	private void encriptar() {

		// Comprobamos que el usuario haya escrito algo en la casilla del nombre de
		// achivo.
		if (txtArchivo.getText().equals("")) {
			return;
		}

		// Limpiamos el TextArea.
		txtMuestra.setText("");

		try {

			FileInputStream entrada = new FileInputStream("ficheros/" + txtArchivo.getText());
			FileOutputStream salida = new FileOutputStream("ficheros/" + nombreCopia(txtArchivo.getText()));

			boolean eof = false;
			int byteLeido = 0;
			while (!eof) {
				byteLeido = entrada.read();
				if (byteLeido == -1) {
					eof = true;
				} else {
					salida.write(codificaByte(byteLeido));
				}
			}

			entrada.close();
			salida.close();

		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(null, "Error de E/S", "Error crítico.", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Abre el archivo que ha indicado el usuario en el formulario y lo desencripta.
	 * Si el archivo es .txt, además muestra el contenido desencriptado en en el
	 * TextArea. Si no, hace una copia desencriptada.
	 */
	private void desencriptar() {

		// Comprobamos que el usuario haya escrito algo en la casilla del nombre de
		// achivo.
		if (txtArchivo.getText().equals("")) {
			return;
		}

		// Limpiamos el TextArea.
		txtMuestra.setText("");

		try {

			boolean eof = false;
			int byteLeido = 0;

			FileInputStream entrada = new FileInputStream("ficheros/" + txtArchivo.getText());

			// Preguntamos qué nombre quiere darse al archivo.
			String nombreArchivoDesencriptado = JOptionPane.showInputDialog(null,
					"¿Con qué nombre desea guardar la copia " + "desencriptada?", "Archivo binario",
					JOptionPane.QUESTION_MESSAGE);

			/*
			 * TODO: Ahora el método debería terminar si el usuario no ha escrito ningún
			 * nombre o ha cancelado.
			 */

			FileOutputStream salida = new FileOutputStream("ficheros/" + nombreArchivoDesencriptado);

			while (!eof) {

				byteLeido = entrada.read();

				if (byteLeido == -1) {
					eof = true;
				} else {
					salida.write(deCodificaByte(byteLeido));
				}
			}

			/*
			 * TODO: Rellenar el TextArea (un mensaje indicando que se ha decodificado el
			 * archivo o, si el archivo es un .txt, el contenido del propio archivo).
			 */

			salida.close();
			entrada.close();

		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(null, "Error de E/S", "Error crítico.", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Muestra en el TextArea de la ventana el contenido de un archivo de texto
	 * plano.
	 */
	private void mostrarContenido(String rutaArchivo) {
		// TODO: Rellenar este método.
	}

	/**
	 * Devuelve el nombre que tendrá el archivo encriptado.
	 * 
	 * @param nombreOriginal
	 *            Nombre del archivo que se va a encriptar.
	 * @return El nuevo nombre, donde se ha intercalado la palabra "_enc".
	 */
	private String nombreCopia(String nombreOriginal) {

		// Posición del punto antes de la extensión.
		int posPunto = nombreOriginal.lastIndexOf(".");

		// Nombre del archivo quitándole la extensión.
		String nombreSinExtension = nombreOriginal.substring(0, posPunto);
		nombreSinExtension = nombreSinExtension + "_enc";

		// Extensión del archivo (incluye el punto).
		String extension = nombreOriginal.substring(posPunto, nombreOriginal.length());

		// Nombre nuevo.
		return nombreSinExtension + extension;

	}

	/**
	 * Comprueba si una cadena de texto (nombre de un archivo) termina en .txt.
	 * 
	 * @param nombreArchivo
	 *            Nombre del archivo.
	 * @return True si el nombre acaba en .txt y false en caso contrario.
	 */
	private boolean esTxt(String nombreArchivo) {

		int posPunto = nombreArchivo.lastIndexOf(".");
		String extension = nombreArchivo.substring(posPunto, nombreArchivo.length());

		if (extension.equals(".txt")) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Transforma un byte sumándole 1.
	 * 
	 * @param byteLeido
	 *            Byte que hemos leído del disco y queremos transformar sumándole 1.
	 * @return El byte leído más uno. Si el byte era 255, devuelve 0.
	 */
	private int codificaByte(int byteLeido) {

		// TODO: Rellenar este método.
		return 0;
	}

	/**
	 * Transforma un byte restándole 1.
	 * 
	 * @param byteLeido
	 *            Byte que hemos leído del disco y queremos transformar restándole
	 *            1.
	 * @return El byte leído menos uno. Si el byte era 0, devuelve 255.
	 */
	private int deCodificaByte(int byteLeido) {

		// TODO: Rellenar este método.
		return 0;

	}

	public static void main(String[] args) {

		Crypto ventana = new Crypto();

	}

}