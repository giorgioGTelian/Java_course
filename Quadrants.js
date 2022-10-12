package en.codegym.task.pro.task03.task0308;

import java.util.Scanner;

/*
Quadrants
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        if ((x > 0)&&(y > 0)){
                System.out.println("1");
            }if  ((x < 0) && (y>0)){
                System.out.println("2");
            }if  ((x < 0) && (y<0)){
                System.out.println("3");
            } else if ((x >0)&&(y <0) ){
                        System.out.println("4");
                    }
    }                            
}
            
