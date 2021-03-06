
package parte2;
import java.awt.*;
import javax.swing.*;

public class Ejemplo09TitleBorder extends JFrame {

	public Ejemplo09TitleBorder () {
		super("Titulo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		JPanel pnlTitulo = (JPanel) this.getContentPane();
		
		pnlTitulo.setBorder(BorderFactory.createTitledBorder("Datos de usuario"));
		
		
		JLabel lblNombre = new JLabel("Apellidos");
		JTextField txtApellido = new JTextField(15);
		JButton btnAceptar = new JButton("Aceptar");
		
		
		
		add(lblNombre);
		add(txtApellido);
		add(btnAceptar);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo09TitleBorder ventana = new Ejemplo09TitleBorder();

	}

}
