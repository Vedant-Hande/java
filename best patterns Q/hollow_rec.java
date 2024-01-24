public class hollow_rec {
    public static void main(String[] args) {
        int n = 4, m = 5;
        int i, j;
        // outer loop row
        for (i = 1; i <= n; i++) {
            // inner loop column
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//sarthak machhindra hande sam8888*