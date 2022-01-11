package com.Teggatz.CharacterTraits.Race.Races.Dwarves;

import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;

public class HillDwarf extends Dwarf{

    HillDwarf(){
        addAbilityScore(ListOfAbilityScores.WIS, 1);

    }

    @Override
    public String name() {
        return "Hill Dwarf";
    }
}
