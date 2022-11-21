// main method :
public class Main {
    public static void main(String[] args) {
    Mouse1 m1 = new Mouse1(); //create obj and calling the classes

    m1.leftClick();
    m1.rightClick();
    }
}

//Mouse1 

public class Mouse1 extends mouse { //extends mouse it means it take the methods from mouse
    String texture = "matte";

     public static void setColor(String color) {
         System.out.println(color);
     }
}

//mouse2

public class mouse2 extends mouse {

     public static void connect() {
        System.out.println("connect");
    }
}

//mouse3

public class mouse3 extends mouse{

    boolean ambidextrous = true;
}

//mouse 

public class mouse {

    public static void leftClick() {
        System.out.println("click!");
    }

    public static void rightClick() {
        System.out.println("click!");
    }

}
