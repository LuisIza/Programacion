package parte1;
import java.awt.*;
import javax.swing.*;

public class Ejemplo12Listas extends JFrame {

	public Ejemplo12Listas () {
		super("Lista de valores");
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		JLabel lblMensaje = new JLabel ("    Elija versión de Windows:       ");
		String versiones[] = {"Windows XP", "Windows Vista","Windows 7","Windows 8", "Windows 10"};
		JList<String> lista = new JList<>(versiones);
		JScrollPane paneLista = new JScrollPane(lista);
		paneLista.setPreferredSize(new Dimension(200, 100));
		
		JButton btnNext = new JButton("Siguiente");
		btnNext.setPreferredSize(new Dimension(200, 25));
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setPreferredSize(new Dimension(200, 25));
		
		add(lblMensaje);
		add(paneLista);
		add(btnNext);
		add(btnCancel);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo12Listas ventana = new Ejemplo12Listas();

	}

}
