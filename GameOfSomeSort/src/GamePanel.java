import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

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
    private Window w;
    private int height;
    private int width;
    private int tWidth;
    private int tHeight;
    private Dimension dim;

    Tile visibleMap[][];
    BufferedImage image;

    public GamePanel(Window w) {
        System.out.println("Generating map...");
        this.map = new GameMap(this);
        this.w = w;
        this.height = w.HEIGHT;
        this.width = w.WIDTH;
        this.dim = new Dimension(w.WIDTH, w.HEIGHT);
        this.setMinimumSize(this.dim);
        this.setMaximumSize(this.dim);
        this.setPreferredSize(this.dim);
        this.setFocusable(true);
        this.requestFocus();

        this.image = new BufferedImage(this.width, this.height,
                BufferedImage.TYPE_INT_RGB);

        this.tWidth = this.width / Tile.TILE_WIDTH;
        this.tHeight = this.height / Tile.TILE_HEIGHT;
        this.visibleMap = new Tile[this.tWidth][this.tHeight];

        this.init();

    }

    /**
     * Initializes visualized map
     */
    private void init() {

        System.out.println("Painting map...");
        for (int x = 0; x < this.tWidth; x++) {
            for (int y = 0; y < this.tHeight; y++) {
                //this.visibleMap[x][y] = new Tile(x * Tile.TILE_WIDTH, y
                //        * Tile.TILE_HEIGHT, this);

                //try {
                Tile temp = this.map.getTile(x + 50, y + 25);
                temp.setX(x + Tile.TILE_WIDTH);
                temp.setY(y + Tile.TILE_HEIGHT);
                this.visibleMap[x][y] = temp;
                //} catch (Exception e) {
                //    e.printStackTrace();
                //}

            }
        }

    }

    public synchronized void tick() {
        for (int x = 0; x < this.tWidth; x++) {
            for (int y = 0; y < this.tHeight; y++) {
                this.visibleMap[x][y].tick(this);
                ;
            }
        }
    }

    /**
     * Renders the canvas.
     */
    public synchronized void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);

        for (int x = 0; x < this.tWidth; x++) {
            for (int y = 0; y < this.tHeight; y++) {
                this.visibleMap[x][y].render(g);
            }
        }

        g.dispose();
        bs.show();
    }

}
