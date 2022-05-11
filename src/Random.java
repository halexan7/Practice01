/**
 * This is practice using the Math.random
 */

import java.util.*;

public class Random {
    public static void main(String[] args){
        //regular math.random() with 2 numbers after the decimals
        for (int i = 0; i < 5; i++){
            double r1 = Math.random();
            System.out.printf("%.2f\n", r1);
        }

        double minReal = 1.07;
        double maxReal = 2.28;
        double r2 = minReal + Math.random() * (maxReal - minReal);
        System.out.printf("%.2f\n", r2);

        int min = 1;
        int max = 6;

        double r3 = min + (int)(Math.random() * (max - min + 1));
        System.out.println(r3);

        int twoDice = (int) (r3 + r3);
        System.out.println(twoDice);
    }
}
