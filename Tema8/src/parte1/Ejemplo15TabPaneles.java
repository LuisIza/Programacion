
package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo15TabPaneles extends JFrame {

	public Ejemplo15TabPaneles () {
		super("Titulo");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		//Cambio de look and feel.
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					SwingUtilities.updateComponentTreeUI(this);
				} catch (Exception e) {
				
					System.out.println("Error Look");
				}
		
		//Panel de clientes
		JPanel panelClientes = new JPanel();
		JLabel lblMensaje = new JLabel("Este el panel de Clientes");
		panelClientes.add(lblMensaje);
		ImageIcon imgCliente = new ImageIcon("Iconos/assets/red_dark/mdpi/ic_action_users.png");
		
		//Panel de empleados
				JPanel panelEmpleados = new JPanel();
				JLabel lblMensaje1 = new JLabel("Este el panel de Empleados");
				panelEmpleados.add(lblMensaje1);
				ImageIcon imgEmpleado = new ImageIcon("Iconos/assets/red_dark/mdpi/ic_action_mouse.png");

		//Panle de pestañas
		JTabbedPane panelon = new JTabbedPane ();
		panelon.addTab("Clientes",imgCliente,panelClientes);
		panelon.addTab("Empleados",imgEmpleado,panelEmpleados);
		panelon.setPreferredSize(new Dimension(390, 190));
		add(panelon);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo15TabPaneles ventana = new Ejemplo15TabPaneles();

	}

}
