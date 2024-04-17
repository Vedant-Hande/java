// class student {
//     String name;

//     student() {
//         name = "vedant";
//     }

//     void display() {
//         System.out.println("name : " + name);
//     }
// }

// public class overriding_demo extends student {
//     // @Override
//     // void display() {
//     // System.out.println(super.name);
//     // }
//     @Override
//     void display() {

//         super.display();
//     }

//     public static void main(String[] args) {
//         overriding_demo d1 = new overriding_demo();
//         d1.display();
//     }
// }
/**
 * Inneroverriding_demo
 */
class car1 {

    int speed = 180;

    int show() {
        return speed;
    }
}

class car2 extends car1 {
    @Override
    int show() {

        return super.show();
    }

}

public class overriding_demo {
    public static void main(String[] args) {
        car2 c = new car2();
        System.out.println(c.show());
    }

}
