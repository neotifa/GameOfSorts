import java.awt.Image;

/**
 * River tile object.
 * 
 * @author eboyer
 * 
 */
public class RiverTile extends Tile {

    /**
     * Default tile image for river tiles.
     */
    private static final String DEFAULT_RIVER = "images/default_river.png";

    private boolean traversable = true;
    Image img = null;

    public RiverTile() {
        super(DEFAULT_RIVER);
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
