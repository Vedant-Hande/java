import java.util.*;

class employee {
    Scanner sc = new Scanner(System.in);
    int emp_id;
    String name;
    float salary;

    void setdata() {
        emp_id = sc.nextInt();
        name = sc.next();
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
        employee[] e = new employee[3];
        for (int i = 0; i < 3; i++) {
            e[i] = new employee();
            e[i].setdata();

        }
        for (int i = 0; i < 3; i++) {
            e[i].getdata();

        }

    }

}
