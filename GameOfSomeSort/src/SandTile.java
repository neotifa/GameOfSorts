import java.awt.Image;

/**
 * Sand tile object.
 * 
 * @author eboyer
 * 
 */
public class SandTile extends Tile {

    /**
     * Default tile image for sand tiles.
     */
    private static final String DEFAULT_SAND = "images/default_sand.png";

    private boolean traversable = true;
    Image img = null;

    public SandTile() {
        super(DEFAULT_SAND);
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
