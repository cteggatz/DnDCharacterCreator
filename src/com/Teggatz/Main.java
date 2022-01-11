package com.Teggatz;

import com.Teggatz.CharacterTraits.Enums.Alignments;
import com.Teggatz.CharacterTraits.Race.Races.Elves.HighElf;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.Teggatz.UniversalMethods;

import static com.Teggatz.UniversalMethods.chooseLanguage;

public class Main {

    public static String[] divider = {"--------","----------------","--------------------------------"};
    public static String[] commandList = {"info", "create character", "list characters"};
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Character> characters = new ArrayList<Character>();

    public static void main(String[] args) {
        Character e = new Character("bob", new HighElf(), 10, 10, 10, 10, 10, 10, Alignments.CE);
        e.DumpCharacterInfo();
        //characterCreator();
    }

    public static void characterCreator(){
        System.out.print(divider[1] + "\n" +
                "welcome to Teggatz's D&D character creator!\n"
                + "I am hoping this will be a easy way for people to make D&D characters\n"
                + "but honestly its most likely going to be some useless project\n");
        System.out.println(divider[1] + "\n" + "here are a list of commands you can use: ");

        while(true) {
            System.out.println(divider[2]);
            listCommands();
            switch(scanner.nextLine().toLowerCase().trim().replace(" ", "")){
                case "info":
                    System.out.println("eeeee");
                    break;
                case "createcharacter":
                    createCharacter();
                    break;
                case "listcharacters":
                    listCharacters();
                    break;
                default:
                    System.out.println("that is not an option");
            }
        }
    }
    public static void listCommands(){
        System.out.print("[");
        for(String i : commandList){
            if(Arrays.asList(commandList).indexOf(i) == commandList.length-1){
                System.out.print(i +"]");
            } else {
                System.out.print(i +", ");
            }
        }
        System.out.println();
    }

    public static void createCharacter(){
        System.out.println(divider[2]);
        System.out.println("time to create a character!");

        System.out.println("() What is their name?");
        String name = scanner.nextLine();
        System.out.println("() what is their race?");


        //characters.add(new Character(name));
        System.out.println(name +" has been created");
    }

    public static void listCharacters(){
        if(characters.size() == 0){
            System.out.println("you have no characters");
        } else {
            System.out.println("here are your characters");
            for(Character i : characters){
                System.out.println(i.name);
            }
        }

    }
}


