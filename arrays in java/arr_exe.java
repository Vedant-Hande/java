
import java.util.Scanner;

public class arr_exe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String names[][] = new String[5][6];
        // syntax--
        // datatype array_name [][]= new datatype [size][size];


        String[] names1 = new String[size];

        // input
        for (int i = 0; i < size; i++) {
            names1[i] = names1[i];
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }
        sc.close();
    }
}
// int per = (m1+m2)*100/2