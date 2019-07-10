package Weapon;

import Monster.Monsters;

/**
 * Created by HP on 2017-11-28.
 */
public class MagicWand implements Weapons {

    private static final int PHYSICAL_HIT = 90;
    private static final int FLYING_HIT = 150;
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

    public void attack(Monsters monster) {

    }
}
