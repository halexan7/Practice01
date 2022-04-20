// This program reverses the letters in words
// then reverses the words in a string
// Uses .split() method to recognize words in string

import java.util.*;

public class LettersAndWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str;
        ArrayList<String> reverse = new ArrayList<>();
        System.out.println("Please enter a String of characters: ");
        str = input.nextLine();
        List<String> rev = Arrays.asList(str.split(" "));
        System.out.println(rev);
        System.out.println(rev.size());
        for (int x = 0; x < rev.size(); x++){
            String temp = "";
            for (int j = rev.get(x).length(); j > 0; j--){
                temp += rev.get(x).charAt(j-1);
            }
            reverse.add(temp);
            if (x == rev.size()- 1){
                    for (int j = reverse.size() - 1; j > -1; j--) {
                        System.out.print(reverse.get(j) + " ");
                    }
            }
        }
    }
}
