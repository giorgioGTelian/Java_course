import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //System.out.println("stack.empty()");

        //we create our stack
        Stack<String> stack = new Stack<String>();

        // we fill our stack
        stack.push("Minecraft");
        stack.push("skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");


        stack.pop(); //to remove the first obj in our stack

        String myFavGame = stack.pop(); // pop and assign to something

        stack.peek(); //we could use peek instead bc it doesnt remove anything

        stack.search("skyrim");  //to search something
        for (int i = 0; i < 10000; i++) {
            stack.push("fallout76");
        }
    }
}
