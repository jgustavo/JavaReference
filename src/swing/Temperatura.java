package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//A simple Swing application.
class Temperatura {
	Temperatura() {
		JFrame jfrm = new JFrame("Conversor de Temperatura");
		jfrm.setSize(275, 100);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
        jfrm.setLayout(layout);
		
        JLabel labelDigite = new JLabel("Digite a temperatura: ");
        jfrm.add(labelDigite);
        
        JTextField text = new JTextField(20);
		jfrm.add(text);
		jfrm.setVisible(true);
		
		
	}
	public static void main(String args[]) {
				Temperatura sd = new Temperatura();
	}
}