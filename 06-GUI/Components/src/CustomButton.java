import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CustomButton extends JButton implements ActionListener {

    private JTextArea textArea;
    private JPanel root;

    public CustomButton(JTextArea textArea, JPanel root){
        super("Click Me!");

        this.root = root;
        this.textArea = textArea;
        

        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // System.out.println("I was clicked: " + textArea.getText());
        this.root.add(new RandomLabel(textArea.getText()));
        this.textArea.setText("");
    }
}
