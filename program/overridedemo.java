package program;

class phone {
    void music() {
        System.out.println("hye am the method of A class");
    }

    void on() {
        System.out.println("turing on the phone");
    }
}

class smartphone extends phone {
    // super.music();

    @Override
    void on() {
        System.out.println("turing on the smartphone ");
    }

}

public class overridedemo {
    public static void main(String[] args) {
        phone obj = new smartphone();
        // smartphone obj1 = new phone(); not allowed
        obj.music();
        obj.on();
        System.out.println("music meth of sp class : \n");
        smartphone sp = new smartphone();
        sp.music();

        // obj.music();not allowwed

    }
}
