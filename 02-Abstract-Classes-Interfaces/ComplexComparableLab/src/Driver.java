import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Driver {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(500,500);
        jf.add(new JButton("this is a button"));
        jf.setVisible(true);
    }
}