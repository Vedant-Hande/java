package program;
public class pattren1 {
    public static void main(String[] args) {
        byte i, j;
        for (i = 1; i <= 5; i++) {
            System.out.println();
            for (j = 5; j >= i; j--) {
                System.out.print(i + " ");

            }
        }
    }
}
