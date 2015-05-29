package swing;

import java.awt.BorderLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
public class ComboBoxSample {
    static private String selectedString(ItemSelectable is) {
        Object selected[] = is.getSelectedObjects();
        return ((selected.length == 0) ? "null" : (String) selected[0]);
    }
    public static void main(String args[]) {
        String labels[] = { "Maca", "Banana", "Abacaxi", "Kiwi", "Laranja", "Uva" };
        JFrame frame = new JFrame("Exemplo JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox comboBox = new JComboBox(labels) ;
        frame.add(comboBox, BorderLayout.NORTH);
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                int state = itemEvent.getStateChange();
                System.out.println((state == ItemEvent.SELECTED) ? "Marcado" : "Desmarcado");
                System.out.print("Item: " + itemEvent.getItem());
                ItemSelectable is = itemEvent.getItemSelectable();
                System.out.println(", Selecionado: " + selectedString(is));
            }
        };
        comboBox.addItemListener(itemListener);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}