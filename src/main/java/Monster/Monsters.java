package Monster;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public abstract class Monsters {

    private int hitPoints;
    private int givenExperienceToHero;
    private int madeDamageToHero;
    private TypeOfMonster typeOfMonster;


}
