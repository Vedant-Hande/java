
import java.util.*;

public class exvec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        Vector<String> v = new Vector<String>(size);
        System.out.println("Enter the vector elements : 1");
        for (int i = 0; i < size; i++) {
            v.addElement(sc.nextLine());
        }
        System.out.println("vector element s are = ");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
        sc.close();
    }
}
