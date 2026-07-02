import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    private JPanel root = new JPanel();

    public CustomFrame(){

        super.setSize(700, 700);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(root);

        initializeComponents();

        super.setVisible(true);
    }  
    
    private void initializeComponents(){

        for(int i = 0; i < 10; i++){
            this.root.add(new RandomLabel("test"));
        }

        JTextArea input = new JTextArea(2, 7);
        this.root.add(input);

        // JButton btn = new JButton("Click me");
        // btn.addActionListener((e) -> {
        //     System.out.println("i was clicked");
        // });
        // root.add(btn);

        CustomButton btn = new CustomButton(input, this.root);
        root.add(btn);

    }
}
