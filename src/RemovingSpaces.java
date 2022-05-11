/**
 * This program removes white space between characters
 */

import java.util.*;

public class RemovingSpaces {
    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string of characters: ");
        str = input.nextLine();
        System.out.println("Here is your entry without any" +
                " spaces between the characters: " + str.replaceAll(" ",""));
    }
}
