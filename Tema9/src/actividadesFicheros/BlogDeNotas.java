package actividadesFicheros;


import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Luis Iza
 *
 */
public class BlogDeNotas extends JFrame {
		
	private DefaultListModel<String> modLista;
	JScrollPane scrLista;
	JScrollPane srcBlog;
	JTextArea txtBlog;
	
	public BlogDeNotas () {
		super("Bloc de notas");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuItem nuevaNota = new JMenuItem("Nueva nota");
		JMenuItem borrarNota = new JMenuItem("Borrar nota");
		JMenuItem salir = new JMenuItem("Salir");
		
		JMenu menu = new JMenu("Archivo");
		menu.add(nuevaNota);
		menu.add(borrarNota);
		menu.add(salir);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menu);
		
		// Panel boton
		JPanel pnlBoton = new JPanel();
		JButton btnGuardar = new JButton("Guardar");
		pnlBoton.setPreferredSize(new Dimension(500, 50));
		pnlBoton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnlBoton.add(btnGuardar);
		
		JPanel pnlIzq = new JPanel();
		JPanel pnlDerc = new JPanel();
		
		// Panel central
		JPanel pnlVentanas = new JPanel();
		pnlVentanas.setPreferredSize(new Dimension(500, 400));
		pnlVentanas.setLayout(new GridLayout(1, 2, 5, 5));
		pnlVentanas.add(pnlIzq);
		pnlVentanas.add(pnlDerc);
		
		
		JLabel lblNotas = new JLabel("Notas");
		modLista = new DefaultListModel<>();
		JList<String> lstNotas = new JList<>(modLista);
		scrLista = new JScrollPane(lstNotas);
		scrLista.setPreferredSize(new Dimension(225, 360));
		
		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(20);
		JLabel lblDescripcion = new JLabel("Descripción");
		txtBlog = new JTextArea();
		
		srcBlog = new JScrollPane(txtBlog);
		srcBlog.setPreferredSize(new Dimension(225, 315));
		
		pnlDerc.add(lblTitulo);
		pnlDerc.add(txtTitulo);
		pnlDerc.add(lblDescripcion);
		pnlDerc.add(srcBlog);
		
		
		pnlIzq.add(lblNotas);
		pnlIzq.add(scrLista);
		
		add(pnlVentanas, BorderLayout.NORTH);
		add(pnlBoton);
		setJMenuBar(barraMenu);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BlogDeNotas ventana = new BlogDeNotas();

	}

}
