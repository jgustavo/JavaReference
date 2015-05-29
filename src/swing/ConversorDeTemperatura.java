package swing;

//A simple Swing application.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
class ConversorDeTemperatura {
	ConversorDeTemperatura() {
		JFrame frame = new JFrame("Conversor de Temperatura");
		frame.setSize(275, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);

		JLabel jlab = new JLabel("Digite a Temperatura:");
		final JTextField tempField = new JTextField(5);

		String[] itens = {"Celcius","Farenheit"};
		final JComboBox combo = new JComboBox(itens);

		JButton botaoCF = new JButton("Converter");

		final JLabel labelSaida = new JLabel("0 ");

		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				//System.out.println("apertou o botao");
				String s = tempField.getText();
				Double tempF = 0d;
				Double tempC = 0d;
				if (combo.getSelectedIndex() == 1) {
					tempF = Double.valueOf(s);
					tempC = (tempF - 32) / 1.8;
					labelSaida.setText(String.format("%.2f", tempC)+" C");
				}
				if (combo.getSelectedIndex() == 0) {
					tempC = Double.valueOf(s);
					tempF = (tempC * 1.8) + 32; 
					labelSaida.setText(String.format("%.2f", tempF)+" F");
				}

			}
		};
		botaoCF.addActionListener(listener);		
		frame.add(jlab);
		frame.add(tempField);
		frame.add(combo);
		frame.add(botaoCF);
		frame.add(labelSaida);
		frame.setVisible(true);
	}
	public static void main(String args[]) {
		ConversorDeTemperatura sd = new ConversorDeTemperatura();
	}
}