package swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class JCheckBoxTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste JCheckBox");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox ac = new JCheckBox("A/C");
        ac.setSelected(true);
        JCheckBox cdPlayer = new JCheckBox("CD");
        JCheckBox cruiseControl = new JCheckBox("Cruise Control");
        JCheckBox keylessEntry = new JCheckBox("Chave Cartão");
        JCheckBox antiTheft = new JCheckBox("Alarme");
        frame.add(new JLabel("Acessórios: "));
        frame.add(ac);
        frame.add(cdPlayer);
        frame.add(cruiseControl);
        frame.add(keylessEntry);
        frame.add(antiTheft);
        frame.pack();
        frame.setVisible(true);
        
        ChangeListener c = new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent arg0) {
                // TODO Auto-generated method stub
                
                
            }
        };
        
        ac.addChangeListener(c);
    }
}