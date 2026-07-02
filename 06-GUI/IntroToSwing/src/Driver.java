import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Driver {
    public static void main(String[] args) {
        // dont worry about this
        FontAdjuster.adjustFontSize(30);
        
        // construct
        JFrame frame = new JFrame();

        // init
        frame.setTitle("My First GUI");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
    
        JLabel myFirstLabel = new JLabel();
        myFirstLabel.setText("Hello world");
        root.add(myFirstLabel);
        
        JLabel mySecondLabel = new JLabel("Hello Class");
        root.add(mySecondLabel);

        JTextArea myTextArea = new JTextArea(2, 10);
        root.add(myTextArea);

        JButton btn = new JButton("Click Me!");
        btn.addActionListener((e) -> {
            // System.out.println("Click me from lambda!");

            System.out.println("Text was: " + myTextArea.getText());
        });

        

        root.add(btn);
        
        frame.setContentPane(root);
        frame.setVisible(true);

        System.out.println("Hello world");

        // render to screen
    }
}