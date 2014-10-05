import java.util.Map;
import java.util.TreeMap;

public abstract class Player {
    private String name;
    private int health = 100;
    private int maxHealth = 100;
    private int magic = 20;
    private int maxMagic = 20;
    private boolean isDead = false;
    private Map<Item, Integer> inventory = new TreeMap<Item, Integer>();

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Player player) {
        int damage = 0;
        //calculate damage dealt
        damage = (int) (Math.random() * 10 + 1);
        player.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        //manipulate the amount of damage taken
        if (this.health - damage <= 0) {
            this.health = 0;
            this.isDead = true;
        } else {
            this.health -= damage;
        }
    }

    public boolean isDead() {
        return this.isDead;
    }
}