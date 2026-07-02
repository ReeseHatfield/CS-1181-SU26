import javax.swing.*;

public class CookieFrame  extends JFrame{

    private JPanel root = new JPanel();

    // default layout is a FLOW layout
    // dynamic size things as they are add
    
    public CookieFrame(){
        super("Cookie Clicker");

        super.setLocationRelativeTo(null);

        this.setSize(400, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(root);
        init();
        this.setVisible(true);
    }

    private int amountToIncreaseBy = 1;

    private void init(){
        JLabel score = new JLabel("0");
        this.root.add(score);

        JButton upgradeBtn = new JButton("Buy Upgrade");
        upgradeBtn.addActionListener(e -> {
            if(Integer.parseInt(score.getText()) > 10){
                this.amountToIncreaseBy += 1;
                score.setText("" + (Integer.parseInt(score.getText()) - 10));
            }
        });


        this.root.add(upgradeBtn);
        
        // some component for a cookie
        JButton clicker = new JButton();
        clicker.setIcon(new ImageIcon("cookie.png"));
        clicker.addActionListener(e -> {
            int currentScore = Integer.parseInt(score.getText());

            int increasedScore = currentScore + this.amountToIncreaseBy;

            score.setText("" + increasedScore);
        });
        this.root.add(clicker);
        
    }
}
