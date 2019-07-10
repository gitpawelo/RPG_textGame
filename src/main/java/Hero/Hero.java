package Hero;

import Monster.Monsters;
import Place.Places;
import Weapon.Weapons;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public abstract class Hero {

    private int hitPoints;
    private Weapons weapon;
    private int experience;
    private int level;


    public abstract void travel(Places destination);

    public abstract void levelUp();

    public abstract void attack(Monsters monster);

    @Override
    public String toString() {
        return " {" +
                "punktyŻycia=" + hitPoints +
                ", doświadczenie=" + experience +
                ", level=" + level ;
    }
}
