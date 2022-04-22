// This program takes an input string and counts the occurrence
// of a specific character from the string given by the user

import java.util.*;

public class CertainCharacter {

    public static void main(String[] args){
        char[] characters = takeInput();
        char select = selection();
        int count = characterOccurrence(characters, select);
        System.out.println("The character you selected showed up " + count + " times.");
        System.exit(0);
    }

    public static char[] takeInput(){
        Scanner input = new Scanner(System.in);
        char[] characters;
        System.out.println("Please enter a string of " +
                "character to be checked");
        characters = input.nextLine().toCharArray();
        return characters;
    }

    public static char selection(){
        Scanner input = new Scanner(System.in);
        char selection;
        System.out.println("Please enter a character " +
                "you would like to check for");
        selection = input.next().charAt(0);
        return selection;
    }

    public static int characterOccurrence(char[] characters, char selection){
        int count = 0;
        for (int i = 0; i < characters.length; i++ ){
            if (characters[i] == selection){
                count++;
            }
        }
        return count;
    }
}
