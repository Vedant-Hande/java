
import java.util.Scanner;

public class arrexpnest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        System.out.println("enter the index to divide he number : ");
        int ind = sc.nextInt();
        System.out.println("enter the number to divide the array number : ");
        int num = sc.nextInt();
        try {

            int res = marks[ind] / num;
            System.out.println("after divide the num is : " + res);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmatic Expection is occures! ");
            System.out.println(ex);
            System.out.println("using 'getMassage()' Method - " + ex.getMessage());
            System.out.println("using 'toString()' Method - " + ex.toString());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index bound Expection is occurse! ");
            System.out.println(ex);
            System.out.println("using 'getMassage()' Method - " + ex.getMessage());
            System.out.println("using 'toString()' Method - " + ex.toString());
        } finally {
            System.out.println("end of the program ");
        }
        sc.close();
    }
}