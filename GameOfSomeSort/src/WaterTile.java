import java.awt.Image;

/**
 * Water tile object.
 * 
 * @author eboyer
 * 
 */
public class WaterTile extends Tile {

    /**
     * Default tile image for water tiles.
     */
    private static final String DEFAULT_WATER = "images/default_water.png";

    private boolean traversable = false;
    Image img = null;

    public WaterTile() {
        super(DEFAULT_WATER);
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
