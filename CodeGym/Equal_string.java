// These two have the same value
new String("test").equals("test") // --> true 

// ... but they are not the same object
new String("test") == "test" // --> false 

// ... neither are these
new String("test") == new String("test") // --> false 

// ... but these are because literals are interned by 
// the compiler and thus refer to the same object
"test" == "test" // --> true 

// ... string literals are concatenated by the compiler
// and the results are interned.
"test" == "te" + "st" // --> true

// ... but you should really just call Objects.equals()
Objects.equals("test", new String("test")) // --> true
Objects.equals(null, "test") // --> false
Objects.equals(null, null) // --> true
  
package en.codegym.task.pro.task06.task0607
/* 
welcome but not everyone!  
*/

public class Solution {

}

public static void main(String[] args) {
}

public static void SignIn(String username) {

if (username.equals("user")) {
  return;
  } else {
  System.out.println("test");
  }
 }
}


