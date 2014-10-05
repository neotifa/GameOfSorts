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

    public GrassTile(int x, int y, GamePanel gp) {
        super(DEFAULT_GRASS, x, y, gp);
        super.setTraversable(true);
    }

}
