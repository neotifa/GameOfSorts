/**
 * Launches the game. Apparently Main doesn't like it.
 * 
 * @author eboyer
 * 
 */
public class Launcher implements Runnable {

    private boolean running = false;
    Window w;

    public Launcher() {

        this.w = new Window();

    }

    @Override
    public void run() {
        while (this.running) {
            this.w.tick();
            this.w.render();
        }
    }

    public synchronized void start() {
        this.running = true;
        Thread t = new Thread(this);
        System.out.println("Starting game...");
    }

    public synchronized void stop() {
        this.running = false;
        System.exit(0);
    }

}
