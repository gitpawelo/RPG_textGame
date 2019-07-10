package Monster;

import java.util.Random;

/**
 * Created by HP on 2017-11-28.
 */
public class Dragon extends Monsters {


    public Dragon() {
        Random random = new Random();
        setTypeOfMonster(TypeOfMonster.FLYING);
        setHitPoints(random.nextInt(700) + 300);
        setGivenExperienceToHero(450);
        setMadeDamageToHero(150);
    }


}
