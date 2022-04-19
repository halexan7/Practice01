// This program prints out the 1st
// non-repeated character in a given string

import java.util.*;

public class NonRepeated {
    public static void main(String[] args) {
        int count = 1;
        Scanner input = new Scanner(System.in);
        ArrayList<Character> duplicate = new ArrayList<>();
        System.out.println("Please enter a string of characters: ");
        char[] str = input.nextLine().toCharArray();
        System.out.println("You entered: " + Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (duplicate.contains(Character.toUpperCase(str[i]))) {
                    count = 2;
                    continue;
                }
                if (Character.toUpperCase(str[i]) == Character.toUpperCase(str[j])) {
                    count++;
                    duplicate.add(Character.toUpperCase(str[i]));
                    break;
                }
            }
            if (count == 1) {
                System.out.println("You're 1st non repeated " +
                        "character is: " + str[i]);
                break;
            }
        }
    }
}
