package com.Teggatz.CharacterTraits.Race;

import com.Teggatz.CharacterTraits.Enums.Languages;
import com.Teggatz.CharacterTraits.Enums.ListsOfAlreadyKnowThings.ListOfAbilityScores;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;
import com.Teggatz.CharacterTraits.Enums.Size;
import com.Teggatz.CharacterTraits.Enums.Vision;

import java.util.*;

public abstract class Race {
    public abstract String name();
    public int speed;
    public ArrayList<Languages> raceLanguages = new ArrayList<Languages>();

    public Size size;
    public Vision visionType;
    public int[] abilityScoreIncrease = new int[6];
    public HashMap<String, String> racialAbilities = new HashMap<String, String>();
    //proficiencies
    public ArrayList<WeaponProficiancies> racialWeaponProficiencies = new ArrayList<WeaponProficiancies>();
    public ArrayList<String> racialSkills = new ArrayList<String>();


    //setters
    protected void addRacialAbilities(String name, String description){
        racialAbilities.put(name, description);
    }
    protected void addRacialWeaponProf(WeaponProficiancies[] weaponProficiency){
        Collections.addAll(racialWeaponProficiencies, weaponProficiency);

    }
    protected void addAbilityScore(ListOfAbilityScores stat, int change){
        switch(stat) {
            case STR -> this.abilityScoreIncrease[0] = change;
            case DEX -> this.abilityScoreIncrease[1] = change;
            case CON -> this.abilityScoreIncrease[2] = change;
            case WIS -> this.abilityScoreIncrease[3] = change;
            case INT -> this.abilityScoreIncrease[4] = change;
            case CHA -> this.abilityScoreIncrease[5] = change;
        }
    }
    protected void addLanguage(Languages languages){
        raceLanguages.add(languages);
    }
    protected void addLanguage(Languages[] languages){
        raceLanguages.addAll(Arrays.asList(languages));
    }
    //public abstract void dumpRaceAbilities(Character character);
    public void dumpRaceInfo(){
        System.out.println("(!) DUMPING RACE INFO (!)");
        System.out.println("| speed : " + this.speed);
        System.out.println("| size : " + this.size);
        System.out.println("| vision : " + this.visionType);
        System.out.println("| ability scores: " + Arrays.toString(this.abilityScoreIncrease));
        System.out.println("| languages: " + raceLanguages);
        System.out.println("| weapon proficiancies : " + racialWeaponProficiencies);
        for(Map.Entry<String, String> entry : racialAbilities.entrySet()){
            System.out.println("| racial ability : " + entry.getKey());
            System.out.println("        - " + entry.getValue());
        }
    }



    // (!) NOTES (!)
    // add racial proficinecies, also chance proficiencies to ENUMS TO MAKE THINGS EASY
}
