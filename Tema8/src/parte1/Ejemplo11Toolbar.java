package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo11Toolbar extends JFrame {

	public Ejemplo11Toolbar () {
		super("Barra de herramientas");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new BorderLayout());
		// CREAR BARRA DE HERRAMIENTAS
		ImageIcon icnNuevo = new ImageIcon("Iconos/1.png");
		ImageIcon icnAbrir = new ImageIcon("Iconos/52.png");
		ImageIcon icnGuardar = new ImageIcon("Iconos/22.png");
		ImageIcon icnImprimir = new ImageIcon("Iconos/16.png");
		ImageIcon icnSalir = new ImageIcon("Iconos/33.png");
		
		JButton btnNuevo = new JButton(icnNuevo);
		JButton btnAbrir = new JButton(icnAbrir);
		JButton btnGuardar = new JButton(icnGuardar);
		JButton btnImprimir = new JButton(icnImprimir);
		JButton btnSalir = new JButton(icnSalir);
		
		JToolBar barra = new JToolBar();
		barra.add(btnNuevo);
		barra.add(btnAbrir);
		barra.add(btnGuardar);
		barra.add(btnImprimir);
		barra.addSeparator();
		barra.add(btnSalir);
		
		//CREAR TEXTAREA
		JTextArea txtCuadro = new JTextArea(10,10);
		JScrollPane panelCuadro = new JScrollPane(txtCuadro);
		
		// RESTO DE LAS VENTANAS
		add(barra, BorderLayout.NORTH);
		add(panelCuadro, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo11Toolbar ventana = new Ejemplo11Toolbar();

	}

}
