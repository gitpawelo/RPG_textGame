package Monster;

import java.util.Random;

/**
 * Created by HP on 2017-11-28.
 */
public class Skeleton extends Monsters {


    public Skeleton() {
        Random random = new Random();
        setTypeOfMonster(TypeOfMonster.PHYSICAL);
        setHitPoints(random.nextInt(25) + 50);
        setGivenExperienceToHero(80);
        setMadeDamageToHero(50);
    }


}
