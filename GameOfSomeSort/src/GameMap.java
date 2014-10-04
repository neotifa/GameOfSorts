/**
 * Main game map structure. Might make it extendable for town maps and such.
 * 
 * @author eboyer
 * 
 */

public class GameMap {

    private final Tile[][] map = new Tile[100][100];

    /*
     * Default constructor. No need for others.
     */
    public GameMap() {
        /*
         * Draw Grass
         */

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                this.drawGrass(i, j);
            }
        }
        this.init();
    }

    private void init() {
        /*
         * Draw ocean (bordering 2 tiles)
         */

        // Top
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 100; j++) {
                this.drawWater(i, j);
            }
        }

        // Left
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 2; j++) {
                this.drawWater(i, j);
            }
        }

        // Bottom
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 100; j++) {
                this.drawWater(i + 97, j);
            }
        }

        // Right
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 2; j++) {
                this.drawWater(i, j + 97);
            }
        }

        /*
         * Draw River
         */

        for (int i = 20; i < 97; i++) {
            this.drawRiver(i, 50);
            ;
        }

        /*
         * Draw Bridge
         */

        this.drawBridge(50, 50);
        /*
         * Draw Desert1
         */

        for (int i = 14; i < 28; i++) {
            for (int j = 20; j < 80; j++) {
                this.drawSand(i, j);
            }
        }

        /*
         * Draw Desert2
         */

        for (int i = 60; i < 97; i++) {
            for (int j = 51; j < 97; j++) {
                this.drawSand(i, j);
            }
        }

        /*
         * Draw mountains (Underneath top ocean in an inverted triangle cluster)
         */

        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 97; j++) {
                this.drawMountain(i, j);
            }
        }

        for (int i = 6; i < 10; i++) {
            for (int j = 12; j < 88; j++) {
                this.drawMountain(i, j);
            }
        }

        for (int i = 11; i < 20; i++) {
            for (int j = 27; j < 72; j++) {
                this.drawMountain(i, j);
            }
        }

    }

    /**
     * Creates a WaterTile object and places it in the map at location [i][j]
     * 
     * @param i
     *            row
     * @param j
     *            column
     */
    private void drawWater(int i, int j) {
        this.map[i][j] = new WaterTile(i, j);
    }

    /**
     * Creates a SandTile object and places it in the map at location [i][j]
     * 
     * @param i
     *            row
     * @param j
     *            column
     */
    private void drawSand(int i, int j) {
        this.map[i][j] = new SandTile(i, j);
    }

    /**
     * Creates a GrassTile object and places it in the map at location [i][j]
     * 
     * @param i
     *            row
     * @param j
     *            column
     */
    private void drawGrass(int i, int j) {
        this.map[i][j] = new GrassTile(i, j);
    }

    /**
     * Creates a BridgeTile object and places it in the map at location [i][j]
     * 
     * @param i
     *            row
     * @param j
     *            column
     */
    private void drawBridge(int i, int j) {
        this.map[i][j] = new BridgeTile(i, j);
    }

    /**
     * Creates a MountainTile object and places it in the map at location [i][j]
     * 
     * @param i
     *            row
     * @param j
     *            column
     */
    private void drawMountain(int i, int j) {
        this.map[i][j] = new MountainTile(i, j);
    }

    /**
     * Creates a MountainTile object and places it in the map at location [i][j]
     * 
     * @param i
     *            row
     * @param j
     *            column
     */
    private void drawRiver(int i, int j) {
        this.map[i][j] = new RiverTile(i, j);
    }
}
