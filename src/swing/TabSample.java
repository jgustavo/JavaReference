package swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class TabSample {
    static void add(JTabbedPane tabbedPane, String label) {
        JButton button = new JButton(label);
        tabbedPane.addTab(label, button);
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("Exemplo Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        String titles[] = { "Geral", "Seguran�a", "Conte�do", "Conex�o", "Programas",
        "Avan�ado" };
        for (int i = 0, n = titles.length; i < n; i++) {
            add(tabbedPane, titles[i]);
        }
        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
                JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
                int index = sourceTabbedPane.getSelectedIndex();
                System.out.println("Mudan�a de aba: " + sourceTabbedPane.getTitleAt(index));
            }
        };
        tabbedPane.addChangeListener(changeListener);
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
}