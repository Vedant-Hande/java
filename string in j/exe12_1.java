import java.util.Scanner;

public class exe12_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int size = sc.nextInt();
        System.out.println("enter the string s : ");
        String array[] = new String[5];

        int lento = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = sc.next();
            lento += array[i].length();
        }
        System.out.println(lento);
        sc.close();

        // int size = sc.nextInt();
        System.out.println("enter the string s : ");

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextLine();
            lento += array[i].length();// if we use the + op at end of = than wrong out
        }
        System.out.println(lento);
        sc.close();

    }
}
