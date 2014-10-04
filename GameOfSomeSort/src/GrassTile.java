import java.awt.Image;

/**
 * 
 * Grass tile object.
 * 
 * @author eboyer
 * 
 */
public class GrassTile extends Tile {

    /**
     * Default tile image for grass tiles.
     */
    private static final String DEFAULT_GRASS = "images/default_grass.png";

    private boolean traversable = true;
    Image img = null;

    public GrassTile() {
        super(DEFAULT_GRASS);
    }

    @Override
    public void setImage(String imgFile) {
        super.setImage(imgFile);
    }

    @Override
    public Image getImage() {
        return super.getImage();
    }

    @Override
    public void setTraversable(boolean traversable) {
        super.setTraversable(traversable);
    }

    @Override
    public boolean isTraversable() {
        return super.isTraversable();
    }
}
