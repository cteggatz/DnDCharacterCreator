package com.Teggatz;

import com.Teggatz.CharacterTraits.Enums.Languages;

import java.util.*;

public class UniversalMethods {
    private static Scanner scanner = new Scanner(System.in);

    public static Languages chooseLanguage(String reasonOfLanguageChoice, ArrayList<Languages> AlreadyKnowLanguages){
        System.out.println("(@) you get to choose a language because of your " + reasonOfLanguageChoice);
        System.out.println("(@) choose what language you want your character to know:");
        System.out.println(Arrays.toString(Languages.values()));
        System.out.println("languages you already know : " + AlreadyKnowLanguages.toString());

        while (true){
            String input = scanner.nextLine();
            boolean isLanguage = false;
            for(Languages language : Languages.values()){
                if(input.toLowerCase().toLowerCase().equals(language.name().toLowerCase())){
                    if(AlreadyKnowLanguages.contains(language)){
                        System.out.println("(!) your character already knows " + input);
                        isLanguage = true;
                        break;
                    } else {
                        System.out.println("(@) adding " + language);
                        return language;
                    }
                }
            }
            if(!isLanguage){
                System.out.println("(!) that is not a language. Try again");
            }

        }

    }
}
