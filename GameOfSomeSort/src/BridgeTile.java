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

    public BridgeTile(int x, int y, GamePanel gp) {
        super(DEFAULT_BRIDGE, x, y, gp);
        super.setTraversable(true);
    }

}
