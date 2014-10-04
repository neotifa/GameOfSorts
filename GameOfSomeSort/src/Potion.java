public class Potion extends Item {

    final static int DEFAULT_HEALING_VALUE = 100;

    private int healingValue = DEFAULT_HEALING_VALUE;

    public Potion(int setHealingValue) {
        this.healingValue = setHealingValue;
    }

}
