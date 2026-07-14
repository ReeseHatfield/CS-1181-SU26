import javax.swing.*;
import java.awt.*;

public class Circle extends JComponent {
    
    private int x = 100;
    private int y = 250;
    
    private int width = 100;
    private int height = 100;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        

        g.drawString("DVD", this.x, this.y);
        
        g.fillOval(this.x, this.y + 20, width, height - 40);
        // g.drawString("Video", this.x, this.y);

        // g.setColor(Color.RED);
        // g.fillRect(this.x, this.y + 100, width, height);
    }

    private int deltaX = 2;
    private int deltaY = 2;

    public void animate(){


        Timer t = new Timer(10, e -> {

            if(this.y > GUI.HEIGHT - this.height){
                deltaY *= -1;
            }
            
            if(this.y < 0){
                deltaY *= -1;
            }

            if(this.x > GUI.WIDTH - this.width) {
                deltaX *= -1;
            }

            if(this.x < 0){
                deltaX *= -1;
            }

            this.x += deltaX;
            this.y += deltaY;

            this.repaint();
        });
        t.start();


        // Timer t = new Timer(30_000, e ->{
        //     parent.remove(label) // may be different
        //     parent.repaint()
        // })
        // t.setRepeats(false)
        // t.start()
    }
}
