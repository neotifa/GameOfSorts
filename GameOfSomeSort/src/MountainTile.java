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

    public MountainTile(int x, int y, GamePanel gp) {
        super(DEFAULT_MOUNTAIN, x, y, gp);
        super.setTraversable(false);
    }

}
