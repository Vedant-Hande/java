import java.util.*;

public class number_2d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2d array : \n rows : ");
        int rows = sc.nextInt();
        //System.out.print("columns : ");
        int column = sc.nextInt();
        int number[][] = new int[rows][column];

        // input
        // row
        for (int i = 0; i < rows; i++) {
            // column
            for (int j = 0; j < column; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("output : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
