import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main (String[] args){
        FontAdjuster.adjustFontSize(30);
        
        // JFrame f = new JFrame();
        
        // f.setSize(700, 700);
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel root = new JPanel();

        // f.setContentPane(root);

        // f.setVisible(true);

        new CustomFrame();
    }

    // public static void foo(JFrame f){
    //     // does stuff with f
    // }
}