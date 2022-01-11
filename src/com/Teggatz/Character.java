package com.Teggatz;

import com.Teggatz.CharacterTraits.Class.Class;
import com.Teggatz.CharacterTraits.Enums.Alignments;
import com.Teggatz.CharacterTraits.Enums.Languages;
import com.Teggatz.CharacterTraits.Enums.Proficiencies.WeaponProficiancies;
import com.Teggatz.CharacterTraits.Enums.Size;
import com.Teggatz.CharacterTraits.Enums.Vision;
import com.Teggatz.CharacterTraits.Race.Race;
import com.Teggatz.CharacterTraits.Skills.Skills;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Character {
    //the big three
    public String name;
    public Race race;
    public Size size;
    public Vision vision;
    public int fullLevel;
    public int healthPoints;
    public int healthPointsMax;
    //background thingies
    public Alignments alignment;
    public String background;
    //skills
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public int[] listOfStats = {strength, dexterity, constitution, intelligence, wisdom, charisma};
    //class related states
    public Class[] characterClass;
    public Class startingClass;
    public int[] hitDice;
    //other
    public int proficiencyBonus;
    public int passiveWis;
    public int armorClass;
    public int initiative;
    public int speed;
    public int inspiration;
    //saving throws and skills;
    public HashMap<String, Boolean> savingThrows = new HashMap<String, Boolean>();
    public Skills[] skills = {
            new Skills("athletics", false, strength, proficiencyBonus),
            new Skills("acrobatics", false, dexterity, proficiencyBonus),
            new Skills("stealth", false, dexterity, proficiencyBonus),
            new Skills("sleight of hand", false, dexterity, proficiencyBonus),
            new Skills("arcana", false, intelligence, proficiencyBonus),
            new Skills("history", false, intelligence, proficiencyBonus),
            new Skills("investigation", false, intelligence, proficiencyBonus),
            new Skills("nature", false, intelligence, proficiencyBonus),
            new Skills("religion", false, intelligence, proficiencyBonus),
            new Skills("animal handling", false, wisdom, proficiencyBonus),
            new Skills("insight", false, wisdom, proficiencyBonus),
            new Skills("medicine", false, wisdom, proficiencyBonus),
            new Skills("perception", false, wisdom, proficiencyBonus),
            new Skills("survival", false, wisdom, proficiencyBonus),
            new Skills("deception", false, charisma, proficiencyBonus),
            new Skills("intimidation", false, charisma, proficiencyBonus),
            new Skills("performance", false, charisma, proficiencyBonus),
            new Skills("persuasion", false, charisma, proficiencyBonus)};

    //equipment
    public int cp;
    public int sp;
    public int ep;
    public int gp;
    public int pp;
    //proficiencies
    public ArrayList<Languages> knownLanguages = new ArrayList<Languages>();
    public ArrayList<WeaponProficiancies> weaponProficiencies = new ArrayList<WeaponProficiancies>();

    //abilities from classes, races, etc
    public HashMap<String, String> racialAbilities = new HashMap<String, String>();


    //creating a character
    public Character(String name, Race race
    , int Str, int Dex, int Con, int Int, int Wis, int Cha
    , Alignments alignment
    //, Class startingClass, Class[] listOfClasses
                     ){
        this.name = name;
        //this.startingClass = startingClass;
        //this.characterClass = listOfClasses;
        this.strength = Str;
        this.dexterity = Dex;
        this.constitution = Con;
        this.intelligence = Int;
        this.wisdom = Wis;
        this.charisma = Cha;
        this.alignment = alignment;

        //racial additions
        this.race = race;
        this.speed = race.speed;
        this.knownLanguages.addAll(race.raceLanguages);
        this.size = race.size;
        this.vision = race.visionType;
        this.strength = this.strength + race.abilityScoreIncrease[0];
        this.dexterity = this.dexterity + race.abilityScoreIncrease[1];
        this.constitution = this.constitution + race.abilityScoreIncrease[2];
        this.wisdom = this.wisdom + race.abilityScoreIncrease[3];
        this.intelligence = this.intelligence + race.abilityScoreIncrease[4];
        this.charisma = this.charisma + race.abilityScoreIncrease[5];
        for(Map.Entry<String, String> e : race.racialAbilities.entrySet()){
            this.racialAbilities.put(e.getKey(), e.getValue());
        }
        for(WeaponProficiancies e : race.racialWeaponProficiencies){
            if(!this.weaponProficiencies.contains(e)){
                weaponProficiencies.add(e);
            }
        }
        addSkillProficiancies(race.racialSkills);




        //finishing touches


    }

    public void checkList(ArrayList checkedList, ArrayList characterProficiencies){
        for(Object e : checkedList){
            if(!characterProficiencies.contains(e)){
                characterProficiencies.add(e);
            }
        }
    }


    public void addSkillProficiancies(ArrayList<String> racialSkill){
        for(Skills characterSkills : skills){
            for(String racialSkills : racialSkill){
                if(characterSkills.name.toLowerCase().equals(racialSkills.toLowerCase())){
                    characterSkills.addProficiency();
                }
            }
        }
    };

    public void DumpCharacterInfo(){
        System.out.println("(!) DUMPING CHARACTER INFO (!)");
        System.out.println(("| Name : " + this.name));
        System.out.println(("| Race : " + this.race.name()));
        System.out.println(("| Name : " + this.weaponProficiencies));
        for(Skills e : skills){
            System.out.println(e.name + " : " + e.proficiency);
        }
    }
}
