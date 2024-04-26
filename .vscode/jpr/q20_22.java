class car1 {
    int speed = 180;

    void car() {
        System.out.println("speed " + speed);
    }
}

class car2 extends car1 {
    int speed = 120;

    @Override
    void car() {
        super.car();
    }
}

class q20_22 {
    public static void main(String[] args) {

        car2 c = new car2();
        c.car();

    }
}
