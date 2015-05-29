package swing;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class TextFieldDemo {
    public static void main(String[] a) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jTextField1 = new JTextField();
        jTextField1.setText("Este e um campo de texto JTextField");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Enter pressionado");
            }
        });
        frame.add(jTextField1);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}