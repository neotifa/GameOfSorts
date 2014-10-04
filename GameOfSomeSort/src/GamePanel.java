import java.awt.Color;

import javax.swing.JPanel;

/**
 * Main game panel.
 * 
 * @author Erica Boyer
 * 
 */
public class GamePanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private GameMap map = new GameMap();

    public GamePanel() {

        this.setBackground(Color.BLACK);

    }

}
