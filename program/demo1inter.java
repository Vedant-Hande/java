package program;
// Interface declaration: by first user  
interface Drawable {
    void draw();
}

// Implementation: by second user
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

// Using interface: by third user
class demo1inter {

    public static void main(String args[]) {
        Drawable d = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
        Drawable d1 = new Rectangle();// In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
        d1.draw();
    }
}
