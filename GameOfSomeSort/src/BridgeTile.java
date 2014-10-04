import java.awt.Image;

/**
 * Bridge tile object.
 * 
 * @author eboyer
 * 
 */
public class BridgeTile extends Tile {

    /**
     * Default tile image for bridge tiles.
     */
    private static final String DEFAULT_BRIDGE = "images/default_bridge.png";

    private boolean traversable = true;
    Image img = null;

    public BridgeTile() {
        super(DEFAULT_BRIDGE);
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
