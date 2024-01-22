public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        int i, j;
        // upper half
        for (i = 0; i <= n; i++) {
            // 1st part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            int space = 2 * (n - i);
            for (j = 1; j <= space; j++) {

                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 
        for (i = n; i >= 1; i--) {
            // 1st part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            int space = 2 * (n - i);
            for (j = 1; j <= space; j++) {

                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
