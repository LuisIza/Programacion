package parte1;
import java.awt.*;
import javax.swing.*;

public class ControlesAvanzadosComentarios extends JFrame {

	public ControlesAvanzadosComentarios () {
		super("Comentarios");
		setSize(300,220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		JTextArea txtr1 = new JTextArea("En un lugar de la Mancha, de cuyo nombre",10,80);

		JScrollPane scrPanel = new JScrollPane(txtr1);
		scrPanel.setPreferredSize(new Dimension(250,150));
		
		add(new JLabel("Deja un comentario"));
		add(scrPanel);
		add(new JButton("Enviar"));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ControlesAvanzadosComentarios ventana = new ControlesAvanzadosComentarios();

	}

}
