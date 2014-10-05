import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author eboyer
 *
 */
public class HUDPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 200;

    private String hp = "100";
    private String mp = "20";
    private String score = "0";

    private JLabel HP = new JLabel("HP: " + this.hp);
    private JLabel MP = new JLabel("MP: " + this.mp);
    private JLabel Score = new JLabel("Score: " + this.score);

    public HUDPanel() {

        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setLayout(new GridLayout(2, 2));

        this.add(this.HP);
        this.HP.setForeground(Color.WHITE);
        this.add(this.Score);
        this.Score.setForeground(Color.WHITE);
        this.add(this.MP);
        this.MP.setForeground(Color.WHITE);
        Animation a = new Animation();
        this.add(a);

    }
}
