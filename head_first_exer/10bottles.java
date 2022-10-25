public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int bottlesNum =10;
        String word = "bottles";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle"; //singular
            }
            System.out.println(bottlesNum + " green " + word + " hanging");
            System.out.println(bottlesNum + " green" + word + " hanging");
            System.out.println(" and fall");
            bottlesNum = bottlesNum -1;

            if (bottlesNum == 0) {
                System.out.println("there'll be " + bottlesNum + " green " + word + " hanging");
                System.out.println(" the end");
            }


        }
    }
}
// for the 99 version just change the int bottleNum to 99 and set the real words into sout statements
