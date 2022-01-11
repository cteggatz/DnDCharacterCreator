package com.Teggatz.CharacterTraits.Race.Races.Elves;

import com.Teggatz.CharacterTraits.Enums.Languages;
import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;
import com.Teggatz.CharacterTraits.Enums.Size;
import com.Teggatz.CharacterTraits.Enums.Vision;
import com.Teggatz.CharacterTraits.Race.Race;

public abstract class Elf extends Race {

    Elf(){
        this.speed = 30;
        this.size = Size.MEDIUM;
        this.visionType = Vision.DARKVISION;
        addAbilityScore(ListOfAbilityScores.DEX, 2);
        Languages[] baseElfLanguages = {Languages.COMMON, Languages.ELVISH};
        addLanguage(baseElfLanguages);
        racialSkills.add("perception");

        addRacialAbilities(
                "Fey Ancestry",
                "You have advantage on saving throws against being charmed, and magic can't put your to sleep");
        addRacialAbilities(
                "Trance",
                "Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day." +
                        "After resting in this way, you gain the same benefit that a human does from 8 hours of sleep."
        );

    }
}
