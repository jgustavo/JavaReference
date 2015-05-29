package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela {

	public static void main (String [] args) {
		JFrame janela = new JFrame ("Primeira Tela") ;
		janela.setSize (150,150);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		janela.setLayout(layout);
		JLabel label1 = new JLabel();
		label1.setText("Ola Mundo");
		janela.add(label1);
        JButton button1 = new JButton("OK");
        janela.add(button1);		
        janela.setVisible(true);
	}
}
