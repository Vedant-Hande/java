
class student {
    int l, b, a;

    student(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int area() {
        a = l * b;
        return a;
    }

    void show() {
        System.out.println("area is : " + area());
    }
}

public class nested_cons {
    public static void main(String[] args) {
        student s1 = new student(10, 20);
        s1.show();
    }
}
