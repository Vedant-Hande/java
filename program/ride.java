
// the simple prog  {overriding}
class Vehicle {
    int maxSpeed = 120;

    void display() {
        System.out.println(maxSpeed);
    }
}

class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        System.out.println("Maximum Speed: " + super.maxSpeed);
        super.display();
    }
}

public class ride {
    public static void main(String[] args) {
        Car small = new Car();
        small.display(); // Output: Maximum Speed: 120
    }
}
