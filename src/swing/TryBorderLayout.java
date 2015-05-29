package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class TryBorderLayout {
  public static void main(String[] args) {
    JFrame frame = new JFrame("This is a Border Layout");
    frame.setBounds(30, 30, 300, 300); // Size
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BorderLayout layout = new BorderLayout(); // Create a layout manager
    Container content = frame.getContentPane(); // Get the content pane
    content.setLayout(layout); // Set the container layout mgr
    EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED); // Button border
    // Now add five JButton components and set their borders
    JButton button;
    
    JPanel panel = new JPanel();
    JButton button2 = new JButton("EAST2");
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    panel.add(button = new JButton("EAST"));
    panel.add(button2);
    content.add(panel, BorderLayout.EAST);
    button.setBorder(edge);

   
    content.add(button = new JButton("WEST"), BorderLayout.WEST);
    button.setBorder(edge);
    content.add(button = new JButton("NORTH"), BorderLayout.NORTH);
    button.setBorder(edge);
    content.add(button = new JButton("SOUTH"), BorderLayout.SOUTH);
    button.setBorder(edge);
    content.add(button = new JButton("CENTER"), BorderLayout.CENTER);
    button.setBorder(edge);
    frame.setVisible(true); // Display the window
  }
}