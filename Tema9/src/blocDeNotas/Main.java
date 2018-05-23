package blocDeNotas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main extends JFrame {

	private JList lstTitulos;
	private DefaultListModel modeloLista;
	private JTextField txtTitulo;
	private JTextArea txtDescripcion;
	private JButton btnGuardar;

	public static void main(String[] args) {
		new Main();
	}

	public Main() {

		super("Bloc de notas");
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		modeloLista = new DefaultListModel<String>();

		// MENÚ.
		JMenuBar barraMenu = new JMenuBar();

		JMenuItem itemNuevaNota = new JMenuItem("Nueva nota");
		JMenuItem itemBorrarNota = new JMenuItem("Borrar nota");
		JMenuItem itemSalir = new JMenuItem("Salir");

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemNuevaNota);
		menuArchivo.addSeparator();
		menuArchivo.add(itemBorrarNota);
		menuArchivo.addSeparator();
		menuArchivo.add(itemSalir);

		barraMenu.add(menuArchivo);

		setJMenuBar(barraMenu);

		// PANEL CENTRAL-IZQUIERDO.
		JPanel panelIzquierdo = new JPanel();

		JLabel lblNota = new JLabel("Notas");

		lstTitulos = new JList(modeloLista);
		
		JScrollPane panelTitulos = new JScrollPane(lstTitulos);
		panelTitulos.setPreferredSize(new Dimension(280, 320));
		panelTitulos.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		panelIzquierdo.add(lblNota);
		panelIzquierdo.add(panelTitulos);

		panelIzquierdo.setBorder(new EmptyBorder(5, 5, 0, 0));

		// PANEL CENTRAL-DERECHO.
		JPanel panelDerecho = new JPanel();

		JLabel lblTitulo = new JLabel("Título");
		txtTitulo = new JTextField();
		txtTitulo.setPreferredSize(new Dimension(280, 25));

		JLabel lblDescripcion = new JLabel("Descripción");
		txtDescripcion = new JTextArea();
		txtDescripcion.setPreferredSize(new Dimension(280, 269));
		txtDescripcion.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setWrapStyleWord(true);

		panelDerecho.add(lblTitulo);
		panelDerecho.add(txtTitulo);
		panelDerecho.add(lblDescripcion);
		panelDerecho.add(txtDescripcion);

		panelDerecho.setBorder(new EmptyBorder(5, 0, 0, 0));

		// PANEL CENTRAL-COMPLETO.
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new GridLayout(1, 2));

		panelCentral.add(panelIzquierdo);
		panelCentral.add(panelDerecho);

		// PANEL INFERIOR.
		JPanel panelInferior = new JPanel();
		panelInferior.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnGuardar = new JButton("Guardar");
		btnGuardar.setEnabled(false);

		panelInferior.add(btnGuardar);

		// VENTANA COMPLETA
		add(panelCentral, BorderLayout.CENTER);
		add(panelInferior, BorderLayout.SOUTH);

		setVisible(true);
	}

}