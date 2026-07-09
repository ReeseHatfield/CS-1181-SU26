import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private JPanel root = new JPanel();

    public static final int WIDTH = 1553;
    public static final int HEIGHT = 757;


    public GUI(){
        super("Custom Graphics");
        this.setSize(WIDTH, HEIGHT);

        this.root.setLayout(new BorderLayout());
        this.setContentPane(root);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        init();
        this.setVisible(true);
    }

    private void init(){
        Circle ball = new Circle();
        this.root.add(ball);
        ball.animate();

    }
}
