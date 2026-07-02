import java.awt.Color;
import java.util.Random;

import javax.swing.JLabel;

public class RandomLabel extends JLabel {

    private static Random rng = new Random();

    public RandomLabel(String input){
        Color c = new Color(
            rng.nextInt(0, 255), 
            rng.nextInt(0, 255), 
            rng.nextInt(0, 255)
        );

        // c = Color.RED;
        System.out.println(c);

        super.setForeground(c);
        super.setText(input);
    }
}
