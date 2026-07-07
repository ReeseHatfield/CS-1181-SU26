import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TwoButtonPanel extends JPanel{
    
    public TwoButtonPanel(){
        // this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        // this.setLayout(new BorderLayout());

        this.setLayout(new GridLayout(1, 2));

        this.add(new JButton("Button 1"));
        this.add(new JButton("Button 2"));
    }
}
