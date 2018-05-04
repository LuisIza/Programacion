
package gui4;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 * 
 * @author LuisIza
 *
 */


public class Actividad04 extends JFrame {
    private int r,g,b;
    private JTextField txtCodigo;
    
    
    public Actividad04 () {
        super("Paleta");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout ());
        JLabel lblRojo = new JLabel("Rojo");
        JLabel lblVerde = new JLabel("Verde");
        JLabel lblAzul = new JLabel("Azul");
        r=50;
        g=50;
        b=50;
        
        JButton btnColor = new JButton();
        btnColor.setPreferredSize(new Dimension(100, 30));
        btnColor.setBackground(new Color(r,g,b));
        
        txtCodigo = new JTextField(10);
        txtCodigo.setPreferredSize(new Dimension(100, 30));
        actualiza();
        
        JSlider sldRojo = new JSlider(JSlider.HORIZONTAL);
        sldRojo.setPreferredSize(new Dimension(280, 50));
        sldRojo.setMinimum(0);
        sldRojo.setMaximum(255);
        sldRojo.setValue(100);
        sldRojo.setMajorTickSpacing(50);
        sldRojo.setMinorTickSpacing(25);
        sldRojo.setPaintTicks(true);
        sldRojo.setPaintLabels(true);
        
        sldRojo.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent e) {
                r= sldRojo.getValue();
                btnColor.setBackground(new Color(r,g,b));
                actualiza();
            }
        });
        
        JSlider sldVerde = new JSlider(JSlider.HORIZONTAL);
        sldVerde.setPreferredSize(new Dimension(280, 50));
        sldVerde.setMinimum(0);
        sldVerde.setMaximum(255);
        sldVerde.setValue(100);
        sldVerde.setMajorTickSpacing(50);
        sldVerde.setMinorTickSpacing(25);
        sldVerde.setPaintTicks(true);
        sldVerde.setPaintLabels(true);
        
        sldVerde.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent e) {
                g= sldVerde.getValue();
                btnColor.setBackground(new Color(r,g,b));
                actualiza();
            }
        });
        
        JSlider sldAzul = new JSlider(JSlider.HORIZONTAL);
        sldAzul.setPreferredSize(new Dimension(280, 50));
        sldAzul.setMinimum(0);
        sldAzul.setMaximum(255);
        sldAzul.setValue(100);
        sldAzul.setMajorTickSpacing(50);
        sldAzul.setMinorTickSpacing(25);
        sldAzul.setPaintTicks(true);
        sldAzul.setPaintLabels(true);
        
        sldAzul.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent e) {
                b= sldAzul.getValue();
                btnColor.setBackground(new Color(r,g,b));
                actualiza();
            }
        });
        
       
        add(lblRojo);
        add(sldRojo);
        add(lblVerde);
        add(sldVerde);
        add(lblAzul);
        add(sldAzul);
        add(btnColor);
        add(txtCodigo);
        setVisible(true);
        
        System.out.println(aHex(10));
    }
    
  private String aHex (int num) {
    	
    	String hexa = "";
    	
    	
    	while (num !=0) {
    		int resto = num%16;
    		hexa = cHex(resto)+hexa ;
    		num = num/16;
    	}
    	
    	if (hexa.length()==1) {
    		hexa = "0"+hexa;
    	}else if (hexa.length()==0) {
    		hexa = "00";
    	}
    	return hexa;
    }
    
    private String cHex (int num) {
    	
    	if (num < 0 || num > 15) {
    		return "ERROR";
    	}
    	
    	String [] letras = {"A","B","C","D","E","F"};
    	if ( num < 10) {
    	return ""+num;
    	}
    	
    	return letras[num-10];
    }
    
    private void actualiza () {
    	 txtCodigo.setText("#"+ aHex(r)+aHex(g)+aHex(b));
    }
    
    public static void main(String[] args) {
        Actividad04 ventana = new Actividad04();

    }

}