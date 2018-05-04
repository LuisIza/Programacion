package gui4;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * 
 * @author LuisIza
 *
 */
public class Actividad01 extends JFrame {

		
	public Actividad01() {

		super("Fotogramas");
		setSize(600, 590);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		
		ImageIcon img= new ImageIcon("imgs/img.jpg");
		ImageIcon img1= new ImageIcon("imgs/img1.jpg");
		ImageIcon img2= new ImageIcon("imgs/img2.jpg");
		ImageIcon img3= new ImageIcon("imgs/img3.jpg");
		ImageIcon img4= new ImageIcon("imgs/img4.jpg");
		
		JPanel pnlVisor = new JPanel();
		JLabel lblVisor = new JLabel();
		lblVisor.setIcon(img);
		
		pnlVisor.add(lblVisor);
		JPanel pnlBotones = new JPanel();
		
		JButton btn1 = new JButton("Black rain");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblVisor.setIcon(img1);
				
			}
		});
		JButton btn2 = new JButton("El caso Winslow");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblVisor.setIcon(img2);
				
			}
		});
		JButton btn3 = new JButton("Asalto al distrito 13");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblVisor.setIcon(img3);
				
			}
		});
		JButton btn4 = new JButton("Blade runner");
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblVisor.setIcon(img4);
				
			}
		});
		
		pnlBotones.add(btn1);
		pnlBotones.add(btn2);
		pnlBotones.add(btn3);
		pnlBotones.add(btn4);

		
		add(pnlBotones, BorderLayout.NORTH);
		add(pnlVisor);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Actividad01 ventana = new Actividad01();
	}

}