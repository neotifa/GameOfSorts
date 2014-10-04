import java.util.Map;
import java.util.TreeMap;

public class Monster {

    final static int DEFAULT_MONSTER_HEALTH = 100;
    final static int DEFAULT_MONSTER_DAMAGE = 10;
    final static boolean DEFAULT_MONSTER_ALIVE_STATUS = true;

    private int health = DEFAULT_MONSTER_HEALTH;
    private int damage = DEFAULT_MONSTER_DAMAGE;
    private boolean aliveStatus = DEFAULT_MONSTER_ALIVE_STATUS;
    private Map<Item, Integer> loot = new TreeMap<Item, Integer>();

    public Monster(int setStartHealth, int setDamage) {
        this.health = setStartHealth;
        this.damage = setDamage;
        this.aliveStatus = true;
    }

    public void takeDamage(int damageTaken) {
        this.health -= damageTaken;
        if (this.health <= 0) {
            this.aliveStatus = false;
        }
    }
}
