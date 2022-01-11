package com.Teggatz.CharacterTraits.Race.Races.Elves;

import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;

public class WoodElf extends Elf{

    public WoodElf(){
        this.speed = 35;
        WeaponProficiancies[] ElfWeaponTraining = {WeaponProficiancies.LONGSWORD,
                WeaponProficiancies.SHORTSWORD, WeaponProficiancies.SHORTBOW, WeaponProficiancies.LONGBOW};
        addRacialWeaponProf(ElfWeaponTraining);
        addAbilityScore(ListOfAbilityScores.WIS, 1);
        addRacialAbilities("Mask of the Wild",
                "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena");
    }

    @Override
    public String name() {
        return "Wood Elf";
    }
}
