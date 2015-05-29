package swing;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class JRadioButtonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste JRadioButton");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRadioButton button1 = new JRadioButton("Vermelho");
        JRadioButton button2 = new JRadioButton("Verde");
        JRadioButton button3 = new JRadioButton("Azul");
        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(button1);
        colorButtonGroup.add(button2);
        colorButtonGroup.add(button3);
        button1.setSelected(true);
        frame.add(new JLabel("Cor:"));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.pack();
        frame.setVisible(true);
    }
}