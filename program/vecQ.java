
import java.util.Scanner;
import java.util.Vector;

public class vecQ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        v.addElement(5);
        v.addElement(6);
        v.addElement(7);
        v.addElement(8);
        v.addElement(9);
        v.addElement(1);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
        System.out.println("enter the index to remove the element :  ");
        int index = sc.nextInt();
        v.removeElementAt(index);
        System.out.println("element removed are : " + v.elementAt(index));

        sc.close();
    }
}
