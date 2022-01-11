package com.Teggatz.CharacterTraits.Race.Races.Elves;

import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;

import static com.Teggatz.UniversalMethods.chooseLanguage;

public class HighElf extends Elf{

    public HighElf(){
        WeaponProficiancies[] ElfWeaponTraining = {WeaponProficiancies.LONGSWORD,
                WeaponProficiancies.SHORTSWORD, WeaponProficiancies.SHORTBOW, WeaponProficiancies.LONGBOW};
        addRacialWeaponProf(ElfWeaponTraining);
        addAbilityScore(ListOfAbilityScores.INT, 1);
        addRacialAbilities("Cantrip",
                "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
        addLanguage(chooseLanguage("race", raceLanguages));
    }

    @Override
    public String name() {
        return "High Elf";
    }

}
