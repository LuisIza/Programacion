package parte1;

import javax.swing.*;

public class Ejemplo01 extends JFrame {
	public Ejemplo01() {
		super("Hola, Mundo");
		setSize(350, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] arguments) {
		Ejemplo01 ventana = new Ejemplo01();
	}

}
