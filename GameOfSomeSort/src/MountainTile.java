import java.awt.Image;

/**
 * Mountain tile object.
 * 
 * @author eboyer
 * 
 */
public class MountainTile extends Tile {

    /**
     * Default tile image for mountain tiles.
     */
    private static final String DEFAULT_MOUNTAIN = "images/default_mountain.png";

    private boolean traversable = false;
    Image img = null;

    public MountainTile() {
        super(DEFAULT_MOUNTAIN);
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
