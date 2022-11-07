import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Random rand = new Random();
        int day = rand.nextInt(7) + 1;
        
//        if(day == 1) {
//            System.out.println("Sunday");
//        } else if (day == 2) {
//            System.out.println("Monday");
//        }
        switch (day) {
            case 1:
                System.out.println("sunday "+ day);
                break;
            case 2:
                System.out.println("monday "+ day);
                break;
            case 3:
                System.out.println("Tuesd "+ day);
                break;
            case 4:
                System.out.println("wedsday " + day);
                break;
            case 5:
                System.out.println("thurs "+ day);
                break;
            case 6:
                System.out.println("frida "+ day);
                break;
            case 7:
                System.out.println("saturday "+ day);
                break;
            default:
                System.out.println("not a valid number"+ day);
        }
    }
}
