package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingApplication {
    private static String labelPrefix = "Numero de cliques no botao: ";
    private int numClicks = 0;
    public Component createComponents() {
        final JLabel label = new JLabel(labelPrefix +"0 ");
        JButton button = new JButton("Eu sou um botao Swing!");
        button.setMnemonic(KeyEvent.VK_I);
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                label.setText(labelPrefix + numClicks);
            }
        };
        button.addActionListener(listener);
        label.setLabelFor(button);
        JPanel pane = new JPanel();
        pane.setBorder(BorderFactory.createEmptyBorder(
                30, //top
                30, //left
                10, //bottom
                30) //right
        );
        pane.setLayout(new GridLayout(0, 1));
        pane.add(button);
        pane.add(label);
        return pane;
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName(
                    ));
        } catch (Exception e) {}
        JFrame frame = new JFrame("Aplicacao Swing");
        SwingApplication app = new SwingApplication();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents,
                BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); frame.setVisible(true);
    }
}