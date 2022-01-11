package com.Teggatz.CharacterTraits.Skills;

public class Skills {
    public String name;
    public boolean proficiency;
    public int bonus;

    public Skills(String name, boolean proficiency, int bonus, int proficiencyBonus){
        this.name = name;
        this.proficiency = proficiency;
        if(proficiency){
            this.bonus = (bonus/2)-5;
        } else {
            this.bonus = ((bonus/2)-5) + proficiencyBonus;
        }
    }
    public void addProficiency(){
        this.proficiency = true;
    }
}
