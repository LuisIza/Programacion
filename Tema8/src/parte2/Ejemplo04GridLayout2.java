
package parte2;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Ejemplo04GridLayout2 extends JFrame {

	public Ejemplo04GridLayout2 () {
		super("Dificultad");
		setSize(150,240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new GridLayout(2, 1));
		
		JPanel pnlDatos = new JPanel();
		pnlDatos.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblopciones = new  JLabel ("Opciones           ");
		JRadioButton rb1 = new JRadioButton("Fácil            ");
		JRadioButton rb2 = new JRadioButton("Normal           ",true);
		JRadioButton rb3 = new JRadioButton("Imposoble        ");
		//pnlDatos.setBackground(Color.BLUE);
		pnlDatos.setBorder(BorderFactory.createLineBorder(Color.black));
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rb1);
		grupo.add(rb2);
		grupo.add(rb3);
		pnlDatos.add(lblopciones);
		pnlDatos.add(rb1);
		pnlDatos.add(rb2);
		pnlDatos.add(rb3);
		
		JPanel pnlBotones = new JPanel();
		JButton btn1 = new JButton("<< Anterior  ");
		
		JButton btn2 = new JButton("Siguiente >>");
		pnlBotones.setBorder(BorderFactory.createLineBorder(Color.black));
		
		pnlBotones.add(btn1);
		pnlBotones.add(btn2);
		
		add(pnlDatos);
		add(pnlBotones);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ejemplo04GridLayout2 ventana = new Ejemplo04GridLayout2();

	}

}
