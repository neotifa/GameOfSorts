public class Armor extends Item {

    final static int DEFAULT_ARMOR_VALUE = 100;
    final static int DEFAULT_MOVEMENT_MODIFIER = 1;

    private int armorValue = DEFAULT_ARMOR_VALUE;
    private int movementModifier = DEFAULT_MOVEMENT_MODIFIER;

    public Armor(int setArmorValue, int setMovementModifier) {
        this.armorValue = setArmorValue;
        this.movementModifier = setMovementModifier;
    }

}