//5. Write a function that takes in the radius as input and returns the circumference of a circle.
//formula [2*3.14*radius]

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
      int radius;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the radis of circle : ");
      radius = sc.nextInt();
      System.out.println("the circumfarance of an circl is  : "+(2*3.14*radius));
      sc.close();  
    }
}
