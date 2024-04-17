import java.util.*;

class employee {
    Scanner sc = new Scanner(System.in);
    int emp_id;
    String name;
    float salary;

    void setdata() {
        System.out.println("enter emp id");
        emp_id = sc.nextInt();
        System.out.println("enter emp name");
        name = sc.next();
        System.out.println("enter emp salary");
        salary = sc.nextFloat();

    }

    void getdata() {
        System.out.println("emp_id : " + emp_id);
        System.out.println("name : " + name);
        System.out.println("salary :" + salary);
    }
}

class arr_obj extends employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        employee[] e = new employee[size];
        for (int i = 0; i < size; i++) {
            e[i] = new employee();
            e[i].setdata();
        }
        for (int i = 0; i < size; i++) {
            e[i].getdata();

        }

        sc.close();
    }

}
