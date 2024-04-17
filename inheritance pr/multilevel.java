import java.util.Scanner;

class dad {
    Scanner sc = new Scanner(System.in);
    String name_dad;
    int age_dad;

    void set_dad() {
        System.out.println("enter the name of dad -");
        name_dad = sc.nextLine();
        System.out.println("enter the age of dad -");
        age_dad = sc.nextInt();

    }

}

class mom extends dad {
    String name_mom;
    int age_mom;

    void set_mom() {
        System.out.println("enter the name of mom -");
        name_mom = sc.nextLine();
        System.out.println("enter the age of mom -");
        age_mom = sc.nextInt();
    }

}

class child extends mom {
    String name_child;
    int age_child;

    void set_child() {
        System.out.println("enter the name of child -");
        name_child = sc.nextLine();
        System.out.println("enter the age of dad -");
        age_child = sc.nextInt();
    }

    void get_details() {
        System.out.println("name of dad - " + name_dad);
        System.out.println("name of mom - " + name_mom);
        System.out.println("name of child - " + name_child);
        System.out.println("age of dad - " + age_dad);
        System.out.println("age of mom - " + age_mom);
        System.out.println("age of child - " + age_child);
    }
}

public class multilevel {
    public static void main(String[] args) {
        child c = new child();
        c.set_dad();
        c.set_mom();
        c.set_child();
        c.get_details();
    }
}
