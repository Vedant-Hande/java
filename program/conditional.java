// package p;
import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("enter the number -");
        a= sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even ");
            System.out.println(a);
        } else {
            System.out.println("Number is odd");
            System.out.println(a);
        }
        sc.close();
    }
}
