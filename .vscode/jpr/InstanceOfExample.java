class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Creating an instance of Dog
        if (animal instanceof Dog) {
            System.out.println("The animal is a Dog");
        } else {
            System.out.println("The animal is not a Dog");
        }

        animal = new Cat(); // Creating an instance of Cat
        if (animal instanceof Cat) {
            System.out.println("The animal is a Cat");
        } else {
            System.out.println("The animal is not a Cat");
        }

        // Using instanceof with null reference
        animal = null;
        if (animal instanceof Animal) {
            System.out.println("The reference is pointing to an Animal object");
        } else {
            System.out.println("The reference is not pointing to an Animal object");
        }
    }
}
