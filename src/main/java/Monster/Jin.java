package Monster;

import java.util.Random;

/**
 * Created by HP on 2017-11-28.
 */
public class Jin extends Monsters {


    public Jin() {
        Random random = new Random();
        setTypeOfMonster(TypeOfMonster.MAGIC);
        setHitPoints(random.nextInt(150) + 100);
        setGivenExperienceToHero(150);
        setMadeDamageToHero(80);
    }


}
