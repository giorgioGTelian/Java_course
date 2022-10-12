package en.codegym.task.pro.task03.task0304;

import java.util.Scanner;

/*
Let's take your temperature
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;
                        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //write your code here
        isHigh =  (bodyTemperature  > 37);
        isLow = (bodyTemperature < 36);
        if ( isHigh ) {
            System.out.println("Body temperature is high");
        } else if (isLow) {
            System.out.println("Body temperature is low");
        } else {
            System.out.println("Body temperature is normal");
        }
    }
}
        
