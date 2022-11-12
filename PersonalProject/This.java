public class ThisIsFun {
  int a;
  int b;
  
  public void SetData (int a, int b) {
  this.a = a;
  this.b = b;
  }
  
  public static void main(String[] args) {
  t.setData(4, 3);
    
    ThisIsFun t = new ThisIsFun();
    
    System.out.print(t.a);
    System.out.println(t.b);
  }
  
}
