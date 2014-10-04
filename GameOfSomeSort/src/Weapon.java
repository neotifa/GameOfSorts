public class Weapon extends Item {

    final static int DEFAULT_ATTACK_VALUE = 100;
    final static int DEFAULT_NUMBER_OF_HANDS = 1;

    private int attackValue = DEFAULT_ATTACK_VALUE;
    private int numberOfHands = DEFAULT_NUMBER_OF_HANDS;

    public Weapon(int setAttackValue, int setNumberOfHands) {
        this.attackValue = setAttackValue;
        this.numberOfHands = setNumberOfHands;
    }

}