import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Erica Boyer
 * 
 */
@SuppressWarnings("serial")
public class Window extends JFrame {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private static final String TITLE = "The Game";
    private static final boolean VISIBLE = true;
    private static final boolean RESIZABLE = false;

    GamePanel game;
    HUDPanel hud;

    /**
     * 
     * This is going to be the only constructor because I want as little
     * interference as possible.
     * 
     * @param arg0
     * @throws HeadlessException
     * 
     */
    public Window() throws HeadlessException {

        this.setSize(WIDTH, HEIGHT);
        this.setTitle(TITLE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(RESIZABLE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        this.game = new GamePanel(this);
        this.add(this.game, BorderLayout.CENTER);

        this.hud = new HUDPanel();
        this.add(this.hud, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(VISIBLE);

    }

}
