import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * Class to handle the game tiles.
 * 
 * @author eboyer
 * 
 */
public class Tile {

    /**
     * Default image for Tile.
     */
    private static final String DEFAULT_IMAGE = "images/default_tile.png";
    protected static final int TILE_WIDTH = 64;
    protected static final int TILE_HEIGHT = 64;

    private boolean traversable = false;
    private BufferedImage img = null;
    private int x = 0;
    private int y = 0;

    GamePanel gp;

    /**
     * Default Constructor.
     */
    public Tile(int x, int y, GamePanel gp) {
        this.setImage(DEFAULT_IMAGE);
        this.setX(x);
        this.setY(y);
        this.gp = gp;
    }

    /**
     * Takes the name of a file for Tile image.
     * 
     * @param imgFile
     *            File name for the image representation of this Tile.
     * @requires imgFile != null & is valid file path
     * 
     */
    public Tile(String imgFile, int x, int y, GamePanel gp) {
        this.setImage(imgFile);
        this.setX(x);
        this.setY(y);
        this.gp = gp;
    }

    public synchronized void tick(GamePanel gp) {
        this.gp = gp;
    }

    public synchronized void render(Graphics g) {
        g.drawImage(this.img, this.x, this.y, null);
    }

    /**
     * Sets the Tile's traversable value to TRUE or FALSE
     */
    public void setTraversable(boolean traversable) {
        this.traversable = traversable;
    }

    /*
     * Returns whether the Tile is traversable.
     * 
     * @return If this Tile is traversable
     */
    public boolean isTraversable() {
        return this.traversable;
    }

    /*
     * Sets the file path for the image.
     * 
     * @param imgFile File path for new image file.
     */
    public void setImage(String imgFile) {
        try {
            this.img = ImageIO.read(new File(imgFile));
        } catch (IOException e) {
            new JOptionPane(e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Returns the Image object for the current Tile.
     * 
     * @return Current Image for this Tile.
     */
    public Image getImage() {
        return this.img;
    }

    /**
     * Set's the x value of the map that the current Tile holds.
     * 
     * @param x
     *            x value within map
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the x value within the map of the current Tile.
     * 
     * @return x value within map
     */
    public int getX() {
        return this.x;
    }

    /**
     * Set's the y value of the map that the current Tile holds.
     * 
     * @param y
     *            y value within map
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the y value within the map of the current Tile.
     * 
     * @return y value within map
     */
    public int getY() {
        return this.y;
    }

    /**
     * Returns the width of the current Tile.
     * 
     * @return width of tile
     */
    public int getWidth() {
        return TILE_WIDTH;
    }

    /**
     * Returns the height of the current Tile.
     * 
     * @return height of tile
     */
    public int getHeight() {
        return TILE_HEIGHT;
    }
}
