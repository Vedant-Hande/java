import java.util.Scanner;
import java.util.Vector;

public class vector_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<String> v = new Vector<String>(5);
        v.addElement("1");
        v.addElement("vedant");
        v.addElement("523");
        v.addElement("s");
        v.addElement("vfv");

        System.out.println("the size of vector - " + v.size());
        for (int i = 0; i < v.size(); i++) {
            System.out.println("vector element at index " + (i + 1) + " is = " + v.elementAt(i));

        }
        v.removeElementAt(4);
        v.insertElementAt("vedant", 1);
        System.out.println(v.elementAt(1));
        sc.close();
    }
}
