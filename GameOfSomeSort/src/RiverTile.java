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

    public RiverTile(int x, int y, GamePanel gp) {
        super(DEFAULT_RIVER, x, y, gp);
        super.setTraversable(false);
    }

}
