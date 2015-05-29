package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutChangingGap {
    public static void main(String[] args) {
        JFrame aWindow = new JFrame("Este é o FlowLayout");
        aWindow.setBounds(50,50,250,250);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 20, 30);
        Container content = aWindow.getContentPane();
        content.setLayout(flow);
        for (int i = 0; i <= 9; i++){
            content.add(new JButton("Aperte " + i));
        }
        aWindow.setVisible(true);
    }
}