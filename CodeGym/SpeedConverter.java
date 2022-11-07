public class main {

 public static void main(String[] args) {
        double kilometersPerHour = 2.55;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
        //System.out.println("Hello world!");
        }


    private static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }else
            Math.round(kilometersPerHour);
        return 0;
    }

    private static void printConversion(double kilometersPerHour){
        double milesPerHour = kilometersPerHour * 0.621;
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
}
