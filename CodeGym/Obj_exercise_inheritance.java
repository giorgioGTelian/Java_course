//fet's say your program needs to store the coordinates of 100 points and needs a method to display them on the screen. 
// This can be done using arrays. For example, like this:



class Solution
{
   public static void printPoints(int[] x, int[] y, int[] color)
   {
     for (int i = 0; i < x.length; i++)
       System.out.println("Color of (" + x[i] + ", " + y[i] + ") = " + color[i]);
   }

   public static void main(String[] args)
   {
     int[] x = new int[100];
     int[] y = new int[100];
     int[] color = new int[100];
     printPoints(x, y, color);
   }
}

//It would be much more convenient if we had a single type for storing all of the information about a point: x, y, color.
//If such a type doesn't exist in Java, you can create it yourself.

// To do this, we'll write code for a Point class:

public class Point
{
   public int x;
   public int y;
   public int color;
}

// now the code can be rewritten:

class Solution
{
   public static void printPoints(Point[] points)
   {
     for (int i = 0; i < points.length; i++)
       System.out.println("Color of (" + points[i].x + ", " + point[i].y + ") = " + points[i].color);
   }

   public static void main(String[] args)
   {
     Point[] data = new Point[100];
     for (int i = 0; i < data.length; i++)
       data[i] = new Point();
     printPoints(data);
   }
