
public class marks {
    public static void main(String[] args) {
        int marks[] = new int[3];
        // int arr[] = new int [3];
        try {

            marks[0] = 89;
            marks[1] = 98;
            marks[2] = 90;
            marks[3] = 80;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println();
            System.out.println(ex.toString());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
