// Counting duplicate characters:
// Write a program that counts duplicate
// characters from a given string.

import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string of characters: ");
        char[] str = input.nextLine().toCharArray();
        ArrayList<Character> duplicate = new ArrayList<>();
        System.out.println(Arrays.toString(str));
        int count;
        for (int i = 0; i < str.length; i++) {
            count = 1;
            if (duplicate.contains(Character.toUpperCase(str[i]))) {
                continue;
            }
            for (int j = i + 1; j < str.length; j++) {
                if (Character.toUpperCase(str[i]) == Character.toUpperCase(str[j])) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str[i] + " is a duplicate character, " +
                        "and appears " + count + " times.");
                duplicate.add(Character.toUpperCase(str[i]));
            }
        }
    }
}