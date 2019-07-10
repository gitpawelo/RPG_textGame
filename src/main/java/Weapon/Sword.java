package Weapon;

/**
 * Created by HP on 2017-11-28.
 */
public class Sword implements Weapons {

    private static final int PHYSICAL_HIT = 150;
    private static final int FLYING_HIT = 30;
    private static final int MAGICAL_HIT = 80;


    public static int getPhysicalHit() {
        return PHYSICAL_HIT;
    }

    public static int getFlyingHit() {
        return FLYING_HIT;
    }

    public static int getMagicalHit() {
        return MAGICAL_HIT;
    }


}
