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

    private boolean traversable = false;
    private BufferedImage img = null;
    private int x = 0;
    private int y = 0;

    /**
     * Default Constructor.
     */
    public Tile() {
        this.setImage(DEFAULT_IMAGE);
    }

    /**
     * Takes the name of a file for Tile image.
     * 
     * @param imgFile
     *            File name for the image representation of this Tile.
     * @requires imgFile != null & is valid file path
     * 
     */
    public Tile(String imgFile, int x, int y) {
        this.setImage(imgFile);
        this.setX(x);
        this.setY(y);
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

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
}
