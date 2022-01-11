package com.Teggatz.CharacterTraits.Enums;

import java.util.Arrays;
import java.util.EnumSet;

public enum Languages {
    COMMON("Common"),
    DWARVISH("Dwarvish"),
    ELVISH("Elvish"),
    GNOMISH("Gnomish"),
    GOBLING("Goblin"),
    HALFLING("Halflin"),
    ORC("Orc"),
    ABYSSAL("Abyssal"),
    CELESTIAL("Celestial"),
    DRACONIC("Draconic"),
    DEEP_SPEECH("Deep Speach"),
    INFERNAL("Infernal"),
    PRIMODIAL("Primodial"),
    SYLVAN("Sylvan"),
    UNDERCOMMON("Undercommon");

    private final String name;


    public String[] listLanguages(){
        String[] listOfLanguages = new String[15];
        int i = 0;
        for(Languages e : Languages.values()){
            listOfLanguages[i] = e.name;
            i++;
        }
        return listOfLanguages;
    }
    Languages(String name){
        this.name = name;
    }



    //(!) notes (!)
    // make a way to list all of the enums as a list
}
