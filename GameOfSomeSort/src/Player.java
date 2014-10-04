public abstract class Player {
    private String name;
    private int health;
    private int maxHealth;
    private int magic;
    private int maxMagic;
    private boolean isDead = false;

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