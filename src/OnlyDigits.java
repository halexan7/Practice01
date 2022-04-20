//This program checks whether the given string
//contains only digits.

import java.util.*;


public class OnlyDigits {
    public static void main(String[] args) {
//        Protected int
        char[] characters;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string of characters, " +
                "this program will check if the string is all digits: ");
        characters = input.nextLine().toCharArray();
        int count = 0;
        searchInput(characters, count);
        if (count > 0){
            System.out.println("Your string doesn't only have digits.");
            System.exit(0);
        }
        System.out.println("Your string only contains digits.");
    }

    public static int searchInput(char[] characters, int count){
        for (int i = 0; i < characters.length; i++){
            if (!(Character.isDigit(characters[i]))){
                count++;
            }
        }
        return count;
    }
}
