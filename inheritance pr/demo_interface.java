import java.util.Scanner;
interface demo1 {
  public float per_cal();

}
public class demo_interface implements demo1 {
  Scanner sc = new Scanner(System.in);
  int size = sc.nextInt();
  int marks[] = new int[size];

  void set_marks() {
    for (int i = 0; i < size; i++) {
      marks[i] = sc.nextInt();
    }
  }
  public float per_cal() {
    float total = 0;
    for (int i = 0; i < size; i++) {
      total += marks[i] / size;
    }
    return total;
  }
  public static void main(String[] args) {
    demo_interface d = new demo_interface();
    d.set_marks();
    System.out.println("total persentage of vedant is = " + d.per_cal());
  }
}
