// This program takes a given string
// and turns it into an int, long, float, double

import java.util.*;


public class Converting {

    public static void main(String[] args){
        String str = takInput();
        if (testDouble(str)){
            System.out.println("Your input has been converted to a double.");
            System.exit(0);
        }
        if (testInt(str)){
            System.out.println("Your input has been converted to an int.");
            System.exit(0);
        }
        if (testLong(str)){
            System.out.println("Your input has been converted to a long.");
            System.exit(0);
        }
        if (testFloat(str)){
            System.out.println("Your input has been converted to a float.");
            System.exit(0);
        }
        else {
            System.out.println("Your entry is not a number.");
            System.exit(0);
        }

    }

    public static String takInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you would like converting: ");
        String str = input.nextLine();
        return str;
    }

    public static boolean testInt(String str){
        try
        {
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

    public static boolean testDouble(String str){
        try
        {
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

    public static boolean testFloat(String str){
        try
        {
            Float.parseFloat(str);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }

    }

    public static boolean testLong(String str){
        try
        {
            Long.parseLong(str);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

}
