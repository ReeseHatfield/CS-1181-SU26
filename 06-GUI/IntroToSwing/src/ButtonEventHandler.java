import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I was clicked");
    }
    
}
