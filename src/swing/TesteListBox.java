package swing;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class TesteListBox {
    public static void main(String[] a) {
        JFrame frame = new JFrame("Teste JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton1 = new JButton("Selecione");
        String[] mystring = { "Laranja", "Maça", "Banana", "Acerola" };
        final JList jList1 = new JList(mystring) ;
        ListSelectionListener listener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(jList1.getSelectedValue());
            }
        };
        jList1.addListSelectionListener(listener);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object contents = jList1.getSelectedValue();
                System.out.println(contents);
            }
        });
        frame.add(jList1, "Center");
        frame.add(jButton1,"South");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
