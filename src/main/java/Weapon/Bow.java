package Weapon;

/**
 * Created by HP on 2017-11-28.
 */
public class Bow implements Weapons{

    private static final int PHYSICAL_HIT = 50;
    private static final int FLYING_HIT = 120;
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
