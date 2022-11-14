//                                                                  access1.java : 
package package1;

public class Access1 {
    //public Object hours;

    //default, public, private and protected
    // if we change public to private other files don't see them
    public int hours = 3;
    public int minutes = 47;
}


//                                                                 main.java : 
import package1.Access1;

public class Main {

        public static void main(String[] args) {
            //System.out.println("Hello world!");
            package1.Access1 a = new Access1();
            System.out.println(a.hours);
            System.out.println(a.minutes);

    }
}
