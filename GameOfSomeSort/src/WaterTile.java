
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

    public WaterTile(int x, int y) {
        super(DEFAULT_WATER, x, y);
        super.setTraversable(false);
    }

}
