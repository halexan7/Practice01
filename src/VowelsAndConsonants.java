//This program sorts through a given String
//counts the number of vowels and consonants

import java.util.*;


public class VowelsAndConsonants {
    public static void main(String[] args){
        char [] characters;
        char[] vowels = new char[] {'a','e','i','o','u'};
        int vTotal, cTotal;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a string of " +
                "character for the program to check: ");
        characters = input.nextLine().toCharArray();
        vTotal = vowels(characters, vowels);
        cTotal = consonants(characters, vowels);
        System.out.println("Your string has " + vTotal + " vowels.");
        System.out.println("Your string also has " + cTotal + " consonants.");
    }

    public static int vowels(char[] characters, char[] vowels){
        int count = 0;
        for (int i = 0; i < characters.length; i++){
            for (int j = 0; j < vowels.length; j++) {
                if (characters[i] == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int consonants(char[] characters, char[] vowels){
        int count = 0;
        for (int i = 0; i < characters.length; i++){
            int total = 0;
            for (int j = 0; j < vowels.length; j++) {
                if (characters[i] == vowels[j]) {
                    total++;
                }
            }
            if (total == 0){
                count++;
            }
        }
        return count;
    }
}
