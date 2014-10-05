/**
 * Launches the game. Apparently Main doesn't like it.
 * 
 * @author eboyer
 * 
 */
public class Launcher implements Runnable {

    private boolean running = false;
    Window w;
    Thread t;

    public Launcher() {

        this.w = new Window();

    }

    @Override
    public void run() {
        while (this.running) {
            this.w.game.tick();
            this.w.game.render();
        }
    }

    public synchronized void start() {
        this.running = true;
        this.t = new Thread(this);
        this.t.start();
        System.out.println("Starting game...");
    }

    public synchronized void stop() {
        this.running = false;
        System.exit(0);
    }

}
