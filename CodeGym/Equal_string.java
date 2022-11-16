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

//// another method

public boolean equals(Object anObject) {    
      if (this == anObject) {    
          return true;    
      }    
      if (anObject instanceof String) {    
          String anotherString = (String) anObject;    
          int n = value.length;    
          if (n == anotherString.value.length) {    
              char v1[] = value;    
              char v2[] = anotherString.value;    
              int i = 0;    
              while (n-- != 0) {    
                  if (v1[i] != v2[i])    
                          return false;    
                  i++;    
              }    
              return true;    
          }    
      }    
      return false;    
  }    

