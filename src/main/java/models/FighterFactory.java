package models;

import java.util.ArrayList;
import java.util.List;

public class FighterFactory {

    public ArrayList<Fighter>generateFighters() {
        Fighter fighter1 = new Fighter("Bob", 12, 20, new ArrayList<>(List.of(new Weapons("Throwing Knife", 10, "missile"))));
        Fighter fighter2 = new Fighter("One Punch Man", 15, 15,new ArrayList<>(List.of(new Weapons("Club",5,"melee"))));
        Fighter fighter3 = new Fighter("Sailor Moon", 11, 9, new ArrayList<>(List.of(new Weapons("dagger",10,"melee"))));

        ArrayList<Fighter> fighters = new ArrayList<>(List.of(
                fighter1,
                fighter2,
                fighter3
        ));

        return fighters;
    }
}
