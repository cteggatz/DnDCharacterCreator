package com.Teggatz.CharacterTraits.Race.Races.Dwarves;

import com.Teggatz.CharacterTraits.Enums.Languages;
import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;
import com.Teggatz.CharacterTraits.Enums.Size;
import com.Teggatz.CharacterTraits.Enums.Vision;
import com.Teggatz.CharacterTraits.Race.Race;

public abstract class Dwarf extends Race {
    Dwarf(){
        this.speed = 25;
        this.size = Size.MEDIUM;
        this.visionType = Vision.SUPERIOR_DARKVISION;
        addAbilityScore(ListOfAbilityScores.CON, 2);
        WeaponProficiancies[] dwarvenCombattraining = {WeaponProficiancies.BATTLEAXE, WeaponProficiancies.HANDAXE,
        WeaponProficiancies.LIGHT_HAMMER, WeaponProficiancies.WARHAMMER};
        addRacialWeaponProf(dwarvenCombattraining);
        Languages[] baseDwarfLanguages = {Languages.COMMON, Languages.DWARVISH};
        addLanguage(baseDwarfLanguages);
        //add tool proficiencies

        addRacialAbilities("Dwarvan Resilience"
                , "you have advantage on saving throws against poison, and you have resistance against poison damage");
        addRacialAbilities("Stonecunning",
                "Whenever you make an Intelligence (History) check related to the origin of stonework, " +
                        "you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
    }


}
