
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

    public SandTile(int x, int y) {
        super(DEFAULT_SAND, x, y);
        super.setTraversable(true);
    }

}
