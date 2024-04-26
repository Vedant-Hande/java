interface c_area {
    public void Accept();

    public void display();
}

interface r_area {
    public void input();

    public void output();
}

class q25 implements c_area, r_area {
    float r, l, w;

    public void Accept() {
        r = 22.23f;
    }

    public void display() {
        System.out.println("area of circle - " + (3.14 * r * r));
    }

    public void input() {
        l = 25;
        w = 30;
    }

    public void output() {
        System.out.println("area of circle - " + (l * w));
    }

    public static void main(String[] args) {
        q25 i = new q25();
        i.Accept();
        i.input();
        i.display();
        i.output();
    }
}
