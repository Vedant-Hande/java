import java.util.Scanner;

class employee {
    Scanner sc = new Scanner(System.in);
    String name;
    int basic;
    float da, hra, gross;

    void setdata() {
        System.out.println("enter the name :");
        name = sc.nextLine();
        System.out.println("enter the basic salary :");
        basic = sc.nextInt();
    }

    void getdata() {
        da = (75 * basic) / 100;
        hra = (30 * basic) / 100;
        gross = (da + hra + basic);
        System.out.println(" gross salary is = " + gross);
    }
}

class q12 {
    public static void main(String[] args) {

        employee e1 = new employee();
        e1.setdata();
        e1.getdata();
    }
}
