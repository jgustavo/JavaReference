package swing;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class IconButton {
  public static void main(String args[]) {
    JFrame frame = new JFrame("DefaultButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FlowLayout layout = new FlowLayout();
    frame.setLayout(layout);
    Icon warnIcon = new ImageIcon("java.png");
    JButton button2 = new JButton(warnIcon);
    frame.add(button2);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}