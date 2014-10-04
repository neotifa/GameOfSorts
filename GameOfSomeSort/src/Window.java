import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.image.BufferStrategy;

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

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "The Game";
    private static final boolean VISIBLE = true;
    private static final boolean RESIZABLE = false;

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

        GamePanel game = new GamePanel();
        this.add(game, BorderLayout.CENTER);

        HUDPanel hud = new HUDPanel();
        this.add(hud, BorderLayout.SOUTH);

        this.setVisible(VISIBLE);

    }

    public void tick() {

    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();

    }

}
