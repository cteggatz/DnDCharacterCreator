package com.Teggatz.CharacterTraits.Race.Races.Elves;

import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;
import com.Teggatz.CharacterTraits.Enums.Vision;

public class Drow extends Elf{
    Drow(){
        visionType = Vision.SUPERIOR_DARKVISION;
        WeaponProficiancies[] DrowWeaponTraining = {WeaponProficiancies.RAPIER, WeaponProficiancies.SHORTSWORD,
        WeaponProficiancies.HAND_CROSSBOW};
        addRacialWeaponProf(DrowWeaponTraining);
        addAbilityScore(ListOfAbilityScores.CHA, 1);

        addRacialAbilities("Sunlight Sensitivity",
                "you have disadvantage on attack rolls and on perception checks that rely on sight, " +
                        "the target of your attack, or whatever you are trying to perceive is in the direct sunlight");
        addRacialAbilities("Drow Magic",
                "you know cantrip : Dancing Lights, when you reach 3rd level you can cast Faerie fire once per day" +
                        " at 5th level you can cast darkness spell once per day. " +
                        "you can only use these once and must long rest to use them again. Your CHA is your spell casting mod");
    }

    @Override
    public String name() {
        return "Drow";
    }
}
