package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FlowLayoutBehaviour extends JFrame {

private static final long serialVersionUID = 1L;

public static void main(String[] args) {
    FlowLayoutBehaviour ft = new FlowLayoutBehaviour();
    ft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ft.setSize(400, 300);
    ft.setVisible(true);
  }

  public FlowLayoutBehaviour() {
    super();
    Container pane = getContentPane();
    pane.setLayout(new FlowLayout(FlowLayout.LEFT));
    pane.add(new JLabel("Isto é um teste"));
    pane.add(new JButton("do FlowLayout"));
    pane.add(new JTextField(30));
    pane.add(new JTextArea("Este é um componente JTextArea", 3, 10));
    pane.add(new JLabel("Este é um teste do FlowLayout com uma string longa"));
  }

}