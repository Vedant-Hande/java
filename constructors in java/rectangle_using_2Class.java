class rectangle_using_2num {
    int l, b;

    rectangle_using_2num() {
        l = 135;
        b = 12;
    }

    void getdata() {
        System.out.println("area of rectangle : " + (l * b));
    }
}

public class rectangle_using_2Class {

    public static void main(String[] args) {
        rectangle_using_2num rect1 = new rectangle_using_2num();
        rect1.getdata();

    }
}
