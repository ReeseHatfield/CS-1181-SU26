import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Driver extends JFrame {
    public static void main(String[] args) {
        // JFrame f = new Driver();

        FontAdjuster.adjustFontSize(30);
        new Driver();

        // System.out.println("Reached end of main");

        while(true){
            System.out.println("here");
        }
    }

    private JPanel root = new JPanel();

    public Driver(){
        this.setSize(new Dimension(1000, 1000));
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(this.root);

        // this.root.setLayout(new FlowLayout());

        // this.root.setLayout(new GridLayout(3, 4));

        // this.root.setLayout(new BoxLayout(this.root, BoxLayout.X_AXIS));

        this.root.setLayout(new BorderLayout());

        // JButton northBtn = new JButton("North1 Button");
        // northBtn.setSize(1000, 500);

        // this.root.add(northBtn, BorderLayout.NORTH);
        this.root.add(new TwoButtonPanel(), BorderLayout.NORTH);
        this.root.add(new TwoButtonPanel(), BorderLayout.SOUTH);
        this.root.add(new JButton("East Button"), BorderLayout.EAST);

        JButton west = new JButton("West Button");
        west.addActionListener(e -> {
            JFrame f = new Driver();

            Random rng = new Random();
            int x = rng.nextInt(2000);
            int y = rng.nextInt(1000);
            f.setLocation(x, y);
        });
        this.root.add(west, BorderLayout.WEST);

        JPanel btnPanel = new JPanel();

        btnPanel.setLayout(new GridLayout(3, 3));

        ArrayList<JButton> btnList = new ArrayList<>();
        
        int numBtns = 9;
        for(int i = 0; i < numBtns; i++){
            JButton cur = new JButton("Hello " + (i + 1));
            btnList.add(cur);
        }


        for(int i = 0; i < numBtns; i++){

            int temp = i;
            btnList.get(i).addActionListener((e) -> {
                doALotOfWork();    
                System.out.println("Button " + (temp + 1) + " was clicked" );
            });
        }

        for(int i = 0; i < numBtns; i++){
            btnPanel.add(btnList.get(i));
        }

        this.root.add(btnPanel, BorderLayout.CENTER);



        this.setVisible(true);
    }

    public static void doALotOfWork(){
        try {
            Thread.sleep(5_000);
        }
        catch(InterruptedException ie){
            // ignore
        }
    }
}