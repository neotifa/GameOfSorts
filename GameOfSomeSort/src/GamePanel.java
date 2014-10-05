import java.awt.Canvas;

/**
 * Main game panel.
 *
 * @author Erica Boyer
 *
 */
public class GamePanel extends Canvas {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private GameMap map;

    public GamePanel() {
        System.out.println("Generating map...");
        this.map = new GameMap();

    }

}
