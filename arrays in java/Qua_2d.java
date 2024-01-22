import java.util.*;

public class Qua_2d {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and columns : ");
        int a = sc.nextInt(), b = sc.nextInt();
        int x = 25;
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] == x) {
                    System.out.print("element is find at location : " + i + "," + j);
                } 
            }
            System.out.println();
        }
    }

}
