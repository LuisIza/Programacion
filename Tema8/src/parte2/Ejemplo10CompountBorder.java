
package parte2;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class Ejemplo10CompountBorder extends JFrame {

	public Ejemplo10CompountBorder () {
		super("Titulo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		JPanel pnlTitulo = (JPanel) this.getContentPane();
		Border borde1 = BorderFactory.createTitledBorder("Datos de usuario");
		Border borde2 = BorderFactory.createLineBorder(new Color(204, 150, 0),2,true);
		Border borde3 = BorderFactory.createEmptyBorder(10,10,0,0);
		CompoundBorder bc = BorderFactory.createCompoundBorder(borde3,borde1);
		
		pnlTitulo.setBorder(BorderFactory.createCompoundBorder(bc,borde2));
		JLabel lblNombre = new JLabel("Apellidos");
		JTextField txtApellido = new JTextField(15);
		JButton btnAceptar = new JButton("Aceptar");
		
		
		
		add(lblNombre);
		add(txtApellido);
		add(btnAceptar);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo10CompountBorder ventana = new Ejemplo10CompountBorder();

	}

}
