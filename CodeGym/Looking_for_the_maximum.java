package en.codegym.task.pro.task03.task0309;
        
import java.util.Scanner;

/* 
Looking for the maximum
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();   
        int number = (numberA > numberB) ? numberA : numberB;  
        
            System.out.println(number);
      
    }
}
